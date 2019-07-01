package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * TimelineProcessDTO
 */
@Validated
public class TimelineProcessDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("ProductName")
  private String productName = null;

  @JsonProperty("Operations")
private List<TimelineProcessOperationDTO> operations = null;

  public TimelineProcessDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TimelineProcessDTO productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  **/
public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public TimelineProcessDTO operations(List<TimelineProcessOperationDTO> operations) {
    this.operations = operations;
    return this;
  }

  public TimelineProcessDTO addOperationsItem(TimelineProcessOperationDTO operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<TimelineProcessOperationDTO>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
  **/


  public List<TimelineProcessOperationDTO> getOperations() {
    return operations;
  }

  public void setOperations(List<TimelineProcessOperationDTO> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineProcessDTO timelineProcessDTO = (TimelineProcessDTO) o;
    return Objects.equals(this.id, timelineProcessDTO.id) &&
        Objects.equals(this.productName, timelineProcessDTO.productName) &&
        Objects.equals(this.operations, timelineProcessDTO.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productName, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineProcessDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


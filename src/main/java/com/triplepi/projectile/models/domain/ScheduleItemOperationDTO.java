package com.triplepi.projectile.models.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;


/**
 * ScheduleItemOperationDTO
 */
@Validated
@Entity
public class ScheduleItemOperationDTO   {

  @Id
  @GeneratedValue
  private Long id;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("ProductName")
  private String productName = null;

  @JsonProperty("ProductId")
  private Long productId = null;

  @JsonProperty("ModeId")
  private Long modeId = null;

  @JsonProperty("OperationId")
  private Long operationId = null;

  @JsonProperty("TechnologyProcessId")
  private Long technologyProcessId = null;

  public ScheduleItemOperationDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScheduleItemOperationDTO productName(String productName) {
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

  public ScheduleItemOperationDTO productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public ScheduleItemOperationDTO modeId(Long modeId) {
    this.modeId = modeId;
    return this;
  }

  /**
   * Get modeId
   * @return modeId
  **/
public Long getModeId() {
    return modeId;
  }

  public void setModeId(Long modeId) {
    this.modeId = modeId;
  }

  public ScheduleItemOperationDTO operationId(Long operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Get operationId
   * @return operationId
  **/
public Long getOperationId() {
    return operationId;
  }

  public void setOperationId(Long operationId) {
    this.operationId = operationId;
  }

  public ScheduleItemOperationDTO technologyProcessId(Long technologyProcessId) {
    this.technologyProcessId = technologyProcessId;
    return this;
  }

  /**
   * Get technologyProcessId
   * @return technologyProcessId
  **/
public Long getTechnologyProcessId() {
    return technologyProcessId;
  }

  public void setTechnologyProcessId(Long technologyProcessId) {
    this.technologyProcessId = technologyProcessId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemOperationDTO scheduleItemOperationDTO = (ScheduleItemOperationDTO) o;
    return Objects.equals(this.name, scheduleItemOperationDTO.name) &&
        Objects.equals(this.productName, scheduleItemOperationDTO.productName) &&
        Objects.equals(this.productId, scheduleItemOperationDTO.productId) &&
        Objects.equals(this.modeId, scheduleItemOperationDTO.modeId) &&
        Objects.equals(this.operationId, scheduleItemOperationDTO.operationId) &&
        Objects.equals(this.technologyProcessId, scheduleItemOperationDTO.technologyProcessId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, productName, productId, modeId, operationId, technologyProcessId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemOperationDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    modeId: ").append(toIndentedString(modeId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    technologyProcessId: ").append(toIndentedString(technologyProcessId)).append("\n");
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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}


package com.triplepi.projectile.models.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;


/**
 * TimelineOrderBatchDTO
 */
@Validated
public class TimelineOrderBatchDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Number")
  private Integer number = null;

  @JsonProperty("Quantity")
  private Integer quantity = null;

  @JsonProperty("StartOperationId")
  private Long startOperationId = null;

  public TimelineOrderBatchDTO id(Long id) {
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

  public TimelineOrderBatchDTO number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public TimelineOrderBatchDTO quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public TimelineOrderBatchDTO startOperationId(Long startOperationId) {
    this.startOperationId = startOperationId;
    return this;
  }

  /**
   * Get startOperationId
   * @return startOperationId
  **/
public Long getStartOperationId() {
    return startOperationId;
  }

  public void setStartOperationId(Long startOperationId) {
    this.startOperationId = startOperationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineOrderBatchDTO timelineOrderBatchDTO = (TimelineOrderBatchDTO) o;
    return Objects.equals(this.id, timelineOrderBatchDTO.id) &&
        Objects.equals(this.number, timelineOrderBatchDTO.number) &&
        Objects.equals(this.quantity, timelineOrderBatchDTO.quantity) &&
        Objects.equals(this.startOperationId, timelineOrderBatchDTO.startOperationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, quantity, startOperationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineOrderBatchDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    startOperationId: ").append(toIndentedString(startOperationId)).append("\n");
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


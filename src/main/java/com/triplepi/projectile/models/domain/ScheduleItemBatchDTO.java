package com.triplepi.projectile.models.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


/**
 * ScheduleItemBatchDTO
 */
@Validated
@Entity
public class ScheduleItemBatchDTO   {
  @JsonProperty("Id")
  @Id
  private Long id = null;

  @JsonProperty("Number")
  private Integer number = null;

  @JsonProperty("Quantity")
  private Integer quantity = null;

  @JsonProperty("FactQuantity")
  private Integer factQuantity = null;

  @JsonProperty("OrderId")
  private Long orderId = null;

  @JsonProperty("OrderNumber")
  private String orderNumber = null;

  @JsonProperty("StartOperationId")
  private Long startOperationId = null;

  public ScheduleItemBatchDTO id(Long id) {
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

  public ScheduleItemBatchDTO number(Integer number) {
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

  public ScheduleItemBatchDTO quantity(Integer quantity) {
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

  public ScheduleItemBatchDTO factQuantity(Integer factQuantity) {
    this.factQuantity = factQuantity;
    return this;
  }

  /**
   * Get factQuantity
   * @return factQuantity
  **/
public Integer getFactQuantity() {
    return factQuantity;
  }

  public void setFactQuantity(Integer factQuantity) {
    this.factQuantity = factQuantity;
  }

  public ScheduleItemBatchDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public ScheduleItemBatchDTO orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * Get orderNumber
   * @return orderNumber
  **/
public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public ScheduleItemBatchDTO startOperationId(Long startOperationId) {
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
    ScheduleItemBatchDTO scheduleItemBatchDTO = (ScheduleItemBatchDTO) o;
    return Objects.equals(this.id, scheduleItemBatchDTO.id) &&
        Objects.equals(this.number, scheduleItemBatchDTO.number) &&
        Objects.equals(this.quantity, scheduleItemBatchDTO.quantity) &&
        Objects.equals(this.factQuantity, scheduleItemBatchDTO.factQuantity) &&
        Objects.equals(this.orderId, scheduleItemBatchDTO.orderId) &&
        Objects.equals(this.orderNumber, scheduleItemBatchDTO.orderNumber) &&
        Objects.equals(this.startOperationId, scheduleItemBatchDTO.startOperationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, quantity, factQuantity, orderId, orderNumber, startOperationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemBatchDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    factQuantity: ").append(toIndentedString(factQuantity)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
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


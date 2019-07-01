package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * ScheduleItemDetailedDTO
 */
@Validated
public class ScheduleItemDetailedDTO   {
  @JsonProperty("product")
  private String product = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("batch")
  private Integer batch = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("process")
  private String process = null;

  @JsonProperty("operationOrder")
  private Integer operationOrder = null;

  @JsonProperty("operationName")
  private String operationName = null;

  @JsonProperty("workCenter")
  private String workCenter = null;

  @JsonProperty("startDate")
  private LocalDateTime startDate = null;

  @JsonProperty("finishDate")
  private LocalDateTime finishDate = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("durationPerUnit")
  private Double durationPerUnit = null;

  @JsonProperty("prevBatchOperationFinishDate")
  private LocalDateTime prevBatchOperationFinishDate = null;

  @JsonProperty("prevWorkCenterOperationFinishDate")
  private LocalDateTime prevWorkCenterOperationFinishDate = null;

  @JsonProperty("workCenterDelay")
  private String workCenterDelay = null;

  public ScheduleItemDetailedDTO product(String product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public ScheduleItemDetailedDTO order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public ScheduleItemDetailedDTO batch(Integer batch) {
    this.batch = batch;
    return this;
  }

  /**
   * Get batch
   * @return batch
  **/
public Integer getBatch() {
    return batch;
  }

  public void setBatch(Integer batch) {
    this.batch = batch;
  }

  public ScheduleItemDetailedDTO quantity(Integer quantity) {
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

  public ScheduleItemDetailedDTO process(String process) {
    this.process = process;
    return this;
  }

  /**
   * Get process
   * @return process
  **/
public String getProcess() {
    return process;
  }

  public void setProcess(String process) {
    this.process = process;
  }

  public ScheduleItemDetailedDTO operationOrder(Integer operationOrder) {
    this.operationOrder = operationOrder;
    return this;
  }

  /**
   * Get operationOrder
   * @return operationOrder
  **/
public Integer getOperationOrder() {
    return operationOrder;
  }

  public void setOperationOrder(Integer operationOrder) {
    this.operationOrder = operationOrder;
  }

  public ScheduleItemDetailedDTO operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * Get operationName
   * @return operationName
  **/
public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  public ScheduleItemDetailedDTO workCenter(String workCenter) {
    this.workCenter = workCenter;
    return this;
  }

  /**
   * Get workCenter
   * @return workCenter
  **/
public String getWorkCenter() {
    return workCenter;
  }

  public void setWorkCenter(String workCenter) {
    this.workCenter = workCenter;
  }

  public ScheduleItemDetailedDTO startDate(LocalDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/


  public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public ScheduleItemDetailedDTO finishDate(LocalDateTime finishDate) {
    this.finishDate = finishDate;
    return this;
  }

  /**
   * Get finishDate
   * @return finishDate
  **/


  public LocalDateTime getFinishDate() {
    return finishDate;
  }

  public void setFinishDate(LocalDateTime finishDate) {
    this.finishDate = finishDate;
  }

  public ScheduleItemDetailedDTO duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public ScheduleItemDetailedDTO durationPerUnit(Double durationPerUnit) {
    this.durationPerUnit = durationPerUnit;
    return this;
  }

  /**
   * Get durationPerUnit
   * @return durationPerUnit
  **/
public Double getDurationPerUnit() {
    return durationPerUnit;
  }

  public void setDurationPerUnit(Double durationPerUnit) {
    this.durationPerUnit = durationPerUnit;
  }

  public ScheduleItemDetailedDTO prevBatchOperationFinishDate(LocalDateTime prevBatchOperationFinishDate) {
    this.prevBatchOperationFinishDate = prevBatchOperationFinishDate;
    return this;
  }

  /**
   * Get prevBatchOperationFinishDate
   * @return prevBatchOperationFinishDate
  **/


  public LocalDateTime getPrevBatchOperationFinishDate() {
    return prevBatchOperationFinishDate;
  }

  public void setPrevBatchOperationFinishDate(LocalDateTime prevBatchOperationFinishDate) {
    this.prevBatchOperationFinishDate = prevBatchOperationFinishDate;
  }

  public ScheduleItemDetailedDTO prevWorkCenterOperationFinishDate(LocalDateTime prevWorkCenterOperationFinishDate) {
    this.prevWorkCenterOperationFinishDate = prevWorkCenterOperationFinishDate;
    return this;
  }

  /**
   * Get prevWorkCenterOperationFinishDate
   * @return prevWorkCenterOperationFinishDate
  **/


  public LocalDateTime getPrevWorkCenterOperationFinishDate() {
    return prevWorkCenterOperationFinishDate;
  }

  public void setPrevWorkCenterOperationFinishDate(LocalDateTime prevWorkCenterOperationFinishDate) {
    this.prevWorkCenterOperationFinishDate = prevWorkCenterOperationFinishDate;
  }

  public ScheduleItemDetailedDTO workCenterDelay(String workCenterDelay) {
    this.workCenterDelay = workCenterDelay;
    return this;
  }

  /**
   * Get workCenterDelay
   * @return workCenterDelay
  **/
public String getWorkCenterDelay() {
    return workCenterDelay;
  }

  public void setWorkCenterDelay(String workCenterDelay) {
    this.workCenterDelay = workCenterDelay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemDetailedDTO scheduleItemDetailedDTO = (ScheduleItemDetailedDTO) o;
    return Objects.equals(this.product, scheduleItemDetailedDTO.product) &&
        Objects.equals(this.order, scheduleItemDetailedDTO.order) &&
        Objects.equals(this.batch, scheduleItemDetailedDTO.batch) &&
        Objects.equals(this.quantity, scheduleItemDetailedDTO.quantity) &&
        Objects.equals(this.process, scheduleItemDetailedDTO.process) &&
        Objects.equals(this.operationOrder, scheduleItemDetailedDTO.operationOrder) &&
        Objects.equals(this.operationName, scheduleItemDetailedDTO.operationName) &&
        Objects.equals(this.workCenter, scheduleItemDetailedDTO.workCenter) &&
        Objects.equals(this.startDate, scheduleItemDetailedDTO.startDate) &&
        Objects.equals(this.finishDate, scheduleItemDetailedDTO.finishDate) &&
        Objects.equals(this.duration, scheduleItemDetailedDTO.duration) &&
        Objects.equals(this.durationPerUnit, scheduleItemDetailedDTO.durationPerUnit) &&
        Objects.equals(this.prevBatchOperationFinishDate, scheduleItemDetailedDTO.prevBatchOperationFinishDate) &&
        Objects.equals(this.prevWorkCenterOperationFinishDate, scheduleItemDetailedDTO.prevWorkCenterOperationFinishDate) &&
        Objects.equals(this.workCenterDelay, scheduleItemDetailedDTO.workCenterDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, order, batch, quantity, process, operationOrder, operationName, workCenter, startDate, finishDate, duration, durationPerUnit, prevBatchOperationFinishDate, prevWorkCenterOperationFinishDate, workCenterDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemDetailedDTO {\n");

    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    operationOrder: ").append(toIndentedString(operationOrder)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    workCenter: ").append(toIndentedString(workCenter)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    durationPerUnit: ").append(toIndentedString(durationPerUnit)).append("\n");
    sb.append("    prevBatchOperationFinishDate: ").append(toIndentedString(prevBatchOperationFinishDate)).append("\n");
    sb.append("    prevWorkCenterOperationFinishDate: ").append(toIndentedString(prevWorkCenterOperationFinishDate)).append("\n");
    sb.append("    workCenterDelay: ").append(toIndentedString(workCenterDelay)).append("\n");
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


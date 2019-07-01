package com.triplepi.projectile.models.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;


/**
 * TimelineDurationForBatchDTO
 */
@Validated
public class TimelineDurationForBatchDTO   {
  @JsonProperty("ProcessId")
  private Long processId = null;

  @JsonProperty("Quantity")
  private Integer quantity = null;

  @JsonProperty("OperationModeId")
  private Long operationModeId = null;

  @JsonProperty("OperationDuration")
  private Integer operationDuration = null;

  @JsonProperty("WorkCenterDuration")
  private Integer workCenterDuration = null;

  public TimelineDurationForBatchDTO processId(Long processId) {
    this.processId = processId;
    return this;
  }

  /**
   * Get processId
   * @return processId
  **/
public Long getProcessId() {
    return processId;
  }

  public void setProcessId(Long processId) {
    this.processId = processId;
  }

  public TimelineDurationForBatchDTO quantity(Integer quantity) {
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

  public TimelineDurationForBatchDTO operationModeId(Long operationModeId) {
    this.operationModeId = operationModeId;
    return this;
  }

  /**
   * Get operationModeId
   * @return operationModeId
  **/
public Long getOperationModeId() {
    return operationModeId;
  }

  public void setOperationModeId(Long operationModeId) {
    this.operationModeId = operationModeId;
  }

  public TimelineDurationForBatchDTO operationDuration(Integer operationDuration) {
    this.operationDuration = operationDuration;
    return this;
  }

  /**
   * Get operationDuration
   * @return operationDuration
  **/
public Integer getOperationDuration() {
    return operationDuration;
  }

  public void setOperationDuration(Integer operationDuration) {
    this.operationDuration = operationDuration;
  }

  public TimelineDurationForBatchDTO workCenterDuration(Integer workCenterDuration) {
    this.workCenterDuration = workCenterDuration;
    return this;
  }

  /**
   * Get workCenterDuration
   * @return workCenterDuration
  **/
public Integer getWorkCenterDuration() {
    return workCenterDuration;
  }

  public void setWorkCenterDuration(Integer workCenterDuration) {
    this.workCenterDuration = workCenterDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineDurationForBatchDTO timelineDurationForBatchDTO = (TimelineDurationForBatchDTO) o;
    return Objects.equals(this.processId, timelineDurationForBatchDTO.processId) &&
        Objects.equals(this.quantity, timelineDurationForBatchDTO.quantity) &&
        Objects.equals(this.operationModeId, timelineDurationForBatchDTO.operationModeId) &&
        Objects.equals(this.operationDuration, timelineDurationForBatchDTO.operationDuration) &&
        Objects.equals(this.workCenterDuration, timelineDurationForBatchDTO.workCenterDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processId, quantity, operationModeId, operationDuration, workCenterDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineDurationForBatchDTO {\n");

    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    operationModeId: ").append(toIndentedString(operationModeId)).append("\n");
    sb.append("    operationDuration: ").append(toIndentedString(operationDuration)).append("\n");
    sb.append("    workCenterDuration: ").append(toIndentedString(workCenterDuration)).append("\n");
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


package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * FixScheduleItemIM
 */
@Validated
public class FixScheduleItemIM   {
  @JsonProperty("StartDate")
  private LocalDateTime startDate = null;

  @JsonProperty("StartExecutionDate")
  private LocalDateTime startExecutionDate = null;

  @JsonProperty("FinishDate")
  private LocalDateTime finishDate = null;

  @JsonProperty("WorkCenterFinishDate")
  private LocalDateTime workCenterFinishDate = null;

  @JsonProperty("BatchId")
  private Long batchId = null;

  @JsonProperty("OperationId")
  private Long operationId = null;

  @JsonProperty("OperationModeId")
  private Long operationModeId = null;

  @JsonProperty("WorkCenterId")
  private Long workCenterId = null;

  public FixScheduleItemIM startDate(LocalDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/

  @NotNull

public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public FixScheduleItemIM startExecutionDate(LocalDateTime startExecutionDate) {
    this.startExecutionDate = startExecutionDate;
    return this;
  }

  /**
   * Get startExecutionDate
   * @return startExecutionDate
  **/

  @NotNull

public LocalDateTime getStartExecutionDate() {
    return startExecutionDate;
  }

  public void setStartExecutionDate(LocalDateTime startExecutionDate) {
    this.startExecutionDate = startExecutionDate;
  }

  public FixScheduleItemIM finishDate(LocalDateTime finishDate) {
    this.finishDate = finishDate;
    return this;
  }

  /**
   * Get finishDate
   * @return finishDate
  **/

  @NotNull

public LocalDateTime getFinishDate() {
    return finishDate;
  }

  public void setFinishDate(LocalDateTime finishDate) {
    this.finishDate = finishDate;
  }

  public FixScheduleItemIM workCenterFinishDate(LocalDateTime workCenterFinishDate) {
    this.workCenterFinishDate = workCenterFinishDate;
    return this;
  }

  /**
   * Get workCenterFinishDate
   * @return workCenterFinishDate
  **/

  @NotNull

public LocalDateTime getWorkCenterFinishDate() {
    return workCenterFinishDate;
  }

  public void setWorkCenterFinishDate(LocalDateTime workCenterFinishDate) {
    this.workCenterFinishDate = workCenterFinishDate;
  }

  public FixScheduleItemIM batchId(Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Get batchId
   * @return batchId
  **/

  @NotNull


  public Long getBatchId() {
    return batchId;
  }

  public void setBatchId(Long batchId) {
    this.batchId = batchId;
  }

  public FixScheduleItemIM operationId(Long operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Get operationId
   * @return operationId
  **/

  @NotNull


  public Long getOperationId() {
    return operationId;
  }

  public void setOperationId(Long operationId) {
    this.operationId = operationId;
  }

  public FixScheduleItemIM operationModeId(Long operationModeId) {
    this.operationModeId = operationModeId;
    return this;
  }

  /**
   * Get operationModeId
   * @return operationModeId
  **/

  @NotNull


  public Long getOperationModeId() {
    return operationModeId;
  }

  public void setOperationModeId(Long operationModeId) {
    this.operationModeId = operationModeId;
  }

  public FixScheduleItemIM workCenterId(Long workCenterId) {
    this.workCenterId = workCenterId;
    return this;
  }

  /**
   * Get workCenterId
   * @return workCenterId
  **/

  @NotNull


  public Long getWorkCenterId() {
    return workCenterId;
  }

  public void setWorkCenterId(Long workCenterId) {
    this.workCenterId = workCenterId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixScheduleItemIM fixScheduleItemIM = (FixScheduleItemIM) o;
    return Objects.equals(this.startDate, fixScheduleItemIM.startDate) &&
        Objects.equals(this.startExecutionDate, fixScheduleItemIM.startExecutionDate) &&
        Objects.equals(this.finishDate, fixScheduleItemIM.finishDate) &&
        Objects.equals(this.workCenterFinishDate, fixScheduleItemIM.workCenterFinishDate) &&
        Objects.equals(this.batchId, fixScheduleItemIM.batchId) &&
        Objects.equals(this.operationId, fixScheduleItemIM.operationId) &&
        Objects.equals(this.operationModeId, fixScheduleItemIM.operationModeId) &&
        Objects.equals(this.workCenterId, fixScheduleItemIM.workCenterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, startExecutionDate, finishDate, workCenterFinishDate, batchId, operationId, operationModeId, workCenterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixScheduleItemIM {\n");

    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startExecutionDate: ").append(toIndentedString(startExecutionDate)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
    sb.append("    workCenterFinishDate: ").append(toIndentedString(workCenterFinishDate)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationModeId: ").append(toIndentedString(operationModeId)).append("\n");
    sb.append("    workCenterId: ").append(toIndentedString(workCenterId)).append("\n");
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


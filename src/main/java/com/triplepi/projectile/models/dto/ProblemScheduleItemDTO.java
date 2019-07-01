package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.triplepi.projectile.models.domain.ScheduleItemBatchDTO;
import com.triplepi.projectile.models.domain.ScheduleItemOperationDTO;
import com.triplepi.projectile.models.domain.ScheduleItemWorkCenterDTO;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * ProblemScheduleItemDTO
 */
@Validated
public class ProblemScheduleItemDTO   {
  @JsonProperty("Operation")
  private ScheduleItemOperationDTO operation = null;

  @JsonProperty("WorkCenter")
  private ScheduleItemWorkCenterDTO workCenter = null;

  @JsonProperty("Batch")
  private ScheduleItemBatchDTO batch = null;

  @JsonProperty("StartDate")
  private LocalDateTime startDate = null;

  @JsonProperty("StartExecutionDate")
  private LocalDateTime startExecutionDate = null;

  @JsonProperty("FinishDate")
  private LocalDateTime finishDate = null;

  @JsonProperty("WorkCenterFinishDate")
  private LocalDateTime workCenterFinishDate = null;

  public ProblemScheduleItemDTO operation(ScheduleItemOperationDTO operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  **/


  public ScheduleItemOperationDTO getOperation() {
    return operation;
  }

  public void setOperation(ScheduleItemOperationDTO operation) {
    this.operation = operation;
  }

  public ProblemScheduleItemDTO workCenter(ScheduleItemWorkCenterDTO workCenter) {
    this.workCenter = workCenter;
    return this;
  }

  /**
   * Get workCenter
   * @return workCenter
  **/


  public ScheduleItemWorkCenterDTO getWorkCenter() {
    return workCenter;
  }

  public void setWorkCenter(ScheduleItemWorkCenterDTO workCenter) {
    this.workCenter = workCenter;
  }

  public ProblemScheduleItemDTO batch(ScheduleItemBatchDTO batch) {
    this.batch = batch;
    return this;
  }

  /**
   * Get batch
   * @return batch
  **/


  public ScheduleItemBatchDTO getBatch() {
    return batch;
  }

  public void setBatch(ScheduleItemBatchDTO batch) {
    this.batch = batch;
  }

  public ProblemScheduleItemDTO startDate(LocalDateTime startDate) {
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

  public ProblemScheduleItemDTO startExecutionDate(LocalDateTime startExecutionDate) {
    this.startExecutionDate = startExecutionDate;
    return this;
  }

  /**
   * Get startExecutionDate
   * @return startExecutionDate
  **/


  public LocalDateTime getStartExecutionDate() {
    return startExecutionDate;
  }

  public void setStartExecutionDate(LocalDateTime startExecutionDate) {
    this.startExecutionDate = startExecutionDate;
  }

  public ProblemScheduleItemDTO finishDate(LocalDateTime finishDate) {
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

  public ProblemScheduleItemDTO workCenterFinishDate(LocalDateTime workCenterFinishDate) {
    this.workCenterFinishDate = workCenterFinishDate;
    return this;
  }

  /**
   * Get workCenterFinishDate
   * @return workCenterFinishDate
  **/


  public LocalDateTime getWorkCenterFinishDate() {
    return workCenterFinishDate;
  }

  public void setWorkCenterFinishDate(LocalDateTime workCenterFinishDate) {
    this.workCenterFinishDate = workCenterFinishDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemScheduleItemDTO problemScheduleItemDTO = (ProblemScheduleItemDTO) o;
    return Objects.equals(this.operation, problemScheduleItemDTO.operation) &&
        Objects.equals(this.workCenter, problemScheduleItemDTO.workCenter) &&
        Objects.equals(this.batch, problemScheduleItemDTO.batch) &&
        Objects.equals(this.startDate, problemScheduleItemDTO.startDate) &&
        Objects.equals(this.startExecutionDate, problemScheduleItemDTO.startExecutionDate) &&
        Objects.equals(this.finishDate, problemScheduleItemDTO.finishDate) &&
        Objects.equals(this.workCenterFinishDate, problemScheduleItemDTO.workCenterFinishDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, workCenter, batch, startDate, startExecutionDate, finishDate, workCenterFinishDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemScheduleItemDTO {\n");

    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    workCenter: ").append(toIndentedString(workCenter)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startExecutionDate: ").append(toIndentedString(startExecutionDate)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
    sb.append("    workCenterFinishDate: ").append(toIndentedString(workCenterFinishDate)).append("\n");
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


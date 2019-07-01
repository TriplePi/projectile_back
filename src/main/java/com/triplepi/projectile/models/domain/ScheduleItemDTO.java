package com.triplepi.projectile.models.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.validation.annotation.Validated;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Objects;


/**
 * ScheduleItemDTO
 */
@Validated
@Entity
public class ScheduleItemDTO   {
  @JsonProperty("Id")
  @Id
  private Long id = null;

  @JsonProperty("Operation")
  @ManyToOne(cascade = CascadeType.ALL)
  @NotFound(action = NotFoundAction.IGNORE)
  private ScheduleItemOperationDTO operation = null;

  @JsonProperty("WorkCenter")
  @ManyToOne(cascade = CascadeType.ALL)
  @NotFound(action = NotFoundAction.IGNORE)
  private ScheduleItemWorkCenterDTO workCenter = null;

  @JsonProperty("Batch")
  @ManyToOne(cascade = CascadeType.ALL)
  @NotFound(action = NotFoundAction.IGNORE)
  private ScheduleItemBatchDTO batch = null;

  @JsonProperty("StartDate")
  private LocalDateTime startDate = null;

  @JsonProperty("StartExecutionDate")
  private LocalDateTime startExecutionDate = null;

  @JsonProperty("FinishDate")
  private LocalDateTime finishDate = null;

  @JsonProperty("WorkCenterFinishDate")
  private LocalDateTime workCenterFinishDate = null;

  @JsonProperty("Timestamp")
  private Long timestamp = null;

  @JsonProperty("FactStartDate")
  private LocalDateTime factStartDate = null;

  @JsonProperty("FactFinishDate")
  private LocalDateTime factFinishDate = null;

  @JsonProperty("FactWorkCenterFinishDate")
  private LocalDateTime factWorkCenterFinishDate = null;

  @JsonProperty("FactStartExecutionDate")
  private LocalDateTime factStartExecutionDate = null;

  @JsonProperty("PlanCount")
  private Integer planCount = null;

  @JsonProperty("FactCount")
  private Integer factCount = null;

  @JsonProperty("QuarantineCount")
  private Integer quarantineCount = null;

  @JsonProperty("Leftover")
  @ManyToOne(cascade = CascadeType.ALL)
  @NotFound(action = NotFoundAction.IGNORE)
  private ScheduleItemLeftoverDTO leftover = null;

  @JsonProperty("LeftoverSolution")
  @ManyToOne(cascade = CascadeType.ALL)
  @NotFound(action = NotFoundAction.IGNORE)
  private ScheduleItemLeftoverDTO leftoverSolution = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NEW("New"),

    STARTED("Started"),

    EXECUTIONSTARTED("ExecutionStarted"),

    FINISHED("Finished"),

    SUSPENDING("Suspending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Status")
  private StatusEnum status = null;

  public ScheduleItemDTO id(Long id) {
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

  public ScheduleItemDTO operation(ScheduleItemOperationDTO operation) {
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

  public ScheduleItemDTO workCenter(ScheduleItemWorkCenterDTO workCenter) {
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

  public ScheduleItemDTO batch(ScheduleItemBatchDTO batch) {
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

  public ScheduleItemDTO startDate(LocalDateTime startDate) {
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

  public ScheduleItemDTO startExecutionDate(LocalDateTime startExecutionDate) {
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

  public ScheduleItemDTO finishDate(LocalDateTime finishDate) {
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

  public ScheduleItemDTO workCenterFinishDate(LocalDateTime workCenterFinishDate) {
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

  public ScheduleItemDTO timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public ScheduleItemDTO factStartDate(LocalDateTime factStartDate) {
    this.factStartDate = factStartDate;
    return this;
  }

  /**
   * Get factStartDate
   * @return factStartDate
  **/


  public LocalDateTime getFactStartDate() {
    return factStartDate;
  }

  public void setFactStartDate(LocalDateTime factStartDate) {
    this.factStartDate = factStartDate;
  }

  public ScheduleItemDTO factFinishDate(LocalDateTime factFinishDate) {
    this.factFinishDate = factFinishDate;
    return this;
  }

  /**
   * Get factFinishDate
   * @return factFinishDate
  **/


  public LocalDateTime getFactFinishDate() {
    return factFinishDate;
  }

  public void setFactFinishDate(LocalDateTime factFinishDate) {
    this.factFinishDate = factFinishDate;
  }

  public ScheduleItemDTO factWorkCenterFinishDate(LocalDateTime factWorkCenterFinishDate) {
    this.factWorkCenterFinishDate = factWorkCenterFinishDate;
    return this;
  }

  /**
   * Get factWorkCenterFinishDate
   * @return factWorkCenterFinishDate
  **/


  public LocalDateTime getFactWorkCenterFinishDate() {
    return factWorkCenterFinishDate;
  }

  public void setFactWorkCenterFinishDate(LocalDateTime factWorkCenterFinishDate) {
    this.factWorkCenterFinishDate = factWorkCenterFinishDate;
  }

  public ScheduleItemDTO factStartExecutionDate(LocalDateTime factStartExecutionDate) {
    this.factStartExecutionDate = factStartExecutionDate;
    return this;
  }

  /**
   * Get factStartExecutionDate
   * @return factStartExecutionDate
  **/


  public LocalDateTime getFactStartExecutionDate() {
    return factStartExecutionDate;
  }

  public void setFactStartExecutionDate(LocalDateTime factStartExecutionDate) {
    this.factStartExecutionDate = factStartExecutionDate;
  }

  public ScheduleItemDTO planCount(Integer planCount) {
    this.planCount = planCount;
    return this;
  }

  /**
   * Get planCount
   * @return planCount
  **/
public Integer getPlanCount() {
    return planCount;
  }

  public void setPlanCount(Integer planCount) {
    this.planCount = planCount;
  }

  public ScheduleItemDTO factCount(Integer factCount) {
    this.factCount = factCount;
    return this;
  }

  /**
   * Get factCount
   * @return factCount
  **/
public Integer getFactCount() {
    return factCount;
  }

  public void setFactCount(Integer factCount) {
    this.factCount = factCount;
  }

  public ScheduleItemDTO quarantineCount(Integer quarantineCount) {
    this.quarantineCount = quarantineCount;
    return this;
  }

  /**
   * Get quarantineCount
   * @return quarantineCount
  **/
public Integer getQuarantineCount() {
    return quarantineCount;
  }

  public void setQuarantineCount(Integer quarantineCount) {
    this.quarantineCount = quarantineCount;
  }

  public ScheduleItemDTO leftover(ScheduleItemLeftoverDTO leftover) {
    this.leftover = leftover;
    return this;
  }

  /**
   * Get leftover
   * @return leftover
  **/


  public ScheduleItemLeftoverDTO getLeftover() {
    return leftover;
  }

  public void setLeftover(ScheduleItemLeftoverDTO leftover) {
    this.leftover = leftover;
  }

  public ScheduleItemDTO leftoverSolution(ScheduleItemLeftoverDTO leftoverSolution) {
    this.leftoverSolution = leftoverSolution;
    return this;
  }

  /**
   * Get leftoverSolution
   * @return leftoverSolution
  **/


  public ScheduleItemLeftoverDTO getLeftoverSolution() {
    return leftoverSolution;
  }

  public void setLeftoverSolution(ScheduleItemLeftoverDTO leftoverSolution) {
    this.leftoverSolution = leftoverSolution;
  }

  public ScheduleItemDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemDTO scheduleItemDTO = (ScheduleItemDTO) o;
    return Objects.equals(this.id, scheduleItemDTO.id) &&
        Objects.equals(this.operation, scheduleItemDTO.operation) &&
        Objects.equals(this.workCenter, scheduleItemDTO.workCenter) &&
        Objects.equals(this.batch, scheduleItemDTO.batch) &&
        Objects.equals(this.startDate, scheduleItemDTO.startDate) &&
        Objects.equals(this.startExecutionDate, scheduleItemDTO.startExecutionDate) &&
        Objects.equals(this.finishDate, scheduleItemDTO.finishDate) &&
        Objects.equals(this.workCenterFinishDate, scheduleItemDTO.workCenterFinishDate) &&
        Objects.equals(this.timestamp, scheduleItemDTO.timestamp) &&
        Objects.equals(this.factStartDate, scheduleItemDTO.factStartDate) &&
        Objects.equals(this.factFinishDate, scheduleItemDTO.factFinishDate) &&
        Objects.equals(this.factWorkCenterFinishDate, scheduleItemDTO.factWorkCenterFinishDate) &&
        Objects.equals(this.factStartExecutionDate, scheduleItemDTO.factStartExecutionDate) &&
        Objects.equals(this.planCount, scheduleItemDTO.planCount) &&
        Objects.equals(this.factCount, scheduleItemDTO.factCount) &&
        Objects.equals(this.quarantineCount, scheduleItemDTO.quarantineCount) &&
        Objects.equals(this.leftover, scheduleItemDTO.leftover) &&
        Objects.equals(this.leftoverSolution, scheduleItemDTO.leftoverSolution) &&
        Objects.equals(this.status, scheduleItemDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operation, workCenter, batch, startDate, startExecutionDate, finishDate, workCenterFinishDate, timestamp, factStartDate, factFinishDate, factWorkCenterFinishDate, factStartExecutionDate, planCount, factCount, quarantineCount, leftover, leftoverSolution, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    workCenter: ").append(toIndentedString(workCenter)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startExecutionDate: ").append(toIndentedString(startExecutionDate)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
    sb.append("    workCenterFinishDate: ").append(toIndentedString(workCenterFinishDate)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    factStartDate: ").append(toIndentedString(factStartDate)).append("\n");
    sb.append("    factFinishDate: ").append(toIndentedString(factFinishDate)).append("\n");
    sb.append("    factWorkCenterFinishDate: ").append(toIndentedString(factWorkCenterFinishDate)).append("\n");
    sb.append("    factStartExecutionDate: ").append(toIndentedString(factStartExecutionDate)).append("\n");
    sb.append("    planCount: ").append(toIndentedString(planCount)).append("\n");
    sb.append("    factCount: ").append(toIndentedString(factCount)).append("\n");
    sb.append("    quarantineCount: ").append(toIndentedString(quarantineCount)).append("\n");
    sb.append("    leftover: ").append(toIndentedString(leftover)).append("\n");
    sb.append("    leftoverSolution: ").append(toIndentedString(leftoverSolution)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


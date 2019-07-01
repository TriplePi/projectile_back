package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * TimelineOrderDTO
 */
@Validated
public class TimelineOrderDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Number")
  private String number = null;

  @JsonProperty("StartDate")
  private LocalDateTime startDate = null;

  @JsonProperty("DeadlineDate")
  private LocalDateTime deadlineDate = null;

  @JsonProperty("Priority")
  private Integer priority = null;

  @JsonProperty("Batches")
private List<TimelineOrderBatchDTO> batches = null;

  public TimelineOrderDTO id(Long id) {
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

  public TimelineOrderDTO number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public TimelineOrderDTO startDate(LocalDateTime startDate) {
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

  public TimelineOrderDTO deadlineDate(LocalDateTime deadlineDate) {
    this.deadlineDate = deadlineDate;
    return this;
  }

  /**
   * Get deadlineDate
   * @return deadlineDate
  **/


  public LocalDateTime getDeadlineDate() {
    return deadlineDate;
  }

  public void setDeadlineDate(LocalDateTime deadlineDate) {
    this.deadlineDate = deadlineDate;
  }

  public TimelineOrderDTO priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TimelineOrderDTO batches(List<TimelineOrderBatchDTO> batches) {
    this.batches = batches;
    return this;
  }

  public TimelineOrderDTO addBatchesItem(TimelineOrderBatchDTO batchesItem) {
    if (this.batches == null) {
      this.batches = new ArrayList<TimelineOrderBatchDTO>();
    }
    this.batches.add(batchesItem);
    return this;
  }

  /**
   * Get batches
   * @return batches
  **/


  public List<TimelineOrderBatchDTO> getBatches() {
    return batches;
  }

  public void setBatches(List<TimelineOrderBatchDTO> batches) {
    this.batches = batches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineOrderDTO timelineOrderDTO = (TimelineOrderDTO) o;
    return Objects.equals(this.id, timelineOrderDTO.id) &&
        Objects.equals(this.number, timelineOrderDTO.number) &&
        Objects.equals(this.startDate, timelineOrderDTO.startDate) &&
        Objects.equals(this.deadlineDate, timelineOrderDTO.deadlineDate) &&
        Objects.equals(this.priority, timelineOrderDTO.priority) &&
        Objects.equals(this.batches, timelineOrderDTO.batches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, startDate, deadlineDate, priority, batches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineOrderDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
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


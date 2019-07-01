package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * WorkCenterWorkingTimeIM
 */
@Validated
public class WorkCenterWorkingTimeIM   {
  @JsonProperty("Start")
  private LocalDateTime start = null;

  @JsonProperty("Finish")
  private LocalDateTime finish = null;

  @JsonProperty("WorkingTimes")
private List<DateTimeRangeIM> workingTimes = null;

  public WorkCenterWorkingTimeIM start(LocalDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/


  public LocalDateTime getStart() {
    return start;
  }

  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  public WorkCenterWorkingTimeIM finish(LocalDateTime finish) {
    this.finish = finish;
    return this;
  }

  /**
   * Get finish
   * @return finish
  **/


  public LocalDateTime getFinish() {
    return finish;
  }

  public void setFinish(LocalDateTime finish) {
    this.finish = finish;
  }

  public WorkCenterWorkingTimeIM workingTimes(List<DateTimeRangeIM> workingTimes) {
    this.workingTimes = workingTimes;
    return this;
  }

  public WorkCenterWorkingTimeIM addWorkingTimesItem(DateTimeRangeIM workingTimesItem) {
    if (this.workingTimes == null) {
      this.workingTimes = new ArrayList<DateTimeRangeIM>();
    }
    this.workingTimes.add(workingTimesItem);
    return this;
  }

  /**
   * Get workingTimes
   * @return workingTimes
  **/


  public List<DateTimeRangeIM> getWorkingTimes() {
    return workingTimes;
  }

  public void setWorkingTimes(List<DateTimeRangeIM> workingTimes) {
    this.workingTimes = workingTimes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkCenterWorkingTimeIM workCenterWorkingTimeIM = (WorkCenterWorkingTimeIM) o;
    return Objects.equals(this.start, workCenterWorkingTimeIM.start) &&
        Objects.equals(this.finish, workCenterWorkingTimeIM.finish) &&
        Objects.equals(this.workingTimes, workCenterWorkingTimeIM.workingTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, finish, workingTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkCenterWorkingTimeIM {\n");

    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    workingTimes: ").append(toIndentedString(workingTimes)).append("\n");
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


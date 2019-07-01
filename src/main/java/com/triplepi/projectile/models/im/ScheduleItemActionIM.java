package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sun.istack.internal.NotNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * ScheduleItemActionIM
 */
@Validated
public class ScheduleItemActionIM   {
  @JsonProperty("Date")
  private LocalDateTime date = null;

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    START("Start"),

    STARTEXECUTION("StartExecution"),

    FINISH("Finish"),

    SUSPEND("Suspend"),

    RESUME("Resume"),

    EXECUTEPARTIAL("ExecutePartial"),

    PROGRESS("Progress");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Action")
  private ActionEnum action = null;

  @JsonProperty("Progress")
  private ScheduleItemProgressIM progress = null;

  @JsonProperty("WorkCenterFinishDate")
  private LocalDateTime workCenterFinishDate = null;

  public ScheduleItemActionIM date(LocalDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/

  @NotNull

public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public ScheduleItemActionIM action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  **/

  @NotNull


  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public ScheduleItemActionIM progress(ScheduleItemProgressIM progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
  **/


  public ScheduleItemProgressIM getProgress() {
    return progress;
  }

  public void setProgress(ScheduleItemProgressIM progress) {
    this.progress = progress;
  }

  public ScheduleItemActionIM workCenterFinishDate(LocalDateTime workCenterFinishDate) {
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
    ScheduleItemActionIM scheduleItemActionIM = (ScheduleItemActionIM) o;
    return Objects.equals(this.date, scheduleItemActionIM.date) &&
        Objects.equals(this.action, scheduleItemActionIM.action) &&
        Objects.equals(this.progress, scheduleItemActionIM.progress) &&
        Objects.equals(this.workCenterFinishDate, scheduleItemActionIM.workCenterFinishDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, action, progress, workCenterFinishDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemActionIM {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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


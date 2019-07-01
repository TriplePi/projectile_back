package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sun.istack.internal.NotNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * ScheduleItemManageActionIM
 */
@Validated
public class ScheduleItemManageActionIM   {
  @JsonProperty("Date")
  private LocalDateTime date = null;

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    UNDO("Undo"),

    RESET("Reset");

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

  public ScheduleItemManageActionIM date(LocalDateTime date) {
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

  public ScheduleItemManageActionIM action(ActionEnum action) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemManageActionIM scheduleItemManageActionIM = (ScheduleItemManageActionIM) o;
    return Objects.equals(this.date, scheduleItemManageActionIM.date) &&
        Objects.equals(this.action, scheduleItemManageActionIM.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemManageActionIM {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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


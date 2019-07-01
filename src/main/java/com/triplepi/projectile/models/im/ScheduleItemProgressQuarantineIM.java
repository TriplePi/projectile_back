package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


/**
 * ScheduleItemProgressQuarantineIM
 */
@Validated
public class ScheduleItemProgressQuarantineIM   {
  @JsonProperty("Count")
  private Integer count = null;

  @JsonProperty("Comment")
  private String comment = null;

  public ScheduleItemProgressQuarantineIM count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ScheduleItemProgressQuarantineIM comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  **/

  @NotNull


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemProgressQuarantineIM scheduleItemProgressQuarantineIM = (ScheduleItemProgressQuarantineIM) o;
    return Objects.equals(this.count, scheduleItemProgressQuarantineIM.count) &&
        Objects.equals(this.comment, scheduleItemProgressQuarantineIM.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemProgressQuarantineIM {\n");

    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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


package com.triplepi.projectile.models.im;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;


/**
 * ScheduleItemProgressProcessedIM
 */
@Validated
public class ScheduleItemProgressProcessedIM   {
  @JsonProperty("Count")
  private Integer count = null;

  public ScheduleItemProgressProcessedIM count(Integer count) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemProgressProcessedIM scheduleItemProgressProcessedIM = (ScheduleItemProgressProcessedIM) o;
    return Objects.equals(this.count, scheduleItemProgressProcessedIM.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemProgressProcessedIM {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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


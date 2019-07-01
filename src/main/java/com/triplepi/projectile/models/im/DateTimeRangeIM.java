package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * DateTimeRangeIM
 */
@Validated
public class DateTimeRangeIM   {
  @JsonProperty("Start")
  private LocalDateTime start = null;

  @JsonProperty("Finish")
  private LocalDateTime finish = null;

  public DateTimeRangeIM start(LocalDateTime start) {
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

  public DateTimeRangeIM finish(LocalDateTime finish) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeRangeIM dateTimeRangeIM = (DateTimeRangeIM) o;
    return Objects.equals(this.start, dateTimeRangeIM.start) &&
        Objects.equals(this.finish, dateTimeRangeIM.finish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, finish);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeRangeIM {\n");

    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
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


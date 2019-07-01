package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


/**
 * ScheduleItemDeletedDTO
 */
@Validated
public class ScheduleItemDeletedDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Timestamp")
  private Long timestamp = null;

  public ScheduleItemDeletedDTO id(Long id) {
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

  public ScheduleItemDeletedDTO timestamp(Long timestamp) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemDeletedDTO scheduleItemDeletedDTO = (ScheduleItemDeletedDTO) o;
    return Objects.equals(this.id, scheduleItemDeletedDTO.id) &&
        Objects.equals(this.timestamp, scheduleItemDeletedDTO.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemDeletedDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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


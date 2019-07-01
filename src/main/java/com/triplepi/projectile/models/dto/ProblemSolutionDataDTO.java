package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * ProblemSolutionDataDTO
 */
@Validated
public class ProblemSolutionDataDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("FitnessValue")
  private Double fitnessValue = null;

  @JsonProperty("Schedule")
private List<ProblemScheduleItemDTO> schedule = null;

  @JsonProperty("Timestamp")
  private Long timestamp = null;

  public ProblemSolutionDataDTO id(Long id) {
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

  public ProblemSolutionDataDTO fitnessValue(Double fitnessValue) {
    this.fitnessValue = fitnessValue;
    return this;
  }

  /**
   * Get fitnessValue
   * @return fitnessValue
  **/
public Double getFitnessValue() {
    return fitnessValue;
  }

  public void setFitnessValue(Double fitnessValue) {
    this.fitnessValue = fitnessValue;
  }

  public ProblemSolutionDataDTO schedule(List<ProblemScheduleItemDTO> schedule) {
    this.schedule = schedule;
    return this;
  }

  public ProblemSolutionDataDTO addScheduleItem(ProblemScheduleItemDTO scheduleItem) {
    if (this.schedule == null) {
      this.schedule = new ArrayList<ProblemScheduleItemDTO>();
    }
    this.schedule.add(scheduleItem);
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  **/


  public List<ProblemScheduleItemDTO> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<ProblemScheduleItemDTO> schedule) {
    this.schedule = schedule;
  }

  public ProblemSolutionDataDTO timestamp(Long timestamp) {
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
    ProblemSolutionDataDTO problemSolutionDataDTO = (ProblemSolutionDataDTO) o;
    return Objects.equals(this.id, problemSolutionDataDTO.id) &&
        Objects.equals(this.fitnessValue, problemSolutionDataDTO.fitnessValue) &&
        Objects.equals(this.schedule, problemSolutionDataDTO.schedule) &&
        Objects.equals(this.timestamp, problemSolutionDataDTO.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fitnessValue, schedule, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemSolutionDataDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fitnessValue: ").append(toIndentedString(fitnessValue)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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


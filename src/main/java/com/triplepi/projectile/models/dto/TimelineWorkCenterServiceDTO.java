package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * TimelineWorkCenterServiceDTO
 */
@Validated
public class TimelineWorkCenterServiceDTO   {
  @JsonProperty("StartDate")
  private LocalDateTime startDate = null;

  @JsonProperty("FinishDate")
  private LocalDateTime finishDate = null;

  @JsonProperty("WorkCenterId")
  private Long workCenterId = null;

  public TimelineWorkCenterServiceDTO startDate(LocalDateTime startDate) {
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

  public TimelineWorkCenterServiceDTO finishDate(LocalDateTime finishDate) {
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

  public TimelineWorkCenterServiceDTO workCenterId(Long workCenterId) {
    this.workCenterId = workCenterId;
    return this;
  }

  /**
   * Get workCenterId
   * @return workCenterId
  **/
public Long getWorkCenterId() {
    return workCenterId;
  }

  public void setWorkCenterId(Long workCenterId) {
    this.workCenterId = workCenterId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineWorkCenterServiceDTO timelineWorkCenterServiceDTO = (TimelineWorkCenterServiceDTO) o;
    return Objects.equals(this.startDate, timelineWorkCenterServiceDTO.startDate) &&
        Objects.equals(this.finishDate, timelineWorkCenterServiceDTO.finishDate) &&
        Objects.equals(this.workCenterId, timelineWorkCenterServiceDTO.workCenterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, finishDate, workCenterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineWorkCenterServiceDTO {\n");

    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
    sb.append("    workCenterId: ").append(toIndentedString(workCenterId)).append("\n");
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


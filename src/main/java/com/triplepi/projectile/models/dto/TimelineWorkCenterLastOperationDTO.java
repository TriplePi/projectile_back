package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * TimelineWorkCenterLastOperationDTO
 */
@Validated
public class TimelineWorkCenterLastOperationDTO   {
  @JsonProperty("OperationId")
  private Long operationId = null;

  @JsonProperty("WorkCenterId")
  private Long workCenterId = null;

  @JsonProperty("WorkCenterFinishDate")
  private LocalDateTime workCenterFinishDate = null;

  public TimelineWorkCenterLastOperationDTO operationId(Long operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Get operationId
   * @return operationId
  **/
public Long getOperationId() {
    return operationId;
  }

  public void setOperationId(Long operationId) {
    this.operationId = operationId;
  }

  public TimelineWorkCenterLastOperationDTO workCenterId(Long workCenterId) {
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

  public TimelineWorkCenterLastOperationDTO workCenterFinishDate(LocalDateTime workCenterFinishDate) {
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
    TimelineWorkCenterLastOperationDTO timelineWorkCenterLastOperationDTO = (TimelineWorkCenterLastOperationDTO) o;
    return Objects.equals(this.operationId, timelineWorkCenterLastOperationDTO.operationId) &&
        Objects.equals(this.workCenterId, timelineWorkCenterLastOperationDTO.workCenterId) &&
        Objects.equals(this.workCenterFinishDate, timelineWorkCenterLastOperationDTO.workCenterFinishDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, workCenterId, workCenterFinishDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineWorkCenterLastOperationDTO {\n");

    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    workCenterId: ").append(toIndentedString(workCenterId)).append("\n");
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


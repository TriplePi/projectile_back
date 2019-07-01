package com.triplepi.projectile.models.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;


/**
 * TimelineAdjustmentDTO
 */
@Validated
public class TimelineAdjustmentDTO   {
  @JsonProperty("WorkCenterId")
  private Long workCenterId = null;

  @JsonProperty("PrevOperationId")
  private Long prevOperationId = null;

  @JsonProperty("OperationId")
  private Long operationId = null;

  @JsonProperty("Duration")
  private Integer duration = null;

  public TimelineAdjustmentDTO workCenterId(Long workCenterId) {
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

  public TimelineAdjustmentDTO prevOperationId(Long prevOperationId) {
    this.prevOperationId = prevOperationId;
    return this;
  }

  /**
   * Get prevOperationId
   * @return prevOperationId
  **/
public Long getPrevOperationId() {
    return prevOperationId;
  }

  public void setPrevOperationId(Long prevOperationId) {
    this.prevOperationId = prevOperationId;
  }

  public TimelineAdjustmentDTO operationId(Long operationId) {
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

  public TimelineAdjustmentDTO duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineAdjustmentDTO timelineAdjustmentDTO = (TimelineAdjustmentDTO) o;
    return Objects.equals(this.workCenterId, timelineAdjustmentDTO.workCenterId) &&
        Objects.equals(this.prevOperationId, timelineAdjustmentDTO.prevOperationId) &&
        Objects.equals(this.operationId, timelineAdjustmentDTO.operationId) &&
        Objects.equals(this.duration, timelineAdjustmentDTO.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workCenterId, prevOperationId, operationId, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineAdjustmentDTO {\n");
    
    sb.append("    workCenterId: ").append(toIndentedString(workCenterId)).append("\n");
    sb.append("    prevOperationId: ").append(toIndentedString(prevOperationId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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


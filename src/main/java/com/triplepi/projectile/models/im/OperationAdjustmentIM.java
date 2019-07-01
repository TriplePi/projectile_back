package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


/**
 * OperationAdjustmentIM
 */
@Validated
public class OperationAdjustmentIM   {
  @JsonProperty("WorkCenterId")
  private Long workCenterId = null;

  @JsonProperty("PrevOperationId")
  private Long prevOperationId = null;

  @JsonProperty("Duration")
  private String duration = null;

  public OperationAdjustmentIM workCenterId(Long workCenterId) {
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

  public OperationAdjustmentIM prevOperationId(Long prevOperationId) {
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

  public OperationAdjustmentIM duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
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
    OperationAdjustmentIM operationAdjustmentIM = (OperationAdjustmentIM) o;
    return Objects.equals(this.workCenterId, operationAdjustmentIM.workCenterId) &&
        Objects.equals(this.prevOperationId, operationAdjustmentIM.prevOperationId) &&
        Objects.equals(this.duration, operationAdjustmentIM.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workCenterId, prevOperationId, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationAdjustmentIM {\n");

    sb.append("    workCenterId: ").append(toIndentedString(workCenterId)).append("\n");
    sb.append("    prevOperationId: ").append(toIndentedString(prevOperationId)).append("\n");
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


package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


/**
 * AdjustmentIM
 */
@Validated
public class AdjustmentIM   {
  @JsonProperty("WorkCenterId")
  private Long workCenterId = null;

  @JsonProperty("OperationId")
  private Long operationId = null;

  @JsonProperty("PrevOperationId")
  private Long prevOperationId = null;

  @JsonProperty("Duration")
  private String duration = null;

  public AdjustmentIM workCenterId(Long workCenterId) {
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

  public AdjustmentIM operationId(Long operationId) {
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

  public AdjustmentIM prevOperationId(Long prevOperationId) {
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

  public AdjustmentIM duration(String duration) {
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
    AdjustmentIM adjustmentIM = (AdjustmentIM) o;
    return Objects.equals(this.workCenterId, adjustmentIM.workCenterId) &&
        Objects.equals(this.operationId, adjustmentIM.operationId) &&
        Objects.equals(this.prevOperationId, adjustmentIM.prevOperationId) &&
        Objects.equals(this.duration, adjustmentIM.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workCenterId, operationId, prevOperationId, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustmentIM {\n");

    sb.append("    workCenterId: ").append(toIndentedString(workCenterId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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


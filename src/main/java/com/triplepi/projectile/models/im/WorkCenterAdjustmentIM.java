package com.triplepi.projectile.models.im;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;


/**
 * WorkCenterAdjustmentIM
 */
@Validated
public class WorkCenterAdjustmentIM   {
  @JsonProperty("OperationId")
  private Long operationId = null;

  @JsonProperty("PrevOperationId")
  private Long prevOperationId = null;

  @JsonProperty("Duration")
  private String duration = null;

  public WorkCenterAdjustmentIM operationId(Long operationId) {
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

  public WorkCenterAdjustmentIM prevOperationId(Long prevOperationId) {
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

  public WorkCenterAdjustmentIM duration(String duration) {
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
    WorkCenterAdjustmentIM workCenterAdjustmentIM = (WorkCenterAdjustmentIM) o;
    return Objects.equals(this.operationId, workCenterAdjustmentIM.operationId) &&
        Objects.equals(this.prevOperationId, workCenterAdjustmentIM.prevOperationId) &&
        Objects.equals(this.duration, workCenterAdjustmentIM.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, prevOperationId, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkCenterAdjustmentIM {\n");
    
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


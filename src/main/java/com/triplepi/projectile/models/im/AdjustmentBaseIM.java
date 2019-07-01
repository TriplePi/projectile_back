package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


/**
 * AdjustmentBaseIM
 */
@Validated
public class AdjustmentBaseIM   {
  @JsonProperty("PrevOperationId")
  private Long prevOperationId = null;

  @JsonProperty("Duration")
  private String duration = null;

  public AdjustmentBaseIM prevOperationId(Long prevOperationId) {
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

  public AdjustmentBaseIM duration(String duration) {
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
    AdjustmentBaseIM adjustmentBaseIM = (AdjustmentBaseIM) o;
    return Objects.equals(this.prevOperationId, adjustmentBaseIM.prevOperationId) &&
        Objects.equals(this.duration, adjustmentBaseIM.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prevOperationId, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustmentBaseIM {\n");

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


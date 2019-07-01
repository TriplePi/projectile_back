package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


/**
 * AdjustmentDTO
 */
@Validated
public class AdjustmentDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("WorkCenterId")
  private Long workCenterId = null;

  @JsonProperty("PrevOperationId")
  private Long prevOperationId = null;

  @JsonProperty("OperationId")
  private Long operationId = null;

  @JsonProperty("Duration")
  private String duration = null;

  public AdjustmentDTO id(Long id) {
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

  public AdjustmentDTO workCenterId(Long workCenterId) {
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

  public AdjustmentDTO prevOperationId(Long prevOperationId) {
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

  public AdjustmentDTO operationId(Long operationId) {
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

  public AdjustmentDTO duration(String duration) {
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
    AdjustmentDTO adjustmentDTO = (AdjustmentDTO) o;
    return Objects.equals(this.id, adjustmentDTO.id) &&
        Objects.equals(this.workCenterId, adjustmentDTO.workCenterId) &&
        Objects.equals(this.prevOperationId, adjustmentDTO.prevOperationId) &&
        Objects.equals(this.operationId, adjustmentDTO.operationId) &&
        Objects.equals(this.duration, adjustmentDTO.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workCenterId, prevOperationId, operationId, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustmentDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * TimelineProcessOperationDTO
 */
@Validated
public class TimelineProcessOperationDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("OperationModes")
private List<TimelineProcessOperationModeDTO> operationModes = null;

  public TimelineProcessOperationDTO id(Long id) {
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

  public TimelineProcessOperationDTO operationModes(List<TimelineProcessOperationModeDTO> operationModes) {
    this.operationModes = operationModes;
    return this;
  }

  public TimelineProcessOperationDTO addOperationModesItem(TimelineProcessOperationModeDTO operationModesItem) {
    if (this.operationModes == null) {
      this.operationModes = new ArrayList<TimelineProcessOperationModeDTO>();
    }
    this.operationModes.add(operationModesItem);
    return this;
  }

  /**
   * Get operationModes
   * @return operationModes
  **/


  public List<TimelineProcessOperationModeDTO> getOperationModes() {
    return operationModes;
  }

  public void setOperationModes(List<TimelineProcessOperationModeDTO> operationModes) {
    this.operationModes = operationModes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineProcessOperationDTO timelineProcessOperationDTO = (TimelineProcessOperationDTO) o;
    return Objects.equals(this.id, timelineProcessOperationDTO.id) &&
        Objects.equals(this.operationModes, timelineProcessOperationDTO.operationModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operationModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineProcessOperationDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationModes: ").append(toIndentedString(operationModes)).append("\n");
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


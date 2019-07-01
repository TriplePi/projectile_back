package com.triplepi.projectile.models.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;


/**
 * TimelineProcessOperationModeDTO
 */
@Validated
public class TimelineProcessOperationModeDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("WorkCenters")
private List<Long> workCenters = null;

  public TimelineProcessOperationModeDTO id(Long id) {
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

  public TimelineProcessOperationModeDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TimelineProcessOperationModeDTO workCenters(List<Long> workCenters) {
    this.workCenters = workCenters;
    return this;
  }

  public TimelineProcessOperationModeDTO addWorkCentersItem(Long workCentersItem) {
    if (this.workCenters == null) {
      this.workCenters = new ArrayList<Long>();
    }
    this.workCenters.add(workCentersItem);
    return this;
  }

  /**
   * Get workCenters
   * @return workCenters
  **/
public List<Long> getWorkCenters() {
    return workCenters;
  }

  public void setWorkCenters(List<Long> workCenters) {
    this.workCenters = workCenters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineProcessOperationModeDTO timelineProcessOperationModeDTO = (TimelineProcessOperationModeDTO) o;
    return Objects.equals(this.id, timelineProcessOperationModeDTO.id) &&
        Objects.equals(this.name, timelineProcessOperationModeDTO.name) &&
        Objects.equals(this.workCenters, timelineProcessOperationModeDTO.workCenters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, workCenters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineProcessOperationModeDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workCenters: ").append(toIndentedString(workCenters)).append("\n");
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


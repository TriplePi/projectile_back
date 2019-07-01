package com.triplepi.projectile.models.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


/**
 * ScheduleItemWorkCenterDTO
 */
@Validated
@Entity
public class ScheduleItemWorkCenterDTO   {
  @JsonProperty("Id")
  @Id
  private Long id = null;

  @JsonProperty("Name")
  private String name = null;

  public ScheduleItemWorkCenterDTO id(Long id) {
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

  public ScheduleItemWorkCenterDTO name(String name) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemWorkCenterDTO scheduleItemWorkCenterDTO = (ScheduleItemWorkCenterDTO) o;
    return Objects.equals(this.id, scheduleItemWorkCenterDTO.id) &&
        Objects.equals(this.name, scheduleItemWorkCenterDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemWorkCenterDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


package com.triplepi.projectile.models.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


/**
 * ScheduleItemLeftoverDTO
 */
@Validated
@Entity
public class ScheduleItemLeftoverDTO   {
  @JsonProperty("Id")
  @Id
  private Long id = null;

  @JsonProperty("Count")
  private Integer count = null;

  @JsonProperty("BaseOnId")
  private Long baseOnId = null;

  @JsonProperty("SolutionId")
  private Long solutionId = null;

  public ScheduleItemLeftoverDTO id(Long id) {
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

  public ScheduleItemLeftoverDTO count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ScheduleItemLeftoverDTO baseOnId(Long baseOnId) {
    this.baseOnId = baseOnId;
    return this;
  }

  /**
   * Get baseOnId
   * @return baseOnId
  **/
public Long getBaseOnId() {
    return baseOnId;
  }

  public void setBaseOnId(Long baseOnId) {
    this.baseOnId = baseOnId;
  }

  public ScheduleItemLeftoverDTO solutionId(Long solutionId) {
    this.solutionId = solutionId;
    return this;
  }

  /**
   * Get solutionId
   * @return solutionId
  **/
public Long getSolutionId() {
    return solutionId;
  }

  public void setSolutionId(Long solutionId) {
    this.solutionId = solutionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemLeftoverDTO scheduleItemLeftoverDTO = (ScheduleItemLeftoverDTO) o;
    return Objects.equals(this.id, scheduleItemLeftoverDTO.id) &&
        Objects.equals(this.count, scheduleItemLeftoverDTO.count) &&
        Objects.equals(this.baseOnId, scheduleItemLeftoverDTO.baseOnId) &&
        Objects.equals(this.solutionId, scheduleItemLeftoverDTO.solutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, count, baseOnId, solutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemLeftoverDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    baseOnId: ").append(toIndentedString(baseOnId)).append("\n");
    sb.append("    solutionId: ").append(toIndentedString(solutionId)).append("\n");
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


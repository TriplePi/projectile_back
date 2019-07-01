package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * OperationModeIM
 */
@Validated
public class OperationModeIM   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("PrepareOperationDuration")
  private String prepareOperationDuration = null;

  @JsonProperty("OperationDuration")
  private String operationDuration = null;

  @JsonProperty("CompletionOperationDuration")
  private String completionOperationDuration = null;

  @JsonProperty("CompletionWorkCentrDuration")
  private String completionWorkCentrDuration = null;

  @JsonProperty("Multiplicity")
  private Integer multiplicity = null;

  @JsonProperty("WorkCenters")
private List<Long> workCenters = null;

  public OperationModeIM id(Long id) {
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

  public OperationModeIM name(String name) {
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

  public OperationModeIM prepareOperationDuration(String prepareOperationDuration) {
    this.prepareOperationDuration = prepareOperationDuration;
    return this;
  }

  /**
   * Get prepareOperationDuration
   * @return prepareOperationDuration
  **/
public String getPrepareOperationDuration() {
    return prepareOperationDuration;
  }

  public void setPrepareOperationDuration(String prepareOperationDuration) {
    this.prepareOperationDuration = prepareOperationDuration;
  }

  public OperationModeIM operationDuration(String operationDuration) {
    this.operationDuration = operationDuration;
    return this;
  }

  /**
   * Get operationDuration
   * @return operationDuration
  **/
public String getOperationDuration() {
    return operationDuration;
  }

  public void setOperationDuration(String operationDuration) {
    this.operationDuration = operationDuration;
  }

  public OperationModeIM completionOperationDuration(String completionOperationDuration) {
    this.completionOperationDuration = completionOperationDuration;
    return this;
  }

  /**
   * Get completionOperationDuration
   * @return completionOperationDuration
  **/
public String getCompletionOperationDuration() {
    return completionOperationDuration;
  }

  public void setCompletionOperationDuration(String completionOperationDuration) {
    this.completionOperationDuration = completionOperationDuration;
  }

  public OperationModeIM completionWorkCentrDuration(String completionWorkCentrDuration) {
    this.completionWorkCentrDuration = completionWorkCentrDuration;
    return this;
  }

  /**
   * Get completionWorkCentrDuration
   * @return completionWorkCentrDuration
  **/
public String getCompletionWorkCentrDuration() {
    return completionWorkCentrDuration;
  }

  public void setCompletionWorkCentrDuration(String completionWorkCentrDuration) {
    this.completionWorkCentrDuration = completionWorkCentrDuration;
  }

  public OperationModeIM multiplicity(Integer multiplicity) {
    this.multiplicity = multiplicity;
    return this;
  }

  /**
   * Get multiplicity
   * @return multiplicity
  **/
public Integer getMultiplicity() {
    return multiplicity;
  }

  public void setMultiplicity(Integer multiplicity) {
    this.multiplicity = multiplicity;
  }

  public OperationModeIM workCenters(List<Long> workCenters) {
    this.workCenters = workCenters;
    return this;
  }

  public OperationModeIM addWorkCentersItem(Long workCentersItem) {
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
    OperationModeIM operationModeIM = (OperationModeIM) o;
    return Objects.equals(this.id, operationModeIM.id) &&
        Objects.equals(this.name, operationModeIM.name) &&
        Objects.equals(this.prepareOperationDuration, operationModeIM.prepareOperationDuration) &&
        Objects.equals(this.operationDuration, operationModeIM.operationDuration) &&
        Objects.equals(this.completionOperationDuration, operationModeIM.completionOperationDuration) &&
        Objects.equals(this.completionWorkCentrDuration, operationModeIM.completionWorkCentrDuration) &&
        Objects.equals(this.multiplicity, operationModeIM.multiplicity) &&
        Objects.equals(this.workCenters, operationModeIM.workCenters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, prepareOperationDuration, operationDuration, completionOperationDuration, completionWorkCentrDuration, multiplicity, workCenters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationModeIM {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prepareOperationDuration: ").append(toIndentedString(prepareOperationDuration)).append("\n");
    sb.append("    operationDuration: ").append(toIndentedString(operationDuration)).append("\n");
    sb.append("    completionOperationDuration: ").append(toIndentedString(completionOperationDuration)).append("\n");
    sb.append("    completionWorkCentrDuration: ").append(toIndentedString(completionWorkCentrDuration)).append("\n");
    sb.append("    multiplicity: ").append(toIndentedString(multiplicity)).append("\n");
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


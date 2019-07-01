package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * OptimizationCriteriaIM
 */
@Validated
public class OptimizationCriteriaIM   {
  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Params")
private List<Object> params = null;

  public OptimizationCriteriaIM name(String name) {
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

  public OptimizationCriteriaIM params(List<Object> params) {
    this.params = params;
    return this;
  }

  public OptimizationCriteriaIM addParamsItem(Object paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<Object>();
    }
    this.params.add(paramsItem);
    return this;
  }

  /**
   * Get params
   * @return params
  **/
public List<Object> getParams() {
    return params;
  }

  public void setParams(List<Object> params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizationCriteriaIM optimizationCriteriaIM = (OptimizationCriteriaIM) o;
    return Objects.equals(this.name, optimizationCriteriaIM.name) &&
        Objects.equals(this.params, optimizationCriteriaIM.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizationCriteriaIM {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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


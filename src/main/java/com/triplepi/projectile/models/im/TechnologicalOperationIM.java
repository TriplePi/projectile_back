package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * TechnologicalOperationIM
 */
@Validated
public class TechnologicalOperationIM   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Order")
  private Integer order = null;

  @JsonProperty("OperationModes")
private List<OperationModeIM> operationModes = null;

  public TechnologicalOperationIM id(Long id) {
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

  public TechnologicalOperationIM order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public TechnologicalOperationIM operationModes(List<OperationModeIM> operationModes) {
    this.operationModes = operationModes;
    return this;
  }

  public TechnologicalOperationIM addOperationModesItem(OperationModeIM operationModesItem) {
    if (this.operationModes == null) {
      this.operationModes = new ArrayList<OperationModeIM>();
    }
    this.operationModes.add(operationModesItem);
    return this;
  }

  /**
   * Get operationModes
   * @return operationModes
  **/


  public List<OperationModeIM> getOperationModes() {
    return operationModes;
  }

  public void setOperationModes(List<OperationModeIM> operationModes) {
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
    TechnologicalOperationIM technologicalOperationIM = (TechnologicalOperationIM) o;
    return Objects.equals(this.id, technologicalOperationIM.id) &&
        Objects.equals(this.order, technologicalOperationIM.order) &&
        Objects.equals(this.operationModes, technologicalOperationIM.operationModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, order, operationModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnologicalOperationIM {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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


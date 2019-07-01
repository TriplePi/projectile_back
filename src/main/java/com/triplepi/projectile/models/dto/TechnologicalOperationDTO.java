package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * TechnologicalOperationDTO
 */
@Validated
public class TechnologicalOperationDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Order")
  private Integer order = null;

  @JsonProperty("Adjustments")
private List<AdjustmentDTO> adjustments = null;

  @JsonProperty("OperationModes")
private List<OperationModeDTO> operationModes = null;

  public TechnologicalOperationDTO id(Long id) {
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

  public TechnologicalOperationDTO order(Integer order) {
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

  public TechnologicalOperationDTO adjustments(List<AdjustmentDTO> adjustments) {
    this.adjustments = adjustments;
    return this;
  }

  public TechnologicalOperationDTO addAdjustmentsItem(AdjustmentDTO adjustmentsItem) {
    if (this.adjustments == null) {
      this.adjustments = new ArrayList<AdjustmentDTO>();
    }
    this.adjustments.add(adjustmentsItem);
    return this;
  }

  /**
   * Get adjustments
   * @return adjustments
  **/


  public List<AdjustmentDTO> getAdjustments() {
    return adjustments;
  }

  public void setAdjustments(List<AdjustmentDTO> adjustments) {
    this.adjustments = adjustments;
  }

  public TechnologicalOperationDTO operationModes(List<OperationModeDTO> operationModes) {
    this.operationModes = operationModes;
    return this;
  }

  public TechnologicalOperationDTO addOperationModesItem(OperationModeDTO operationModesItem) {
    if (this.operationModes == null) {
      this.operationModes = new ArrayList<OperationModeDTO>();
    }
    this.operationModes.add(operationModesItem);
    return this;
  }

  /**
   * Get operationModes
   * @return operationModes
  **/


  public List<OperationModeDTO> getOperationModes() {
    return operationModes;
  }

  public void setOperationModes(List<OperationModeDTO> operationModes) {
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
    TechnologicalOperationDTO technologicalOperationDTO = (TechnologicalOperationDTO) o;
    return Objects.equals(this.id, technologicalOperationDTO.id) &&
        Objects.equals(this.order, technologicalOperationDTO.order) &&
        Objects.equals(this.adjustments, technologicalOperationDTO.adjustments) &&
        Objects.equals(this.operationModes, technologicalOperationDTO.operationModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, order, adjustments, operationModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnologicalOperationDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
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


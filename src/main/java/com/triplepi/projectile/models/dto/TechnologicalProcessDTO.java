package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * TechnologicalProcessDTO
 */
@Validated
public class TechnologicalProcessDTO   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Kit")
  private Integer kit = null;

  @JsonProperty("Operations")
private List<TechnologicalOperationDTO> operations = null;

  public TechnologicalProcessDTO id(Long id) {
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

  public TechnologicalProcessDTO name(String name) {
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

  public TechnologicalProcessDTO kit(Integer kit) {
    this.kit = kit;
    return this;
  }

  /**
   * Get kit
   * @return kit
  **/
public Integer getKit() {
    return kit;
  }

  public void setKit(Integer kit) {
    this.kit = kit;
  }

  public TechnologicalProcessDTO operations(List<TechnologicalOperationDTO> operations) {
    this.operations = operations;
    return this;
  }

  public TechnologicalProcessDTO addOperationsItem(TechnologicalOperationDTO operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<TechnologicalOperationDTO>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
  **/


  public List<TechnologicalOperationDTO> getOperations() {
    return operations;
  }

  public void setOperations(List<TechnologicalOperationDTO> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnologicalProcessDTO technologicalProcessDTO = (TechnologicalProcessDTO) o;
    return Objects.equals(this.id, technologicalProcessDTO.id) &&
        Objects.equals(this.name, technologicalProcessDTO.name) &&
        Objects.equals(this.kit, technologicalProcessDTO.kit) &&
        Objects.equals(this.operations, technologicalProcessDTO.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, kit, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnologicalProcessDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    kit: ").append(toIndentedString(kit)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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


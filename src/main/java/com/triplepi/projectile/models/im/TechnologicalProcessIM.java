package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * TechnologicalProcessIM
 */
@Validated
public class TechnologicalProcessIM   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Kit")
  private Integer kit = null;

  @JsonProperty("Operations")
private List<TechnologicalOperationIM> operations = null;

  public TechnologicalProcessIM id(Long id) {
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

  public TechnologicalProcessIM name(String name) {
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

  public TechnologicalProcessIM kit(Integer kit) {
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

  public TechnologicalProcessIM operations(List<TechnologicalOperationIM> operations) {
    this.operations = operations;
    return this;
  }

  public TechnologicalProcessIM addOperationsItem(TechnologicalOperationIM operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<TechnologicalOperationIM>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
  **/


  public List<TechnologicalOperationIM> getOperations() {
    return operations;
  }

  public void setOperations(List<TechnologicalOperationIM> operations) {
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
    TechnologicalProcessIM technologicalProcessIM = (TechnologicalProcessIM) o;
    return Objects.equals(this.id, technologicalProcessIM.id) &&
        Objects.equals(this.name, technologicalProcessIM.name) &&
        Objects.equals(this.kit, technologicalProcessIM.kit) &&
        Objects.equals(this.operations, technologicalProcessIM.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, kit, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnologicalProcessIM {\n");
    
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


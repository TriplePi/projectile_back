package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * ProductIM
 */
@Validated
public class ProductIM   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Processes")
private List<TechnologicalProcessIM> processes = null;

  public ProductIM id(Long id) {
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

  public ProductIM name(String name) {
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

  public ProductIM processes(List<TechnologicalProcessIM> processes) {
    this.processes = processes;
    return this;
  }

  public ProductIM addProcessesItem(TechnologicalProcessIM processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<TechnologicalProcessIM>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * Get processes
   * @return processes
  **/


  public List<TechnologicalProcessIM> getProcesses() {
    return processes;
  }

  public void setProcesses(List<TechnologicalProcessIM> processes) {
    this.processes = processes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductIM productIM = (ProductIM) o;
    return Objects.equals(this.id, productIM.id) &&
        Objects.equals(this.name, productIM.name) &&
        Objects.equals(this.processes, productIM.processes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, processes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductIM {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
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


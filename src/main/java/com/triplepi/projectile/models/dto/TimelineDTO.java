package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * TimelineDTO
 */
@Validated
public class TimelineDTO   {
  @JsonProperty("Orders")
private List<TimelineOrderDTO> orders = null;

  @JsonProperty("Processes")
private List<TimelineProcessDTO> processes = null;

  @JsonProperty("Durations")
private List<TimelineDurationForBatchDTO> durations = null;

  @JsonProperty("WorkCentersLastOperation")
private List<TimelineWorkCenterLastOperationDTO> workCentersLastOperation = null;

  public TimelineDTO orders(List<TimelineOrderDTO> orders) {
    this.orders = orders;
    return this;
  }

  public TimelineDTO addOrdersItem(TimelineOrderDTO ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<TimelineOrderDTO>();
    }
    this.orders.add(ordersItem);
    return this;
  }

  /**
   * Get orders
   * @return orders
  **/


  public List<TimelineOrderDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<TimelineOrderDTO> orders) {
    this.orders = orders;
  }

  public TimelineDTO processes(List<TimelineProcessDTO> processes) {
    this.processes = processes;
    return this;
  }

  public TimelineDTO addProcessesItem(TimelineProcessDTO processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<TimelineProcessDTO>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * Get processes
   * @return processes
  **/


  public List<TimelineProcessDTO> getProcesses() {
    return processes;
  }

  public void setProcesses(List<TimelineProcessDTO> processes) {
    this.processes = processes;
  }

  public TimelineDTO durations(List<TimelineDurationForBatchDTO> durations) {
    this.durations = durations;
    return this;
  }

  public TimelineDTO addDurationsItem(TimelineDurationForBatchDTO durationsItem) {
    if (this.durations == null) {
      this.durations = new ArrayList<TimelineDurationForBatchDTO>();
    }
    this.durations.add(durationsItem);
    return this;
  }

  /**
   * Get durations
   * @return durations
  **/


  public List<TimelineDurationForBatchDTO> getDurations() {
    return durations;
  }

  public void setDurations(List<TimelineDurationForBatchDTO> durations) {
    this.durations = durations;
  }

  public TimelineDTO workCentersLastOperation(List<TimelineWorkCenterLastOperationDTO> workCentersLastOperation) {
    this.workCentersLastOperation = workCentersLastOperation;
    return this;
  }

  public TimelineDTO addWorkCentersLastOperationItem(TimelineWorkCenterLastOperationDTO workCentersLastOperationItem) {
    if (this.workCentersLastOperation == null) {
      this.workCentersLastOperation = new ArrayList<TimelineWorkCenterLastOperationDTO>();
    }
    this.workCentersLastOperation.add(workCentersLastOperationItem);
    return this;
  }

  /**
   * Get workCentersLastOperation
   * @return workCentersLastOperation
  **/


  public List<TimelineWorkCenterLastOperationDTO> getWorkCentersLastOperation() {
    return workCentersLastOperation;
  }

  public void setWorkCentersLastOperation(List<TimelineWorkCenterLastOperationDTO> workCentersLastOperation) {
    this.workCentersLastOperation = workCentersLastOperation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineDTO timelineDTO = (TimelineDTO) o;
    return Objects.equals(this.orders, timelineDTO.orders) &&
        Objects.equals(this.processes, timelineDTO.processes) &&
        Objects.equals(this.durations, timelineDTO.durations) &&
        Objects.equals(this.workCentersLastOperation, timelineDTO.workCentersLastOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders, processes, durations, workCentersLastOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineDTO {\n");

    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
    sb.append("    durations: ").append(toIndentedString(durations)).append("\n");
    sb.append("    workCentersLastOperation: ").append(toIndentedString(workCentersLastOperation)).append("\n");
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


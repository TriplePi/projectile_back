package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * OrderIM
 */
@Validated
public class OrderIM   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Quantity")
  private Integer quantity = null;

  @JsonProperty("Number")
  private String number = null;

  @JsonProperty("Start")
  private LocalDateTime start = null;

  @JsonProperty("Deadline")
  private LocalDateTime deadline = null;

  @JsonProperty("ProcessId")
  private Long processId = null;

  @JsonProperty("Priority")
  private Integer priority = null;

  @JsonProperty("Batches")
private List<BatchIM> batches = null;

  public OrderIM id(Long id) {
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

  public OrderIM quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderIM number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public OrderIM start(LocalDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/


  public LocalDateTime getStart() {
    return start;
  }

  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  public OrderIM deadline(LocalDateTime deadline) {
    this.deadline = deadline;
    return this;
  }

  /**
   * Get deadline
   * @return deadline
  **/


  public LocalDateTime getDeadline() {
    return deadline;
  }

  public void setDeadline(LocalDateTime deadline) {
    this.deadline = deadline;
  }

  public OrderIM processId(Long processId) {
    this.processId = processId;
    return this;
  }

  /**
   * Get processId
   * @return processId
  **/
public Long getProcessId() {
    return processId;
  }

  public void setProcessId(Long processId) {
    this.processId = processId;
  }

  public OrderIM priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public OrderIM batches(List<BatchIM> batches) {
    this.batches = batches;
    return this;
  }

  public OrderIM addBatchesItem(BatchIM batchesItem) {
    if (this.batches == null) {
      this.batches = new ArrayList<BatchIM>();
    }
    this.batches.add(batchesItem);
    return this;
  }

  /**
   * Get batches
   * @return batches
  **/


  public List<BatchIM> getBatches() {
    return batches;
  }

  public void setBatches(List<BatchIM> batches) {
    this.batches = batches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderIM orderIM = (OrderIM) o;
    return Objects.equals(this.id, orderIM.id) &&
        Objects.equals(this.quantity, orderIM.quantity) &&
        Objects.equals(this.number, orderIM.number) &&
        Objects.equals(this.start, orderIM.start) &&
        Objects.equals(this.deadline, orderIM.deadline) &&
        Objects.equals(this.processId, orderIM.processId) &&
        Objects.equals(this.priority, orderIM.priority) &&
        Objects.equals(this.batches, orderIM.batches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, number, start, deadline, processId, priority, batches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderIM {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
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


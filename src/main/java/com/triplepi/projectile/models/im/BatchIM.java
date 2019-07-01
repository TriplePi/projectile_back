package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


/**
 * BatchIM
 */
@Validated
public class BatchIM   {
  @JsonProperty("Id")
  private Long id = null;

  @JsonProperty("Quantity")
  private Integer quantity = null;

  @JsonProperty("Number")
  private Integer number = null;

  @JsonProperty("StartOperationId")
  private Long startOperationId = null;

  public BatchIM id(Long id) {
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

  public BatchIM quantity(Integer quantity) {
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

  public BatchIM number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public BatchIM startOperationId(Long startOperationId) {
    this.startOperationId = startOperationId;
    return this;
  }

  /**
   * Get startOperationId
   * @return startOperationId
  **/
public Long getStartOperationId() {
    return startOperationId;
  }

  public void setStartOperationId(Long startOperationId) {
    this.startOperationId = startOperationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchIM batchIM = (BatchIM) o;
    return Objects.equals(this.id, batchIM.id) &&
        Objects.equals(this.quantity, batchIM.quantity) &&
        Objects.equals(this.number, batchIM.number) &&
        Objects.equals(this.startOperationId, batchIM.startOperationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, number, startOperationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchIM {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    startOperationId: ").append(toIndentedString(startOperationId)).append("\n");
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


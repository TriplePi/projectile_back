package com.triplepi.projectile.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;


/**
 * DailyReportItemDTO
 */
@Validated
public class DailyReportItemDTO   {
  @JsonProperty("product")
  private String product = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("batch")
  private Integer batch = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("workCenter")
  private String workCenter = null;

  @JsonProperty("process")
  private String process = null;

  @JsonProperty("operationOrder")
  private Integer operationOrder = null;

  @JsonProperty("operationMode")
  private String operationMode = null;

  @JsonProperty("startDate")
  private LocalDateTime startDate = null;

  @JsonProperty("finishDate")
  private LocalDateTime finishDate = null;

  public DailyReportItemDTO product(String product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public DailyReportItemDTO order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public DailyReportItemDTO batch(Integer batch) {
    this.batch = batch;
    return this;
  }

  /**
   * Get batch
   * @return batch
  **/
public Integer getBatch() {
    return batch;
  }

  public void setBatch(Integer batch) {
    this.batch = batch;
  }

  public DailyReportItemDTO quantity(Integer quantity) {
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

  public DailyReportItemDTO workCenter(String workCenter) {
    this.workCenter = workCenter;
    return this;
  }

  /**
   * Get workCenter
   * @return workCenter
  **/
public String getWorkCenter() {
    return workCenter;
  }

  public void setWorkCenter(String workCenter) {
    this.workCenter = workCenter;
  }

  public DailyReportItemDTO process(String process) {
    this.process = process;
    return this;
  }

  /**
   * Get process
   * @return process
  **/
public String getProcess() {
    return process;
  }

  public void setProcess(String process) {
    this.process = process;
  }

  public DailyReportItemDTO operationOrder(Integer operationOrder) {
    this.operationOrder = operationOrder;
    return this;
  }

  /**
   * Get operationOrder
   * @return operationOrder
  **/
public Integer getOperationOrder() {
    return operationOrder;
  }

  public void setOperationOrder(Integer operationOrder) {
    this.operationOrder = operationOrder;
  }

  public DailyReportItemDTO operationMode(String operationMode) {
    this.operationMode = operationMode;
    return this;
  }

  /**
   * Get operationMode
   * @return operationMode
  **/
public String getOperationMode() {
    return operationMode;
  }

  public void setOperationMode(String operationMode) {
    this.operationMode = operationMode;
  }

  public DailyReportItemDTO startDate(LocalDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/


  public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public DailyReportItemDTO finishDate(LocalDateTime finishDate) {
    this.finishDate = finishDate;
    return this;
  }

  /**
   * Get finishDate
   * @return finishDate
  **/


  public LocalDateTime getFinishDate() {
    return finishDate;
  }

  public void setFinishDate(LocalDateTime finishDate) {
    this.finishDate = finishDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyReportItemDTO dailyReportItemDTO = (DailyReportItemDTO) o;
    return Objects.equals(this.product, dailyReportItemDTO.product) &&
        Objects.equals(this.order, dailyReportItemDTO.order) &&
        Objects.equals(this.batch, dailyReportItemDTO.batch) &&
        Objects.equals(this.quantity, dailyReportItemDTO.quantity) &&
        Objects.equals(this.workCenter, dailyReportItemDTO.workCenter) &&
        Objects.equals(this.process, dailyReportItemDTO.process) &&
        Objects.equals(this.operationOrder, dailyReportItemDTO.operationOrder) &&
        Objects.equals(this.operationMode, dailyReportItemDTO.operationMode) &&
        Objects.equals(this.startDate, dailyReportItemDTO.startDate) &&
        Objects.equals(this.finishDate, dailyReportItemDTO.finishDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, order, batch, quantity, workCenter, process, operationOrder, operationMode, startDate, finishDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyReportItemDTO {\n");

    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    workCenter: ").append(toIndentedString(workCenter)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    operationOrder: ").append(toIndentedString(operationOrder)).append("\n");
    sb.append("    operationMode: ").append(toIndentedString(operationMode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
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


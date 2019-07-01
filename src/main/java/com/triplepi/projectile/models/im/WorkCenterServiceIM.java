package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * WorkCenterServiceIM
 */
@Validated
public class WorkCenterServiceIM   {
  @JsonProperty("Start")
  private LocalDateTime start = null;

  @JsonProperty("Finish")
  private LocalDateTime finish = null;

  @JsonProperty("Service")
private List<DateTimeRangeIM> service = null;

  public WorkCenterServiceIM start(LocalDateTime start) {
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

  public WorkCenterServiceIM finish(LocalDateTime finish) {
    this.finish = finish;
    return this;
  }

  /**
   * Get finish
   * @return finish
  **/


  public LocalDateTime getFinish() {
    return finish;
  }

  public void setFinish(LocalDateTime finish) {
    this.finish = finish;
  }

  public WorkCenterServiceIM service(List<DateTimeRangeIM> service) {
    this.service = service;
    return this;
  }

  public WorkCenterServiceIM addServiceItem(DateTimeRangeIM serviceItem) {
    if (this.service == null) {
      this.service = new ArrayList<DateTimeRangeIM>();
    }
    this.service.add(serviceItem);
    return this;
  }

  /**
   * Get service
   * @return service
  **/


  public List<DateTimeRangeIM> getService() {
    return service;
  }

  public void setService(List<DateTimeRangeIM> service) {
    this.service = service;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkCenterServiceIM workCenterServiceIM = (WorkCenterServiceIM) o;
    return Objects.equals(this.start, workCenterServiceIM.start) &&
        Objects.equals(this.finish, workCenterServiceIM.finish) &&
        Objects.equals(this.service, workCenterServiceIM.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, finish, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkCenterServiceIM {\n");

    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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


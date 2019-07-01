package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * ScheduleIM
 */
@Validated
public class ScheduleIM   {
  @JsonProperty("Items")
private List<ScheduleItemIM> items = new ArrayList<ScheduleItemIM>();

  @JsonProperty("Begin")
  private LocalDateTime begin = null;

  public ScheduleIM items(List<ScheduleItemIM> items) {
    this.items = items;
    return this;
  }

  public ScheduleIM addItemsItem(ScheduleItemIM itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  **/
  @NotNull

public List<ScheduleItemIM> getItems() {
    return items;
  }

  public void setItems(List<ScheduleItemIM> items) {
    this.items = items;
  }

  public ScheduleIM begin(LocalDateTime begin) {
    this.begin = begin;
    return this;
  }

  /**
   * Get begin
   * @return begin
  **/

  @NotNull

public LocalDateTime getBegin() {
    return begin;
  }

  public void setBegin(LocalDateTime begin) {
    this.begin = begin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleIM scheduleIM = (ScheduleIM) o;
    return Objects.equals(this.items, scheduleIM.items) &&
        Objects.equals(this.begin, scheduleIM.begin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, begin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleIM {\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
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


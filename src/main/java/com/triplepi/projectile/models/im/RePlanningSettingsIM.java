package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * RePlanningSettingsIM
 */
@Validated
public class RePlanningSettingsIM   {
  @JsonProperty("FixItems")
private List<FixScheduleItemIM> fixItems = new ArrayList<FixScheduleItemIM>();

  public RePlanningSettingsIM fixItems(List<FixScheduleItemIM> fixItems) {
    this.fixItems = fixItems;
    return this;
  }

  public RePlanningSettingsIM addFixItemsItem(FixScheduleItemIM fixItemsItem) {
    this.fixItems.add(fixItemsItem);
    return this;
  }

  /**
   * Get fixItems
   * @return fixItems
  **/

  @NotNull

public List<FixScheduleItemIM> getFixItems() {
    return fixItems;
  }

  public void setFixItems(List<FixScheduleItemIM> fixItems) {
    this.fixItems = fixItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RePlanningSettingsIM rePlanningSettingsIM = (RePlanningSettingsIM) o;
    return Objects.equals(this.fixItems, rePlanningSettingsIM.fixItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RePlanningSettingsIM {\n");

    sb.append("    fixItems: ").append(toIndentedString(fixItems)).append("\n");
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


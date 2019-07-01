package com.triplepi.projectile.models.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


/**
 * ScheduleItemProgressIM
 */
@Validated
public class ScheduleItemProgressIM   {
  @JsonProperty("Processed")
  private ScheduleItemProgressProcessedIM processed = null;

  @JsonProperty("Quarantine")
  private ScheduleItemProgressQuarantineIM quarantine = null;

  public ScheduleItemProgressIM processed(ScheduleItemProgressProcessedIM processed) {
    this.processed = processed;
    return this;
  }

  /**
   * Get processed
   * @return processed
  **/


  public ScheduleItemProgressProcessedIM getProcessed() {
    return processed;
  }

  public void setProcessed(ScheduleItemProgressProcessedIM processed) {
    this.processed = processed;
  }

  public ScheduleItemProgressIM quarantine(ScheduleItemProgressQuarantineIM quarantine) {
    this.quarantine = quarantine;
    return this;
  }

  /**
   * Get quarantine
   * @return quarantine
  **/


  public ScheduleItemProgressQuarantineIM getQuarantine() {
    return quarantine;
  }

  public void setQuarantine(ScheduleItemProgressQuarantineIM quarantine) {
    this.quarantine = quarantine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleItemProgressIM scheduleItemProgressIM = (ScheduleItemProgressIM) o;
    return Objects.equals(this.processed, scheduleItemProgressIM.processed) &&
        Objects.equals(this.quarantine, scheduleItemProgressIM.quarantine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processed, quarantine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleItemProgressIM {\n");
    
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    quarantine: ").append(toIndentedString(quarantine)).append("\n");
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


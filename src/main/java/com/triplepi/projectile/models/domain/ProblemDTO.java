package com.triplepi.projectile.models.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


/**
 * ProblemDTO
 */
@Validated
@Entity
public class ProblemDTO   {
  @JsonProperty("Id")
  @Id
  private Long id = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CREATED("Created"),

    PROCESSING("Processing"),

    SOLUTIONFOUND("SolutionFound"),

    IRRELEVANT("Irrelevant"),

    RESOLVED("Resolved"),

    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Status")
  private StatusEnum status = null;

  @JsonProperty("Timestamp")
  private Long timestamp = null;

  public ProblemDTO id(Long id) {
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

  public ProblemDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ProblemDTO timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDTO problemDTO = (ProblemDTO) o;
    return Objects.equals(this.id, problemDTO.id) &&
        Objects.equals(this.status, problemDTO.status) &&
        Objects.equals(this.timestamp, problemDTO.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDTO {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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


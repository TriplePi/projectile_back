package com.triplepi.projectile.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * IFormFile
 */
@Validated
public class IFormFile   {
  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("contentDisposition")
  private String contentDisposition = null;

  @JsonProperty("headers")
private Map<String, List<String>> headers = null;

  @JsonProperty("length")
  private Long length = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("fileName")
  private String fileName = null;

  public IFormFile contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
  **/



  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public IFormFile contentDisposition(String contentDisposition) {
    this.contentDisposition = contentDisposition;
    return this;
  }

  /**
   * Get contentDisposition
   * @return contentDisposition
  **/



  public String getContentDisposition() {
    return contentDisposition;
  }

  public void setContentDisposition(String contentDisposition) {
    this.contentDisposition = contentDisposition;
  }

  public IFormFile headers(Map<String, List<String>> headers) {
    this.headers = headers;
    return this;
  }

  public IFormFile putHeadersItem(String key, List<String> headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, List<String>>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Get headers
   * @return headers
  **/


public Map<String, List<String>> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, List<String>> headers) {
    this.headers = headers;
  }

  public IFormFile length(Long length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
  **/



  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public IFormFile name(String name) {
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

  public IFormFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  **/



  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IFormFile iformFile = (IFormFile) o;
    return Objects.equals(this.contentType, iformFile.contentType) &&
        Objects.equals(this.contentDisposition, iformFile.contentDisposition) &&
        Objects.equals(this.headers, iformFile.headers) &&
        Objects.equals(this.length, iformFile.length) &&
        Objects.equals(this.name, iformFile.name) &&
        Objects.equals(this.fileName, iformFile.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, contentDisposition, headers, length, name, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IFormFile {\n");

    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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


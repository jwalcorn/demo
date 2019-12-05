package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ResponseHeaderXsd1   {
  
  private String correlationId = null;
  private String journeyId = null;
  private String key = null;
  private String responseCode = null;
  private String responseDesc = null;
  private String resultId = null;
  private String timeStamp = null;
  private String value = null;

  /**
   **/
  public ResponseHeaderXsd1 correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  /**
   **/
  public ResponseHeaderXsd1 journeyId(String journeyId) {
    this.journeyId = journeyId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("journeyId")
  @NotNull
  public String getJourneyId() {
    return journeyId;
  }
  public void setJourneyId(String journeyId) {
    this.journeyId = journeyId;
  }

  /**
   **/
  public ResponseHeaderXsd1 key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   **/
  public ResponseHeaderXsd1 responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("responseCode")
  @NotNull
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  /**
   **/
  public ResponseHeaderXsd1 responseDesc(String responseDesc) {
    this.responseDesc = responseDesc;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("responseDesc")
  public String getResponseDesc() {
    return responseDesc;
  }
  public void setResponseDesc(String responseDesc) {
    this.responseDesc = responseDesc;
  }

  /**
   **/
  public ResponseHeaderXsd1 resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("resultId")
  @NotNull
  public String getResultId() {
    return resultId;
  }
  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  /**
   **/
  public ResponseHeaderXsd1 timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timeStamp")
  public String getTimeStamp() {
    return timeStamp;
  }
  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  /**
   **/
  public ResponseHeaderXsd1 value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHeaderXsd1 responseHeaderXsd1 = (ResponseHeaderXsd1) o;
    return Objects.equals(correlationId, responseHeaderXsd1.correlationId) &&
        Objects.equals(journeyId, responseHeaderXsd1.journeyId) &&
        Objects.equals(key, responseHeaderXsd1.key) &&
        Objects.equals(responseCode, responseHeaderXsd1.responseCode) &&
        Objects.equals(responseDesc, responseHeaderXsd1.responseDesc) &&
        Objects.equals(resultId, responseHeaderXsd1.resultId) &&
        Objects.equals(timeStamp, responseHeaderXsd1.timeStamp) &&
        Objects.equals(value, responseHeaderXsd1.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationId, journeyId, key, responseCode, responseDesc, resultId, timeStamp, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHeaderXsd1 {\n");
    
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    journeyId: ").append(toIndentedString(journeyId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseDesc: ").append(toIndentedString(responseDesc)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


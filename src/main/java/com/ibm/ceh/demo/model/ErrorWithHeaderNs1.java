package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.ErrorResponseXsd1;
import com.ibm.ceh.demo.model.ResponseHeaderXsd1;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ErrorWithHeaderNs1   {
  
  private ErrorResponseXsd1 errorResponse = null;
  private ResponseHeaderXsd1 responseHeader = null;

  /**
   **/
  public ErrorWithHeaderNs1 errorResponse(ErrorResponseXsd1 errorResponse) {
    this.errorResponse = errorResponse;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("errorResponse")
  @NotNull
  public ErrorResponseXsd1 getErrorResponse() {
    return errorResponse;
  }
  public void setErrorResponse(ErrorResponseXsd1 errorResponse) {
    this.errorResponse = errorResponse;
  }

  /**
   **/
  public ErrorWithHeaderNs1 responseHeader(ResponseHeaderXsd1 responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("responseHeader")
  @NotNull
  public ResponseHeaderXsd1 getResponseHeader() {
    return responseHeader;
  }
  public void setResponseHeader(ResponseHeaderXsd1 responseHeader) {
    this.responseHeader = responseHeader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorWithHeaderNs1 errorWithHeaderNs1 = (ErrorWithHeaderNs1) o;
    return Objects.equals(errorResponse, errorWithHeaderNs1.errorResponse) &&
        Objects.equals(responseHeader, errorWithHeaderNs1.responseHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorResponse, responseHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorWithHeaderNs1 {\n");
    
    sb.append("    errorResponse: ").append(toIndentedString(errorResponse)).append("\n");
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
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


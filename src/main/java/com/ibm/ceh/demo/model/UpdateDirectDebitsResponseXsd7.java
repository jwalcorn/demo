package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.ResponseHeaderXsd1;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class UpdateDirectDebitsResponseXsd7   {
  
  private ResponseHeaderXsd1 responseHeader = null;

  /**
   **/
  public UpdateDirectDebitsResponseXsd7 responseHeader(ResponseHeaderXsd1 responseHeader) {
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
    UpdateDirectDebitsResponseXsd7 updateDirectDebitsResponseXsd7 = (UpdateDirectDebitsResponseXsd7) o;
    return Objects.equals(responseHeader, updateDirectDebitsResponseXsd7.responseHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDirectDebitsResponseXsd7 {\n");
    
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


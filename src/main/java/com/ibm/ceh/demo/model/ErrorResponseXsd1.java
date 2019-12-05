package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.SystemErrorResponseXsd1;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ErrorResponseXsd1   {
  
  private String code = null;
  private String description = null;
  private String system = null;
  private List<SystemErrorResponseXsd1> systemErrorResponse = new ArrayList<SystemErrorResponseXsd1>();

  /**
   **/
  public ErrorResponseXsd1 code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public ErrorResponseXsd1 description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public ErrorResponseXsd1 system(String system) {
    this.system = system;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("system")
  public String getSystem() {
    return system;
  }
  public void setSystem(String system) {
    this.system = system;
  }

  /**
   **/
  public ErrorResponseXsd1 systemErrorResponse(List<SystemErrorResponseXsd1> systemErrorResponse) {
    this.systemErrorResponse = systemErrorResponse;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("systemErrorResponse")
  public List<SystemErrorResponseXsd1> getSystemErrorResponse() {
    return systemErrorResponse;
  }
  public void setSystemErrorResponse(List<SystemErrorResponseXsd1> systemErrorResponse) {
    this.systemErrorResponse = systemErrorResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseXsd1 errorResponseXsd1 = (ErrorResponseXsd1) o;
    return Objects.equals(code, errorResponseXsd1.code) &&
        Objects.equals(description, errorResponseXsd1.description) &&
        Objects.equals(system, errorResponseXsd1.system) &&
        Objects.equals(systemErrorResponse, errorResponseXsd1.systemErrorResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, system, systemErrorResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseXsd1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    systemErrorResponse: ").append(toIndentedString(systemErrorResponse)).append("\n");
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


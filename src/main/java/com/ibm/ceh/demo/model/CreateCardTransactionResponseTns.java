package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.CreateCardTransactionResponseXsd3;
import com.ibm.ceh.demo.model.ErrorWithHeaderNs1;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class CreateCardTransactionResponseTns   {
  
  private ErrorWithHeaderNs1 exception = null;
  private CreateCardTransactionResponseXsd3 response = null;

  /**
   **/
  public CreateCardTransactionResponseTns exception(ErrorWithHeaderNs1 exception) {
    this.exception = exception;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exception")
  public ErrorWithHeaderNs1 getException() {
    return exception;
  }
  public void setException(ErrorWithHeaderNs1 exception) {
    this.exception = exception;
  }

  /**
   **/
  public CreateCardTransactionResponseTns response(CreateCardTransactionResponseXsd3 response) {
    this.response = response;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response")
  public CreateCardTransactionResponseXsd3 getResponse() {
    return response;
  }
  public void setResponse(CreateCardTransactionResponseXsd3 response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCardTransactionResponseTns createCardTransactionResponseTns = (CreateCardTransactionResponseTns) o;
    return Objects.equals(exception, createCardTransactionResponseTns.exception) &&
        Objects.equals(response, createCardTransactionResponseTns.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCardTransactionResponseTns {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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


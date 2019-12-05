package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.CreateCardTransactionTns;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class CreateCardTransactionInput   {
  
  private CreateCardTransactionTns body = null;

  /**
   **/
  public CreateCardTransactionInput body(CreateCardTransactionTns body) {
    this.body = body;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("Body")
  @NotNull
  public CreateCardTransactionTns getBody() {
    return body;
  }
  public void setBody(CreateCardTransactionTns body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCardTransactionInput createCardTransactionInput = (CreateCardTransactionInput) o;
    return Objects.equals(body, createCardTransactionInput.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCardTransactionInput {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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


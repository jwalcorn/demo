package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.GetCustomerCardDetailsResponseTns;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class GetCustomerCardDetailsOutput   {
  
  private GetCustomerCardDetailsResponseTns body = null;

  /**
   **/
  public GetCustomerCardDetailsOutput body(GetCustomerCardDetailsResponseTns body) {
    this.body = body;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Body")
  public GetCustomerCardDetailsResponseTns getBody() {
    return body;
  }
  public void setBody(GetCustomerCardDetailsResponseTns body) {
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
    GetCustomerCardDetailsOutput getCustomerCardDetailsOutput = (GetCustomerCardDetailsOutput) o;
    return Objects.equals(body, getCustomerCardDetailsOutput.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerCardDetailsOutput {\n");
    
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


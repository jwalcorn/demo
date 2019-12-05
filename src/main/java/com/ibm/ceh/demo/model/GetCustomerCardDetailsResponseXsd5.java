package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.CardDetailsNs3;
import com.ibm.ceh.demo.model.ResponseHeaderXsd1;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class GetCustomerCardDetailsResponseXsd5   {
  
  private List<CardDetailsNs3> payload = new ArrayList<CardDetailsNs3>();
  private ResponseHeaderXsd1 responseHeader = null;

  /**
   **/
  public GetCustomerCardDetailsResponseXsd5 payload(List<CardDetailsNs3> payload) {
    this.payload = payload;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("payload")
  public List<CardDetailsNs3> getPayload() {
    return payload;
  }
  public void setPayload(List<CardDetailsNs3> payload) {
    this.payload = payload;
  }

  /**
   **/
  public GetCustomerCardDetailsResponseXsd5 responseHeader(ResponseHeaderXsd1 responseHeader) {
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
    GetCustomerCardDetailsResponseXsd5 getCustomerCardDetailsResponseXsd5 = (GetCustomerCardDetailsResponseXsd5) o;
    return Objects.equals(payload, getCustomerCardDetailsResponseXsd5.payload) &&
        Objects.equals(responseHeader, getCustomerCardDetailsResponseXsd5.responseHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, responseHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerCardDetailsResponseXsd5 {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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


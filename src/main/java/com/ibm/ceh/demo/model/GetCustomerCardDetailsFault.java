package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.ICardManagementFinancialTransactiongetCustomerCardDetailsFaultTns;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class GetCustomerCardDetailsFault   {
  
  private ICardManagementFinancialTransactiongetCustomerCardDetailsFaultTns getCustomerCardDetailsFault = null;

  /**
   **/
  public GetCustomerCardDetailsFault getCustomerCardDetailsFault(ICardManagementFinancialTransactiongetCustomerCardDetailsFaultTns getCustomerCardDetailsFault) {
    this.getCustomerCardDetailsFault = getCustomerCardDetailsFault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("getCustomerCardDetailsFault")
  public ICardManagementFinancialTransactiongetCustomerCardDetailsFaultTns getGetCustomerCardDetailsFault() {
    return getCustomerCardDetailsFault;
  }
  public void setGetCustomerCardDetailsFault(ICardManagementFinancialTransactiongetCustomerCardDetailsFaultTns getCustomerCardDetailsFault) {
    this.getCustomerCardDetailsFault = getCustomerCardDetailsFault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCustomerCardDetailsFault getCustomerCardDetailsFault = (GetCustomerCardDetailsFault) o;
    return Objects.equals(getCustomerCardDetailsFault, getCustomerCardDetailsFault.getCustomerCardDetailsFault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCustomerCardDetailsFault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerCardDetailsFault {\n");
    
    sb.append("    getCustomerCardDetailsFault: ").append(toIndentedString(getCustomerCardDetailsFault)).append("\n");
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


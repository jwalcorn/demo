package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.ICardManagementFinancialTransactiongetCardAccountEnquiryFaultTns;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class GetCardAccountEnquiryFault   {
  
  private ICardManagementFinancialTransactiongetCardAccountEnquiryFaultTns getCardAccountEnquiryFault = null;

  /**
   **/
  public GetCardAccountEnquiryFault getCardAccountEnquiryFault(ICardManagementFinancialTransactiongetCardAccountEnquiryFaultTns getCardAccountEnquiryFault) {
    this.getCardAccountEnquiryFault = getCardAccountEnquiryFault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("getCardAccountEnquiryFault")
  public ICardManagementFinancialTransactiongetCardAccountEnquiryFaultTns getGetCardAccountEnquiryFault() {
    return getCardAccountEnquiryFault;
  }
  public void setGetCardAccountEnquiryFault(ICardManagementFinancialTransactiongetCardAccountEnquiryFaultTns getCardAccountEnquiryFault) {
    this.getCardAccountEnquiryFault = getCardAccountEnquiryFault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardAccountEnquiryFault getCardAccountEnquiryFault = (GetCardAccountEnquiryFault) o;
    return Objects.equals(getCardAccountEnquiryFault, getCardAccountEnquiryFault.getCardAccountEnquiryFault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCardAccountEnquiryFault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardAccountEnquiryFault {\n");
    
    sb.append("    getCardAccountEnquiryFault: ").append(toIndentedString(getCardAccountEnquiryFault)).append("\n");
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


package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.BankAccountDetailsNs3;
import com.ibm.ceh.demo.model.CreditAccountLinkDetailsNs3;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class UpdateDirectDebitsTns   {
  
  private String actionCode = null;
  private BankAccountDetailsNs3 bankAccountDetails = null;
  private CreditAccountLinkDetailsNs3 creditAccountLinkDeatils = null;

  /**
   **/
  public UpdateDirectDebitsTns actionCode(String actionCode) {
    this.actionCode = actionCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("actionCode")
  @NotNull
  public String getActionCode() {
    return actionCode;
  }
  public void setActionCode(String actionCode) {
    this.actionCode = actionCode;
  }

  /**
   **/
  public UpdateDirectDebitsTns bankAccountDetails(BankAccountDetailsNs3 bankAccountDetails) {
    this.bankAccountDetails = bankAccountDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("bankAccountDetails")
  @NotNull
  public BankAccountDetailsNs3 getBankAccountDetails() {
    return bankAccountDetails;
  }
  public void setBankAccountDetails(BankAccountDetailsNs3 bankAccountDetails) {
    this.bankAccountDetails = bankAccountDetails;
  }

  /**
   **/
  public UpdateDirectDebitsTns creditAccountLinkDeatils(CreditAccountLinkDetailsNs3 creditAccountLinkDeatils) {
    this.creditAccountLinkDeatils = creditAccountLinkDeatils;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("creditAccountLinkDeatils")
  @NotNull
  public CreditAccountLinkDetailsNs3 getCreditAccountLinkDeatils() {
    return creditAccountLinkDeatils;
  }
  public void setCreditAccountLinkDeatils(CreditAccountLinkDetailsNs3 creditAccountLinkDeatils) {
    this.creditAccountLinkDeatils = creditAccountLinkDeatils;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDirectDebitsTns updateDirectDebitsTns = (UpdateDirectDebitsTns) o;
    return Objects.equals(actionCode, updateDirectDebitsTns.actionCode) &&
        Objects.equals(bankAccountDetails, updateDirectDebitsTns.bankAccountDetails) &&
        Objects.equals(creditAccountLinkDeatils, updateDirectDebitsTns.creditAccountLinkDeatils);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCode, bankAccountDetails, creditAccountLinkDeatils);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDirectDebitsTns {\n");
    
    sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
    sb.append("    bankAccountDetails: ").append(toIndentedString(bankAccountDetails)).append("\n");
    sb.append("    creditAccountLinkDeatils: ").append(toIndentedString(creditAccountLinkDeatils)).append("\n");
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


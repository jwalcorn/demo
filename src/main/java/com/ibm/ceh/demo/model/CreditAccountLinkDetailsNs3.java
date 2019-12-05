package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.LimitTypeNs3;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class CreditAccountLinkDetailsNs3   {
  
  private String accountNumber = null;
  private String creditProfile = null;
  private String cycleCode = null;
  private String directDebitOption = null;
  private String interestIndex = null;
  private LimitTypeNs3 limits = null;
  private String minDueIndex = null;
  private String penalityFeeWaiver = null;
  private String statementCode = null;
  private String statementOption = null;
  private String updateCreditAccountPaymentMode = null;

  /**
   **/
  public CreditAccountLinkDetailsNs3 accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountNumber")
  @NotNull
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 creditProfile(String creditProfile) {
    this.creditProfile = creditProfile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creditProfile")
  public String getCreditProfile() {
    return creditProfile;
  }
  public void setCreditProfile(String creditProfile) {
    this.creditProfile = creditProfile;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 cycleCode(String cycleCode) {
    this.cycleCode = cycleCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cycleCode")
  public String getCycleCode() {
    return cycleCode;
  }
  public void setCycleCode(String cycleCode) {
    this.cycleCode = cycleCode;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 directDebitOption(String directDebitOption) {
    this.directDebitOption = directDebitOption;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("directDebitOption")
  public String getDirectDebitOption() {
    return directDebitOption;
  }
  public void setDirectDebitOption(String directDebitOption) {
    this.directDebitOption = directDebitOption;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 interestIndex(String interestIndex) {
    this.interestIndex = interestIndex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("interestIndex")
  public String getInterestIndex() {
    return interestIndex;
  }
  public void setInterestIndex(String interestIndex) {
    this.interestIndex = interestIndex;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 limits(LimitTypeNs3 limits) {
    this.limits = limits;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("limits")
  public LimitTypeNs3 getLimits() {
    return limits;
  }
  public void setLimits(LimitTypeNs3 limits) {
    this.limits = limits;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 minDueIndex(String minDueIndex) {
    this.minDueIndex = minDueIndex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("minDueIndex")
  public String getMinDueIndex() {
    return minDueIndex;
  }
  public void setMinDueIndex(String minDueIndex) {
    this.minDueIndex = minDueIndex;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 penalityFeeWaiver(String penalityFeeWaiver) {
    this.penalityFeeWaiver = penalityFeeWaiver;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("penalityFeeWaiver")
  public String getPenalityFeeWaiver() {
    return penalityFeeWaiver;
  }
  public void setPenalityFeeWaiver(String penalityFeeWaiver) {
    this.penalityFeeWaiver = penalityFeeWaiver;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 statementCode(String statementCode) {
    this.statementCode = statementCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("statementCode")
  public String getStatementCode() {
    return statementCode;
  }
  public void setStatementCode(String statementCode) {
    this.statementCode = statementCode;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 statementOption(String statementOption) {
    this.statementOption = statementOption;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("statementOption")
  public String getStatementOption() {
    return statementOption;
  }
  public void setStatementOption(String statementOption) {
    this.statementOption = statementOption;
  }

  /**
   **/
  public CreditAccountLinkDetailsNs3 updateCreditAccountPaymentMode(String updateCreditAccountPaymentMode) {
    this.updateCreditAccountPaymentMode = updateCreditAccountPaymentMode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updateCreditAccountPaymentMode")
  public String getUpdateCreditAccountPaymentMode() {
    return updateCreditAccountPaymentMode;
  }
  public void setUpdateCreditAccountPaymentMode(String updateCreditAccountPaymentMode) {
    this.updateCreditAccountPaymentMode = updateCreditAccountPaymentMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditAccountLinkDetailsNs3 creditAccountLinkDetailsNs3 = (CreditAccountLinkDetailsNs3) o;
    return Objects.equals(accountNumber, creditAccountLinkDetailsNs3.accountNumber) &&
        Objects.equals(creditProfile, creditAccountLinkDetailsNs3.creditProfile) &&
        Objects.equals(cycleCode, creditAccountLinkDetailsNs3.cycleCode) &&
        Objects.equals(directDebitOption, creditAccountLinkDetailsNs3.directDebitOption) &&
        Objects.equals(interestIndex, creditAccountLinkDetailsNs3.interestIndex) &&
        Objects.equals(limits, creditAccountLinkDetailsNs3.limits) &&
        Objects.equals(minDueIndex, creditAccountLinkDetailsNs3.minDueIndex) &&
        Objects.equals(penalityFeeWaiver, creditAccountLinkDetailsNs3.penalityFeeWaiver) &&
        Objects.equals(statementCode, creditAccountLinkDetailsNs3.statementCode) &&
        Objects.equals(statementOption, creditAccountLinkDetailsNs3.statementOption) &&
        Objects.equals(updateCreditAccountPaymentMode, creditAccountLinkDetailsNs3.updateCreditAccountPaymentMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, creditProfile, cycleCode, directDebitOption, interestIndex, limits, minDueIndex, penalityFeeWaiver, statementCode, statementOption, updateCreditAccountPaymentMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditAccountLinkDetailsNs3 {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    creditProfile: ").append(toIndentedString(creditProfile)).append("\n");
    sb.append("    cycleCode: ").append(toIndentedString(cycleCode)).append("\n");
    sb.append("    directDebitOption: ").append(toIndentedString(directDebitOption)).append("\n");
    sb.append("    interestIndex: ").append(toIndentedString(interestIndex)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    minDueIndex: ").append(toIndentedString(minDueIndex)).append("\n");
    sb.append("    penalityFeeWaiver: ").append(toIndentedString(penalityFeeWaiver)).append("\n");
    sb.append("    statementCode: ").append(toIndentedString(statementCode)).append("\n");
    sb.append("    statementOption: ").append(toIndentedString(statementOption)).append("\n");
    sb.append("    updateCreditAccountPaymentMode: ").append(toIndentedString(updateCreditAccountPaymentMode)).append("\n");
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


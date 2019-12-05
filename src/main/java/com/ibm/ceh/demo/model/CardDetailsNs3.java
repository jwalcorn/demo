package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class CardDetailsNs3   {
  
  private String accountNumber = null;
  private String activationFlag = null;
  private String cardActivationDate = null;
  private String cardFeesCode = null;
  private String cardHolderName = null;
  private String cardHolderType = null;
  private String cardStatus = null;
  private String cardStatusDate = null;
  private String cardToken = null;
  private String clientCode = null;
  private String corporateEmbossedName = null;
  private String corporateId = null;
  private String expiryDate = null;
  private String formerExpiryDate = null;
  private String issueDate = null;
  private String maskedCard = null;
  private String parentCardNumber = null;
  private String previousCardNumber = null;
  private String productCode = null;
  private String reportingBranch = null;
  private String stopListFlag = null;
  private String stopListRangeDate = null;
  private String stopListReasonCode = null;
  private String userCif = null;

  /**
   **/
  public CardDetailsNs3 accountNumber(String accountNumber) {
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
   * This field indicates whether the card is activated or not.
   **/
  public CardDetailsNs3 activationFlag(String activationFlag) {
    this.activationFlag = activationFlag;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "This field indicates whether the card is activated or not.")
  @JsonProperty("activationFlag")
  @NotNull
  public String getActivationFlag() {
    return activationFlag;
  }
  public void setActivationFlag(String activationFlag) {
    this.activationFlag = activationFlag;
  }

  /**
   * This field indicates the last card activation date
   **/
  public CardDetailsNs3 cardActivationDate(String cardActivationDate) {
    this.cardActivationDate = cardActivationDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "This field indicates the last card activation date")
  @JsonProperty("cardActivationDate")
  @NotNull
  public String getCardActivationDate() {
    return cardActivationDate;
  }
  public void setCardActivationDate(String cardActivationDate) {
    this.cardActivationDate = cardActivationDate;
  }

  /**
   * Refers to the card fee code that will be assigned to the customer primary card number of the customer being sent in the request
   **/
  public CardDetailsNs3 cardFeesCode(String cardFeesCode) {
    this.cardFeesCode = cardFeesCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Refers to the card fee code that will be assigned to the customer primary card number of the customer being sent in the request")
  @JsonProperty("cardFeesCode")
  @NotNull
  public String getCardFeesCode() {
    return cardFeesCode;
  }
  public void setCardFeesCode(String cardFeesCode) {
    this.cardFeesCode = cardFeesCode;
  }

  /**
   * Card Holder Name
   **/
  public CardDetailsNs3 cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Card Holder Name")
  @JsonProperty("cardHolderName")
  @NotNull
  public String getCardHolderName() {
    return cardHolderName;
  }
  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  /**
   **/
  public CardDetailsNs3 cardHolderType(String cardHolderType) {
    this.cardHolderType = cardHolderType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cardHolderType")
  @NotNull
  public String getCardHolderType() {
    return cardHolderType;
  }
  public void setCardHolderType(String cardHolderType) {
    this.cardHolderType = cardHolderType;
  }

  /**
   * Status of the card
   **/
  public CardDetailsNs3 cardStatus(String cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status of the card")
  @JsonProperty("cardStatus")
  @NotNull
  public String getCardStatus() {
    return cardStatus;
  }
  public void setCardStatus(String cardStatus) {
    this.cardStatus = cardStatus;
  }

  /**
   * Last Status Change Date
   **/
  public CardDetailsNs3 cardStatusDate(String cardStatusDate) {
    this.cardStatusDate = cardStatusDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Last Status Change Date")
  @JsonProperty("cardStatusDate")
  @NotNull
  public String getCardStatusDate() {
    return cardStatusDate;
  }
  public void setCardStatusDate(String cardStatusDate) {
    this.cardStatusDate = cardStatusDate;
  }

  /**
   **/
  public CardDetailsNs3 cardToken(String cardToken) {
    this.cardToken = cardToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cardToken")
  @NotNull
  public String getCardToken() {
    return cardToken;
  }
  public void setCardToken(String cardToken) {
    this.cardToken = cardToken;
  }

  /**
   * Client code linked to the card
   **/
  public CardDetailsNs3 clientCode(String clientCode) {
    this.clientCode = clientCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Client code linked to the card")
  @JsonProperty("clientCode")
  @NotNull
  public String getClientCode() {
    return clientCode;
  }
  public void setClientCode(String clientCode) {
    this.clientCode = clientCode;
  }

  /**
   * Card Corporate Embossed Name
   **/
  public CardDetailsNs3 corporateEmbossedName(String corporateEmbossedName) {
    this.corporateEmbossedName = corporateEmbossedName;
    return this;
  }

  
  @ApiModelProperty(value = "Card Corporate Embossed Name")
  @JsonProperty("corporateEmbossedName")
  public String getCorporateEmbossedName() {
    return corporateEmbossedName;
  }
  public void setCorporateEmbossedName(String corporateEmbossedName) {
    this.corporateEmbossedName = corporateEmbossedName;
  }

  /**
   **/
  public CardDetailsNs3 corporateId(String corporateId) {
    this.corporateId = corporateId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("corporateId")
  public String getCorporateId() {
    return corporateId;
  }
  public void setCorporateId(String corporateId) {
    this.corporateId = corporateId;
  }

  /**
   * Card Expiry Date
   **/
  public CardDetailsNs3 expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Card Expiry Date")
  @JsonProperty("expiryDate")
  @NotNull
  public String getExpiryDate() {
    return expiryDate;
  }
  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   * Renewed Card Expiry Date
   **/
  public CardDetailsNs3 formerExpiryDate(String formerExpiryDate) {
    this.formerExpiryDate = formerExpiryDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Renewed Card Expiry Date")
  @JsonProperty("formerExpiryDate")
  @NotNull
  public String getFormerExpiryDate() {
    return formerExpiryDate;
  }
  public void setFormerExpiryDate(String formerExpiryDate) {
    this.formerExpiryDate = formerExpiryDate;
  }

  /**
   * Identification issue date
   **/
  public CardDetailsNs3 issueDate(String issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identification issue date")
  @JsonProperty("issueDate")
  @NotNull
  public String getIssueDate() {
    return issueDate;
  }
  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }

  /**
   * Masked card number
   **/
  public CardDetailsNs3 maskedCard(String maskedCard) {
    this.maskedCard = maskedCard;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Masked card number")
  @JsonProperty("maskedCard")
  @NotNull
  public String getMaskedCard() {
    return maskedCard;
  }
  public void setMaskedCard(String maskedCard) {
    this.maskedCard = maskedCard;
  }

  /**
   * Card Owner Code. The information will be retreived when the card is secondary and has a link to the prilmary card number 
   **/
  public CardDetailsNs3 parentCardNumber(String parentCardNumber) {
    this.parentCardNumber = parentCardNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Card Owner Code. The information will be retreived when the card is secondary and has a link to the prilmary card number ")
  @JsonProperty("parentCardNumber")
  public String getParentCardNumber() {
    return parentCardNumber;
  }
  public void setParentCardNumber(String parentCardNumber) {
    this.parentCardNumber = parentCardNumber;
  }

  /**
   * Previous card number in case the card has been replaced
   **/
  public CardDetailsNs3 previousCardNumber(String previousCardNumber) {
    this.previousCardNumber = previousCardNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Previous card number in case the card has been replaced")
  @JsonProperty("previousCardNumber")
  public String getPreviousCardNumber() {
    return previousCardNumber;
  }
  public void setPreviousCardNumber(String previousCardNumber) {
    this.previousCardNumber = previousCardNumber;
  }

  /**
   **/
  public CardDetailsNs3 productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("productCode")
  @NotNull
  public String getProductCode() {
    return productCode;
  }
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  /**
   **/
  public CardDetailsNs3 reportingBranch(String reportingBranch) {
    this.reportingBranch = reportingBranch;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("reportingBranch")
  @NotNull
  public String getReportingBranch() {
    return reportingBranch;
  }
  public void setReportingBranch(String reportingBranch) {
    this.reportingBranch = reportingBranch;
  }

  /**
   * This field indicates whether the card is stop listed or not. 
   **/
  public CardDetailsNs3 stopListFlag(String stopListFlag) {
    this.stopListFlag = stopListFlag;
    return this;
  }

  
  @ApiModelProperty(value = "This field indicates whether the card is stop listed or not. ")
  @JsonProperty("stopListFlag")
  public String getStopListFlag() {
    return stopListFlag;
  }
  public void setStopListFlag(String stopListFlag) {
    this.stopListFlag = stopListFlag;
  }

  /**
   * Refers to the period where the card is placed in stop list.
   **/
  public CardDetailsNs3 stopListRangeDate(String stopListRangeDate) {
    this.stopListRangeDate = stopListRangeDate;
    return this;
  }

  
  @ApiModelProperty(value = "Refers to the period where the card is placed in stop list.")
  @JsonProperty("stopListRangeDate")
  public String getStopListRangeDate() {
    return stopListRangeDate;
  }
  public void setStopListRangeDate(String stopListRangeDate) {
    this.stopListRangeDate = stopListRangeDate;
  }

  /**
   * Reason code indicates the reason behind putting the card in the stop list
   **/
  public CardDetailsNs3 stopListReasonCode(String stopListReasonCode) {
    this.stopListReasonCode = stopListReasonCode;
    return this;
  }

  
  @ApiModelProperty(value = "Reason code indicates the reason behind putting the card in the stop list")
  @JsonProperty("stopListReasonCode")
  public String getStopListReasonCode() {
    return stopListReasonCode;
  }
  public void setStopListReasonCode(String stopListReasonCode) {
    this.stopListReasonCode = stopListReasonCode;
  }

  /**
   **/
  public CardDetailsNs3 userCif(String userCif) {
    this.userCif = userCif;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userCif")
  public String getUserCif() {
    return userCif;
  }
  public void setUserCif(String userCif) {
    this.userCif = userCif;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetailsNs3 cardDetailsNs3 = (CardDetailsNs3) o;
    return Objects.equals(accountNumber, cardDetailsNs3.accountNumber) &&
        Objects.equals(activationFlag, cardDetailsNs3.activationFlag) &&
        Objects.equals(cardActivationDate, cardDetailsNs3.cardActivationDate) &&
        Objects.equals(cardFeesCode, cardDetailsNs3.cardFeesCode) &&
        Objects.equals(cardHolderName, cardDetailsNs3.cardHolderName) &&
        Objects.equals(cardHolderType, cardDetailsNs3.cardHolderType) &&
        Objects.equals(cardStatus, cardDetailsNs3.cardStatus) &&
        Objects.equals(cardStatusDate, cardDetailsNs3.cardStatusDate) &&
        Objects.equals(cardToken, cardDetailsNs3.cardToken) &&
        Objects.equals(clientCode, cardDetailsNs3.clientCode) &&
        Objects.equals(corporateEmbossedName, cardDetailsNs3.corporateEmbossedName) &&
        Objects.equals(corporateId, cardDetailsNs3.corporateId) &&
        Objects.equals(expiryDate, cardDetailsNs3.expiryDate) &&
        Objects.equals(formerExpiryDate, cardDetailsNs3.formerExpiryDate) &&
        Objects.equals(issueDate, cardDetailsNs3.issueDate) &&
        Objects.equals(maskedCard, cardDetailsNs3.maskedCard) &&
        Objects.equals(parentCardNumber, cardDetailsNs3.parentCardNumber) &&
        Objects.equals(previousCardNumber, cardDetailsNs3.previousCardNumber) &&
        Objects.equals(productCode, cardDetailsNs3.productCode) &&
        Objects.equals(reportingBranch, cardDetailsNs3.reportingBranch) &&
        Objects.equals(stopListFlag, cardDetailsNs3.stopListFlag) &&
        Objects.equals(stopListRangeDate, cardDetailsNs3.stopListRangeDate) &&
        Objects.equals(stopListReasonCode, cardDetailsNs3.stopListReasonCode) &&
        Objects.equals(userCif, cardDetailsNs3.userCif);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, activationFlag, cardActivationDate, cardFeesCode, cardHolderName, cardHolderType, cardStatus, cardStatusDate, cardToken, clientCode, corporateEmbossedName, corporateId, expiryDate, formerExpiryDate, issueDate, maskedCard, parentCardNumber, previousCardNumber, productCode, reportingBranch, stopListFlag, stopListRangeDate, stopListReasonCode, userCif);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetailsNs3 {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    activationFlag: ").append(toIndentedString(activationFlag)).append("\n");
    sb.append("    cardActivationDate: ").append(toIndentedString(cardActivationDate)).append("\n");
    sb.append("    cardFeesCode: ").append(toIndentedString(cardFeesCode)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardHolderType: ").append(toIndentedString(cardHolderType)).append("\n");
    sb.append("    cardStatus: ").append(toIndentedString(cardStatus)).append("\n");
    sb.append("    cardStatusDate: ").append(toIndentedString(cardStatusDate)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    clientCode: ").append(toIndentedString(clientCode)).append("\n");
    sb.append("    corporateEmbossedName: ").append(toIndentedString(corporateEmbossedName)).append("\n");
    sb.append("    corporateId: ").append(toIndentedString(corporateId)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    formerExpiryDate: ").append(toIndentedString(formerExpiryDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    maskedCard: ").append(toIndentedString(maskedCard)).append("\n");
    sb.append("    parentCardNumber: ").append(toIndentedString(parentCardNumber)).append("\n");
    sb.append("    previousCardNumber: ").append(toIndentedString(previousCardNumber)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    reportingBranch: ").append(toIndentedString(reportingBranch)).append("\n");
    sb.append("    stopListFlag: ").append(toIndentedString(stopListFlag)).append("\n");
    sb.append("    stopListRangeDate: ").append(toIndentedString(stopListRangeDate)).append("\n");
    sb.append("    stopListReasonCode: ").append(toIndentedString(stopListReasonCode)).append("\n");
    sb.append("    userCif: ").append(toIndentedString(userCif)).append("\n");
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


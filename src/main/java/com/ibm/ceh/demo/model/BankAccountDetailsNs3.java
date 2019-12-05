package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class BankAccountDetailsNs3   {
  
  private String accountNumber = null;
  private String accountType = null;
  private String defaultAccountFlag = null;
  private String defaultFastCashAccountFlag = null;
  private String defaultPurchaseAccountFlag = null;
  private String directDebitEnabledFlag = null;
  private String directDebitOrderNumber = null;
  private String entityId = null;
  private String entityType = null;
  private String iban = null;
  private String serviceIndex = null;

  /**
   **/
  public BankAccountDetailsNs3 accountNumber(String accountNumber) {
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
  public BankAccountDetailsNs3 accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountType")
  @NotNull
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  /**
   **/
  public BankAccountDetailsNs3 defaultAccountFlag(String defaultAccountFlag) {
    this.defaultAccountFlag = defaultAccountFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultAccountFlag")
  public String getDefaultAccountFlag() {
    return defaultAccountFlag;
  }
  public void setDefaultAccountFlag(String defaultAccountFlag) {
    this.defaultAccountFlag = defaultAccountFlag;
  }

  /**
   **/
  public BankAccountDetailsNs3 defaultFastCashAccountFlag(String defaultFastCashAccountFlag) {
    this.defaultFastCashAccountFlag = defaultFastCashAccountFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultFastCashAccountFlag")
  public String getDefaultFastCashAccountFlag() {
    return defaultFastCashAccountFlag;
  }
  public void setDefaultFastCashAccountFlag(String defaultFastCashAccountFlag) {
    this.defaultFastCashAccountFlag = defaultFastCashAccountFlag;
  }

  /**
   **/
  public BankAccountDetailsNs3 defaultPurchaseAccountFlag(String defaultPurchaseAccountFlag) {
    this.defaultPurchaseAccountFlag = defaultPurchaseAccountFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultPurchaseAccountFlag")
  public String getDefaultPurchaseAccountFlag() {
    return defaultPurchaseAccountFlag;
  }
  public void setDefaultPurchaseAccountFlag(String defaultPurchaseAccountFlag) {
    this.defaultPurchaseAccountFlag = defaultPurchaseAccountFlag;
  }

  /**
   **/
  public BankAccountDetailsNs3 directDebitEnabledFlag(String directDebitEnabledFlag) {
    this.directDebitEnabledFlag = directDebitEnabledFlag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("directDebitEnabledFlag")
  public String getDirectDebitEnabledFlag() {
    return directDebitEnabledFlag;
  }
  public void setDirectDebitEnabledFlag(String directDebitEnabledFlag) {
    this.directDebitEnabledFlag = directDebitEnabledFlag;
  }

  /**
   **/
  public BankAccountDetailsNs3 directDebitOrderNumber(String directDebitOrderNumber) {
    this.directDebitOrderNumber = directDebitOrderNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("directDebitOrderNumber")
  public String getDirectDebitOrderNumber() {
    return directDebitOrderNumber;
  }
  public void setDirectDebitOrderNumber(String directDebitOrderNumber) {
    this.directDebitOrderNumber = directDebitOrderNumber;
  }

  /**
   **/
  public BankAccountDetailsNs3 entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("entityId")
  @NotNull
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  /**
   **/
  public BankAccountDetailsNs3 entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("entityType")
  @NotNull
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   **/
  public BankAccountDetailsNs3 iban(String iban) {
    this.iban = iban;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("iban")
  public String getIban() {
    return iban;
  }
  public void setIban(String iban) {
    this.iban = iban;
  }

  /**
   **/
  public BankAccountDetailsNs3 serviceIndex(String serviceIndex) {
    this.serviceIndex = serviceIndex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceIndex")
  public String getServiceIndex() {
    return serviceIndex;
  }
  public void setServiceIndex(String serviceIndex) {
    this.serviceIndex = serviceIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountDetailsNs3 bankAccountDetailsNs3 = (BankAccountDetailsNs3) o;
    return Objects.equals(accountNumber, bankAccountDetailsNs3.accountNumber) &&
        Objects.equals(accountType, bankAccountDetailsNs3.accountType) &&
        Objects.equals(defaultAccountFlag, bankAccountDetailsNs3.defaultAccountFlag) &&
        Objects.equals(defaultFastCashAccountFlag, bankAccountDetailsNs3.defaultFastCashAccountFlag) &&
        Objects.equals(defaultPurchaseAccountFlag, bankAccountDetailsNs3.defaultPurchaseAccountFlag) &&
        Objects.equals(directDebitEnabledFlag, bankAccountDetailsNs3.directDebitEnabledFlag) &&
        Objects.equals(directDebitOrderNumber, bankAccountDetailsNs3.directDebitOrderNumber) &&
        Objects.equals(entityId, bankAccountDetailsNs3.entityId) &&
        Objects.equals(entityType, bankAccountDetailsNs3.entityType) &&
        Objects.equals(iban, bankAccountDetailsNs3.iban) &&
        Objects.equals(serviceIndex, bankAccountDetailsNs3.serviceIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, defaultAccountFlag, defaultFastCashAccountFlag, defaultPurchaseAccountFlag, directDebitEnabledFlag, directDebitOrderNumber, entityId, entityType, iban, serviceIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountDetailsNs3 {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    defaultAccountFlag: ").append(toIndentedString(defaultAccountFlag)).append("\n");
    sb.append("    defaultFastCashAccountFlag: ").append(toIndentedString(defaultFastCashAccountFlag)).append("\n");
    sb.append("    defaultPurchaseAccountFlag: ").append(toIndentedString(defaultPurchaseAccountFlag)).append("\n");
    sb.append("    directDebitEnabledFlag: ").append(toIndentedString(directDebitEnabledFlag)).append("\n");
    sb.append("    directDebitOrderNumber: ").append(toIndentedString(directDebitOrderNumber)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    serviceIndex: ").append(toIndentedString(serviceIndex)).append("\n");
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


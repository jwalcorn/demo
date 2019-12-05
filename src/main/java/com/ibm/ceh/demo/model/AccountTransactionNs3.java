package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AccountTransactionNs3   {
  
  private BigDecimal amount = null;
  private String currency = null;
  private String debitValueDate = null;
  private String description = null;
  private String originalReference = null;
  private String originalSequence = null;
  private String reversalFlag = null;
  private String transactionCode = null;

  /**
   * minimum: 0
   **/
  public AccountTransactionNs3 amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("amount")
  @NotNull
 @DecimalMin("0")  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   **/
  public AccountTransactionNs3 currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency")
  @NotNull
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  public AccountTransactionNs3 debitValueDate(String debitValueDate) {
    this.debitValueDate = debitValueDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("debitValueDate")
  public String getDebitValueDate() {
    return debitValueDate;
  }
  public void setDebitValueDate(String debitValueDate) {
    this.debitValueDate = debitValueDate;
  }

  /**
   **/
  public AccountTransactionNs3 description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public AccountTransactionNs3 originalReference(String originalReference) {
    this.originalReference = originalReference;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("originalReference")
  public String getOriginalReference() {
    return originalReference;
  }
  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }

  /**
   **/
  public AccountTransactionNs3 originalSequence(String originalSequence) {
    this.originalSequence = originalSequence;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("originalSequence")
  public String getOriginalSequence() {
    return originalSequence;
  }
  public void setOriginalSequence(String originalSequence) {
    this.originalSequence = originalSequence;
  }

  /**
   **/
  public AccountTransactionNs3 reversalFlag(String reversalFlag) {
    this.reversalFlag = reversalFlag;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("reversalFlag")
  @NotNull
  public String getReversalFlag() {
    return reversalFlag;
  }
  public void setReversalFlag(String reversalFlag) {
    this.reversalFlag = reversalFlag;
  }

  /**
   **/
  public AccountTransactionNs3 transactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transactionCode")
  @NotNull
  public String getTransactionCode() {
    return transactionCode;
  }
  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTransactionNs3 accountTransactionNs3 = (AccountTransactionNs3) o;
    return Objects.equals(amount, accountTransactionNs3.amount) &&
        Objects.equals(currency, accountTransactionNs3.currency) &&
        Objects.equals(debitValueDate, accountTransactionNs3.debitValueDate) &&
        Objects.equals(description, accountTransactionNs3.description) &&
        Objects.equals(originalReference, accountTransactionNs3.originalReference) &&
        Objects.equals(originalSequence, accountTransactionNs3.originalSequence) &&
        Objects.equals(reversalFlag, accountTransactionNs3.reversalFlag) &&
        Objects.equals(transactionCode, accountTransactionNs3.transactionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, debitValueDate, description, originalReference, originalSequence, reversalFlag, transactionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTransactionNs3 {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    debitValueDate: ").append(toIndentedString(debitValueDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    originalSequence: ").append(toIndentedString(originalSequence)).append("\n");
    sb.append("    reversalFlag: ").append(toIndentedString(reversalFlag)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
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


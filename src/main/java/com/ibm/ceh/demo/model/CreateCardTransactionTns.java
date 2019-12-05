package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.AccountTransactionNs3;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class CreateCardTransactionTns   {
  
  private String accountId = null;
  private AccountTransactionNs3 request = null;

  /**
   **/
  public CreateCardTransactionTns accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accountId")
  @NotNull
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   **/
  public CreateCardTransactionTns request(AccountTransactionNs3 request) {
    this.request = request;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("request")
  @NotNull
  public AccountTransactionNs3 getRequest() {
    return request;
  }
  public void setRequest(AccountTransactionNs3 request) {
    this.request = request;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCardTransactionTns createCardTransactionTns = (CreateCardTransactionTns) o;
    return Objects.equals(accountId, createCardTransactionTns.accountId) &&
        Objects.equals(request, createCardTransactionTns.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCardTransactionTns {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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


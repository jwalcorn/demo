package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.ICardManagementFinancialTransactioncreateCardTransactionFaultTns;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class CreateCardTransactionFault   {
  
  private ICardManagementFinancialTransactioncreateCardTransactionFaultTns createCardTransactionFault = null;

  /**
   **/
  public CreateCardTransactionFault createCardTransactionFault(ICardManagementFinancialTransactioncreateCardTransactionFaultTns createCardTransactionFault) {
    this.createCardTransactionFault = createCardTransactionFault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("createCardTransactionFault")
  public ICardManagementFinancialTransactioncreateCardTransactionFaultTns getCreateCardTransactionFault() {
    return createCardTransactionFault;
  }
  public void setCreateCardTransactionFault(ICardManagementFinancialTransactioncreateCardTransactionFaultTns createCardTransactionFault) {
    this.createCardTransactionFault = createCardTransactionFault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCardTransactionFault createCardTransactionFault = (CreateCardTransactionFault) o;
    return Objects.equals(createCardTransactionFault, createCardTransactionFault.createCardTransactionFault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createCardTransactionFault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCardTransactionFault {\n");
    
    sb.append("    createCardTransactionFault: ").append(toIndentedString(createCardTransactionFault)).append("\n");
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


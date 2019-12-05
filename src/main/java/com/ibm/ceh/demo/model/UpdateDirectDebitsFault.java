package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.ceh.demo.model.ICardManagementFinancialTransactionupdateDirectDebitsFaultTns;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class UpdateDirectDebitsFault   {
  
  private ICardManagementFinancialTransactionupdateDirectDebitsFaultTns updateDirectDebitsFault = null;

  /**
   **/
  public UpdateDirectDebitsFault updateDirectDebitsFault(ICardManagementFinancialTransactionupdateDirectDebitsFaultTns updateDirectDebitsFault) {
    this.updateDirectDebitsFault = updateDirectDebitsFault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updateDirectDebitsFault")
  public ICardManagementFinancialTransactionupdateDirectDebitsFaultTns getUpdateDirectDebitsFault() {
    return updateDirectDebitsFault;
  }
  public void setUpdateDirectDebitsFault(ICardManagementFinancialTransactionupdateDirectDebitsFaultTns updateDirectDebitsFault) {
    this.updateDirectDebitsFault = updateDirectDebitsFault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDirectDebitsFault updateDirectDebitsFault = (UpdateDirectDebitsFault) o;
    return Objects.equals(updateDirectDebitsFault, updateDirectDebitsFault.updateDirectDebitsFault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateDirectDebitsFault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDirectDebitsFault {\n");
    
    sb.append("    updateDirectDebitsFault: ").append(toIndentedString(updateDirectDebitsFault)).append("\n");
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


package com.ibm.ceh.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class LimitTypeNs3   {
  
  private BigDecimal creditLimit = null;
  private BigDecimal temporaryCreditLimit = null;
  private String tpLimitFromDate = null;
  private String tpLimitToDate = null;

  /**
   * minimum: 0
   **/
  public LimitTypeNs3 creditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creditLimit")
 @DecimalMin("0")  public BigDecimal getCreditLimit() {
    return creditLimit;
  }
  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }

  /**
   * minimum: 0
   **/
  public LimitTypeNs3 temporaryCreditLimit(BigDecimal temporaryCreditLimit) {
    this.temporaryCreditLimit = temporaryCreditLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("temporaryCreditLimit")
 @DecimalMin("0")  public BigDecimal getTemporaryCreditLimit() {
    return temporaryCreditLimit;
  }
  public void setTemporaryCreditLimit(BigDecimal temporaryCreditLimit) {
    this.temporaryCreditLimit = temporaryCreditLimit;
  }

  /**
   **/
  public LimitTypeNs3 tpLimitFromDate(String tpLimitFromDate) {
    this.tpLimitFromDate = tpLimitFromDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tpLimitFromDate")
  public String getTpLimitFromDate() {
    return tpLimitFromDate;
  }
  public void setTpLimitFromDate(String tpLimitFromDate) {
    this.tpLimitFromDate = tpLimitFromDate;
  }

  /**
   **/
  public LimitTypeNs3 tpLimitToDate(String tpLimitToDate) {
    this.tpLimitToDate = tpLimitToDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tpLimitToDate")
  public String getTpLimitToDate() {
    return tpLimitToDate;
  }
  public void setTpLimitToDate(String tpLimitToDate) {
    this.tpLimitToDate = tpLimitToDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitTypeNs3 limitTypeNs3 = (LimitTypeNs3) o;
    return Objects.equals(creditLimit, limitTypeNs3.creditLimit) &&
        Objects.equals(temporaryCreditLimit, limitTypeNs3.temporaryCreditLimit) &&
        Objects.equals(tpLimitFromDate, limitTypeNs3.tpLimitFromDate) &&
        Objects.equals(tpLimitToDate, limitTypeNs3.tpLimitToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLimit, temporaryCreditLimit, tpLimitFromDate, tpLimitToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitTypeNs3 {\n");
    
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    temporaryCreditLimit: ").append(toIndentedString(temporaryCreditLimit)).append("\n");
    sb.append("    tpLimitFromDate: ").append(toIndentedString(tpLimitFromDate)).append("\n");
    sb.append("    tpLimitToDate: ").append(toIndentedString(tpLimitToDate)).append("\n");
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


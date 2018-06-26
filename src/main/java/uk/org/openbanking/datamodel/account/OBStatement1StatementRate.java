/*
 * The contents of this file are subject to the terms of the Common Development and
 *  Distribution License (the License). You may not use this file except in compliance with the
 *  License.
 *
 *  You can obtain a copy of the License at https://forgerock.org/cddlv1-0/. See the License for the
 *  specific language governing permission and limitations under the License.
 *
 *  When distributing Covered Software, include this CDDL Header Notice in each file and include
 *  the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 *  Header, with the fields enclosed by brackets [] replaced by your own identifying
 *  information: "Portions copyright [year] [name of copyright owner]".
 *
 *  Copyright 2018 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Set of elements used to provide details of a generic rate related to the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic rate related to the statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBStatement1StatementRate   {
  @JsonProperty("Rate")
  private String rate = null;

  /**
   * Statement rate type, in a coded form.
   */
  public enum TypeEnum {
    ANNUALBALANCETRANSFER("AnnualBalanceTransfer"),
    
    ANNUALBALANCETRANSFERAFTERPROMO("AnnualBalanceTransferAfterPromo"),
    
    ANNUALBALANCETRANSFERPROMO("AnnualBalanceTransferPromo"),
    
    ANNUALCASH("AnnualCash"),
    
    ANNUALPURCHASE("AnnualPurchase"),
    
    ANNUALPURCHASEAFTERPROMO("AnnualPurchaseAfterPromo"),
    
    ANNUALPURCHASEPROMO("AnnualPurchasePromo"),
    
    MONTHLYBALANCETRANSFER("MonthlyBalanceTransfer"),
    
    MONTHLYCASH("MonthlyCash"),
    
    MONTHLYPURCHASE("MonthlyPurchase");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  public OBStatement1StatementRate rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate associated with the statement rate type.
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "Rate associated with the statement rate type.")
  @NotNull

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") @Size(min=1,max=10) 
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public OBStatement1StatementRate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Statement rate type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Statement rate type, in a coded form.")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement1StatementRate obStatement1StatementRate = (OBStatement1StatementRate) o;
    return Objects.equals(this.rate, obStatement1StatementRate.rate) &&
        Objects.equals(this.type, obStatement1StatementRate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement1StatementRate {\n");

    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


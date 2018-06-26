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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides further details on a statement resource.
 */
@ApiModel(description = "Provides further details on a statement resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBStatement1Basic   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("StatementId")
  private String statementId = null;

  @JsonProperty("StatementReference")
  private String statementReference = null;

  @JsonProperty("Type")
  private OBExternalStatementType1Code type = null;

  @JsonProperty("StartDateTime")
  private OffsetDateTime startDateTime = null;

  @JsonProperty("EndDateTime")
  private OffsetDateTime endDateTime = null;

  @JsonProperty("CreationDateTime")
  private OffsetDateTime creationDateTime = null;

  @JsonProperty("StatementDescription")
  @Valid
  private List<String> statementDescription = null;

  @JsonProperty("StatementBenefit")
  @Valid
  private List<OBStatementBenefit1> statementBenefit = null;

  @JsonProperty("StatementFee")
  @Valid
  private List<OBStatementFee1> statementFee = null;

  @JsonProperty("StatementInterest")
  @Valid
  private List<OBStatementInterest1> statementInterest = null;

  @JsonProperty("StatementDateTime")
  @Valid
  private List<OBStatementDateTime1> statementDateTime = null;

  @JsonProperty("StatementRate")
  @Valid
  private List<OBStatementRate1> statementRate = null;

  @JsonProperty("StatementValue")
  @Valid
  private List<OBStatementValue1> statementValue = null;

  public OBStatement1Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBStatement1Basic statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.
   * @return statementId
  **/
  @ApiModelProperty(value = "Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.")

@Size(min=1,max=40) 
  public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public OBStatement1Basic statementReference(String statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  /**
   * Unique reference for the statement. This reference may be optionally populated if available.
   * @return statementReference
  **/
  @ApiModelProperty(value = "Unique reference for the statement. This reference may be optionally populated if available.")

@Size(min=1,max=35) 
  public String getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }

  public OBStatement1Basic type(OBExternalStatementType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalStatementType1Code getType() {
    return type;
  }

  public void setType(OBExternalStatementType1Code type) {
    this.type = type;
  }

  public OBStatement1Basic startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Date and time at which the statement period starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return startDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the statement period starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBStatement1Basic endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Date and time at which the statement period ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return endDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the statement period ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBStatement1Basic creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBStatement1Basic statementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
    return this;
  }

  public OBStatement1Basic addStatementDescriptionItem(String statementDescriptionItem) {
    if (this.statementDescription == null) {
      this.statementDescription = new ArrayList<String>();
    }
    this.statementDescription.add(statementDescriptionItem);
    return this;
  }

  /**
   * Other descriptions that may be available for the statement resource.
   * @return statementDescription
  **/
  @ApiModelProperty(value = "Other descriptions that may be available for the statement resource.")


  public List<String> getStatementDescription() {
    return statementDescription;
  }

  public void setStatementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
  }

  public OBStatement1Basic statementBenefit(List<OBStatementBenefit1> statementBenefit) {
    this.statementBenefit = statementBenefit;
    return this;
  }

  public OBStatement1Basic addStatementBenefitItem(OBStatementBenefit1 statementBenefitItem) {
    if (this.statementBenefit == null) {
      this.statementBenefit = new ArrayList<OBStatementBenefit1>();
    }
    this.statementBenefit.add(statementBenefitItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a benefit or reward amount for the statement resource.
   * @return statementBenefit
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a benefit or reward amount for the statement resource.")

  @Valid

  public List<OBStatementBenefit1> getStatementBenefit() {
    return statementBenefit;
  }

  public void setStatementBenefit(List<OBStatementBenefit1> statementBenefit) {
    this.statementBenefit = statementBenefit;
  }

  public OBStatement1Basic statementFee(List<OBStatementFee1> statementFee) {
    this.statementFee = statementFee;
    return this;
  }

  public OBStatement1Basic addStatementFeeItem(OBStatementFee1 statementFeeItem) {
    if (this.statementFee == null) {
      this.statementFee = new ArrayList<OBStatementFee1>();
    }
    this.statementFee.add(statementFeeItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a fee for the statement resource.
   * @return statementFee
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a fee for the statement resource.")

  @Valid

  public List<OBStatementFee1> getStatementFee() {
    return statementFee;
  }

  public void setStatementFee(List<OBStatementFee1> statementFee) {
    this.statementFee = statementFee;
  }

  public OBStatement1Basic statementInterest(List<OBStatementInterest1> statementInterest) {
    this.statementInterest = statementInterest;
    return this;
  }

  public OBStatement1Basic addStatementInterestItem(OBStatementInterest1 statementInterestItem) {
    if (this.statementInterest == null) {
      this.statementInterest = new ArrayList<OBStatementInterest1>();
    }
    this.statementInterest.add(statementInterestItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a generic interest amount related to the statement resource.
   * @return statementInterest
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a generic interest amount related to the statement resource.")

  @Valid

  public List<OBStatementInterest1> getStatementInterest() {
    return statementInterest;
  }

  public void setStatementInterest(List<OBStatementInterest1> statementInterest) {
    this.statementInterest = statementInterest;
  }

  public OBStatement1Basic statementDateTime(List<OBStatementDateTime1> statementDateTime) {
    this.statementDateTime = statementDateTime;
    return this;
  }

  public OBStatement1Basic addStatementDateTimeItem(OBStatementDateTime1 statementDateTimeItem) {
    if (this.statementDateTime == null) {
      this.statementDateTime = new ArrayList<OBStatementDateTime1>();
    }
    this.statementDateTime.add(statementDateTimeItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a generic date time for the statement resource.
   * @return statementDateTime
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a generic date time for the statement resource.")

  @Valid

  public List<OBStatementDateTime1> getStatementDateTime() {
    return statementDateTime;
  }

  public void setStatementDateTime(List<OBStatementDateTime1> statementDateTime) {
    this.statementDateTime = statementDateTime;
  }

  public OBStatement1Basic statementRate(List<OBStatementRate1> statementRate) {
    this.statementRate = statementRate;
    return this;
  }

  public OBStatement1Basic addStatementRateItem(OBStatementRate1 statementRateItem) {
    if (this.statementRate == null) {
      this.statementRate = new ArrayList<OBStatementRate1>();
    }
    this.statementRate.add(statementRateItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a generic rate related to the statement resource.
   * @return statementRate
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a generic rate related to the statement resource.")

  @Valid

  public List<OBStatementRate1> getStatementRate() {
    return statementRate;
  }

  public void setStatementRate(List<OBStatementRate1> statementRate) {
    this.statementRate = statementRate;
  }

  public OBStatement1Basic statementValue(List<OBStatementValue1> statementValue) {
    this.statementValue = statementValue;
    return this;
  }

  public OBStatement1Basic addStatementValueItem(OBStatementValue1 statementValueItem) {
    if (this.statementValue == null) {
      this.statementValue = new ArrayList<OBStatementValue1>();
    }
    this.statementValue.add(statementValueItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a generic number value related to the statement resource.
   * @return statementValue
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a generic number value related to the statement resource.")

  @Valid

  public List<OBStatementValue1> getStatementValue() {
    return statementValue;
  }

  public void setStatementValue(List<OBStatementValue1> statementValue) {
    this.statementValue = statementValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement1Basic obStatement1Basic = (OBStatement1Basic) o;
    return Objects.equals(this.accountId, obStatement1Basic.accountId) &&
        Objects.equals(this.statementId, obStatement1Basic.statementId) &&
        Objects.equals(this.statementReference, obStatement1Basic.statementReference) &&
        Objects.equals(this.type, obStatement1Basic.type) &&
        Objects.equals(this.startDateTime, obStatement1Basic.startDateTime) &&
        Objects.equals(this.endDateTime, obStatement1Basic.endDateTime) &&
        Objects.equals(this.creationDateTime, obStatement1Basic.creationDateTime) &&
        Objects.equals(this.statementDescription, obStatement1Basic.statementDescription) &&
        Objects.equals(this.statementBenefit, obStatement1Basic.statementBenefit) &&
        Objects.equals(this.statementFee, obStatement1Basic.statementFee) &&
        Objects.equals(this.statementInterest, obStatement1Basic.statementInterest) &&
        Objects.equals(this.statementDateTime, obStatement1Basic.statementDateTime) &&
        Objects.equals(this.statementRate, obStatement1Basic.statementRate) &&
        Objects.equals(this.statementValue, obStatement1Basic.statementValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, statementId, statementReference, type, startDateTime, endDateTime, creationDateTime, statementDescription, statementBenefit, statementFee, statementInterest, statementDateTime, statementRate, statementValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement1Basic {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
    sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
    sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
    sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
    sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
    sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
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


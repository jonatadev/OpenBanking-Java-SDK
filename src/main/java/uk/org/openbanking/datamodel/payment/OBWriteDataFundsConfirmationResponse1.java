/**
 *
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
 */
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * OBWriteDataFundsConfirmationResponse1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:15:38.268Z")

public class OBWriteDataFundsConfirmationResponse1   {
  @JsonProperty("FundsAvailableResult")
  private OBFundsAvailableResult1 fundsAvailableResult = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  public OBWriteDataFundsConfirmationResponse1 fundsAvailableResult(OBFundsAvailableResult1 fundsAvailableResult) {
    this.fundsAvailableResult = fundsAvailableResult;
    return this;
  }

  /**
   * Get fundsAvailableResult
   * @return fundsAvailableResult
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBFundsAvailableResult1 getFundsAvailableResult() {
    return fundsAvailableResult;
  }

  public void setFundsAvailableResult(OBFundsAvailableResult1 fundsAvailableResult) {
    this.fundsAvailableResult = fundsAvailableResult;
  }

  public OBWriteDataFundsConfirmationResponse1 supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDataFundsConfirmationResponse1 obWriteDataFundsConfirmationResponse1 = (OBWriteDataFundsConfirmationResponse1) o;
    return Objects.equals(this.fundsAvailableResult, obWriteDataFundsConfirmationResponse1.fundsAvailableResult) &&
        Objects.equals(this.supplementaryData, obWriteDataFundsConfirmationResponse1.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailableResult, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDataFundsConfirmationResponse1 {\n");

    sb.append("    fundsAvailableResult: ").append(toIndentedString(fundsAvailableResult)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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


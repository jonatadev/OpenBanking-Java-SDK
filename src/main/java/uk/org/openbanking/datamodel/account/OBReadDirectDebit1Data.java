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
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadDirectDebit1Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBReadDirectDebit1Data   {
  @JsonProperty("DirectDebit")
  @Valid
  private List<OBDirectDebit1> directDebit = null;

  public OBReadDirectDebit1Data directDebit(List<OBDirectDebit1> directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  public OBReadDirectDebit1Data addDirectDebitItem(OBDirectDebit1 directDebitItem) {
    if (this.directDebit == null) {
      this.directDebit = new ArrayList<OBDirectDebit1>();
    }
    this.directDebit.add(directDebitItem);
    return this;
  }

  /**
   * Account to or from which a cash entry is made.
   * @return directDebit
  **/
  @ApiModelProperty(value = "Account to or from which a cash entry is made.")

  @Valid

  public List<OBDirectDebit1> getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(List<OBDirectDebit1> directDebit) {
    this.directDebit = directDebit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit1Data obReadDirectDebit1Data = (OBReadDirectDebit1Data) o;
    return Objects.equals(this.directDebit, obReadDirectDebit1Data.directDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit1Data {\n");

    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
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


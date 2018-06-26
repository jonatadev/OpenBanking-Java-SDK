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
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Amount type, in a coded form.
 */
public enum OBExternalStatementAmountType1Code {
  
  ARREARSCLOSINGBALANCE("ArrearsClosingBalance"),
  
  AVAILABLEBALANCE("AvailableBalance"),
  
  AVERAGEBALANCEWHENINCREDIT("AverageBalanceWhenInCredit"),
  
  AVERAGEBALANCEWHENINDEBIT("AverageBalanceWhenInDebit"),
  
  AVERAGEDAILYBALANCE("AverageDailyBalance"),
  
  BALANCETRANSFERCLOSINGBALANCE("BalanceTransferClosingBalance"),
  
  CASHCLOSINGBALANCE("CashClosingBalance"),
  
  CLOSINGBALANCE("ClosingBalance"),
  
  CREDITLIMIT("CreditLimit"),
  
  CURRENTPAYMENT("CurrentPayment"),
  
  DIRECTDEBITPAYMENTDUE("DirectDebitPaymentDue"),
  
  FSCSINSURANCE("FSCSInsurance"),
  
  MINIMUMPAYMENTDUE("MinimumPaymentDue"),
  
  PREVIOUSCLOSINGBALANCE("PreviousClosingBalance"),
  
  PREVIOUSPAYMENT("PreviousPayment"),
  
  PURCHASECLOSINGBALANCE("PurchaseClosingBalance"),
  
  STARTINGBALANCE("StartingBalance"),
  
  TOTALADJUSTMENTS("TotalAdjustments"),
  
  TOTALCASHADVANCES("TotalCashAdvances"),
  
  TOTALCHARGES("TotalCharges"),
  
  TOTALCREDITS("TotalCredits"),
  
  TOTALDEBITS("TotalDebits"),
  
  TOTALPURCHASES("TotalPurchases");

  private String value;

  OBExternalStatementAmountType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalStatementAmountType1Code fromValue(String text) {
    for (OBExternalStatementAmountType1Code b : OBExternalStatementAmountType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


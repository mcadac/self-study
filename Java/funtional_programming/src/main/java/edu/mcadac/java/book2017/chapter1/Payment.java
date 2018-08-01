/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2017.chapter1;

import java.util.List;

public class Payment {

  public final CreditCard creditCard;

  public final int amount;

  public Payment(final CreditCard creditCard, final int amount) {
    this.creditCard = creditCard;
    this.amount = amount;
  }

  public Payment combine(final Payment payment){

    if (creditCard.equals(payment.creditCard)){
      return new Payment(creditCard, amount + payment.amount);
    }else{
      throw new IllegalStateException("Cards don't match.");
    }
  }


  public static List<Payment> groupByCard(final List<Payment> payments){

    return null;

  }
}

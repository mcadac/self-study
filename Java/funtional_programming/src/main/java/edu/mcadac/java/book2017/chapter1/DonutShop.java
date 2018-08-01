/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2017.chapter1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DonutShop {

  public static Tuple<Donut,Payment> buyDonut(CreditCard creditCard){

    Donut donut = new Donut();
    Payment payment = new Payment(creditCard, Donut.PRICE);
    return new Tuple<>(donut, payment);

  }

  public static Tuple<List<Donut>, Payment> buyDonuts(final int quantity, final CreditCard creditCard){

    return new Tuple<>(Collections.nCopies(quantity, new Donut()), new Payment(creditCard, Donut.PRICE * quantity));

  }

}

/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014.chapter8;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class Stock100 {

    @Test
    public void test(){

        final BigDecimal hundred = new BigDecimal("100");
        System.out.println("Stock price over $100 are : " +
            Tickets.symbols
                    .stream()
                    .filter(symbol -> YahooFinancie.getPrice(symbol).compareTo(hundred) > 0 )
                    .sorted()
                    .collect(Collectors.joining(", "))
        );
    }

}

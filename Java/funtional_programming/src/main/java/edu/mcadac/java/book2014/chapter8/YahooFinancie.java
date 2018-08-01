/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014.chapter8;

import java.math.BigDecimal;

public class YahooFinancie {

    public static BigDecimal getPrice(final String ticker){

        return BigDecimal.valueOf(Math.random() * 500 + 1);

    }

}

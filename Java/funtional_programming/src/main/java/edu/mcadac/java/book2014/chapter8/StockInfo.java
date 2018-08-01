/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014.chapter8;

import java.math.BigDecimal;

public class StockInfo {

    public final String ticker;

    public final BigDecimal price;

    public StockInfo(final String ticker, final BigDecimal price){
        this.ticker = ticker;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Ticker: %s price : %g", ticker, price);
    }
}

package edu.mcadac.java.chapter8;

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

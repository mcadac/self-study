/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.chapter8;

import java.math.BigDecimal;
import java.util.function.Predicate;

public class StockUtil {

  public static StockInfo getPrice(final String ticker){

    return new StockInfo(ticker, YahooFinancie.getPrice(ticker));

  }

  public static Predicate<StockInfo> isPriceLessThan(final int price){

    return stockInfo -> stockInfo.price.compareTo(BigDecimal.valueOf(price)) < 0;
  }

  public static StockInfo pickHigh(final StockInfo stockInfo1, final StockInfo stockInfo2){

    return stockInfo1.price.compareTo(stockInfo2.price) > 0 ? stockInfo1 : stockInfo2;
  }

}

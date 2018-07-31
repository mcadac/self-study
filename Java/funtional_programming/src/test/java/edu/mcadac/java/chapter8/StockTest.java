/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.chapter8;

import java.util.stream.Stream;
import org.junit.Test;

public class StockTest {

  public static void findHighPriced(final Stream<String> symbols){

    final long initialTime = System.currentTimeMillis();

    final StockInfo highPriced = symbols
        .map(StockUtil::getPrice)
        .filter(StockUtil.isPriceLessThan(500))
        .reduce(StockUtil::pickHigh)
        .get();

    System.out.println("High priced is : " + highPriced);

    System.out.println("Executed time : " + (System.currentTimeMillis() - initialTime));
  }

  @Test
  public void test(){

    findHighPriced( Tickets.symbols.stream());
    System.out.println("Parallel stream");
    findHighPriced( Tickets.symbols.parallelStream());
  }

}

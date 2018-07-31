package edu.mcadac.java.chapter8;

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

package edu.mcadac.java.chapter8;

import java.math.BigDecimal;
import java.util.Random;

public class YahooFinancie {

    public static BigDecimal getPrice(final String ticker){

        return BigDecimal.valueOf(Math.random() * 200 + 1);

    }

}

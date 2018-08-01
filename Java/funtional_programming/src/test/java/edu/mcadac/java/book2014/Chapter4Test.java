/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014;

import edu.mcadac.java.book2014.chapter4.HolderNavie;
import org.junit.Test;

public class Chapter4Test {

    @Test
    public void executeHolderNavie(){

        final HolderNavie holderNavie = new HolderNavie();

        System.out.println("Deferring heavy creation");
        System.out.println(holderNavie.getHeavy());
        System.out.println(holderNavie.getHeavy());


    }

}

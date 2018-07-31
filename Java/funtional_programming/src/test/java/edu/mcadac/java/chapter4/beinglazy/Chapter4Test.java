package edu.mcadac.java.chapter4.beinglazy;

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

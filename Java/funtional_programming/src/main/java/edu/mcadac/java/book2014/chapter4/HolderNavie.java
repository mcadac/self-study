/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014.chapter4;

public class HolderNavie {

    private Heavy heavy;

    public HolderNavie(){
        System.out.println("Holder created");
    }

    public Heavy getHeavy() {

        if(heavy == null){
            heavy = new Heavy();
        }

        return heavy;
    }
}

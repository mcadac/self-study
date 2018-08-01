/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014.chapter4;

/**
 * Class to simulate lazy process
 */
public class Heavy {

    public Heavy(){
        System.out.println("Heavy created");
    }


    @Override
    public String toString(){
        return "quite heavy";
    }

}

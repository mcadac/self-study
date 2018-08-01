/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014.chapter4;

import java.util.function.Supplier;

public class Holder {

    private Supplier<Heavy> heavy = () -> createAndCacheHeavy();

    public Holder(){
        System.out.println("Holder created");
    }

    public Heavy getHeavy() {
        return heavy.get();
    }

    private synchronized Heavy createAndCacheHeavy(){

        class HeavyFactory implements Supplier<Heavy>{

            private final Heavy heavyInstance = new Heavy();

            public Heavy get() {
                return heavyInstance;
            }
        }


        if(!HeavyFactory.class.isInstance(heavy)){

            heavy = new HeavyFactory();
        }

        return heavy.get();


    }

}

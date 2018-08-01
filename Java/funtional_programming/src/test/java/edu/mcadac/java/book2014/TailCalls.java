/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014;

public class TailCalls {

    public static <T> TailCall<T> call(final TailCall<T> nextCall){
        return nextCall;
    }

    public static <T> TailCall<T> done(final T value){

        return new TailCall<T>() {

            @Override public T result() { return value; }
            @Override public boolean isComplete() { return true; }
            @Override  public TailCall<T> apply() {
                throw new Error("Not implemented");
            }
        };
    }

}

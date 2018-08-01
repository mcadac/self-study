/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014;


import org.junit.Test;

public class Factorial {

    private static int factorialRec(final int number){

        if(number == 1){
            return number;
        }else{
            return number * factorialRec(number -1);
        }
    }

    public static TailCall<Integer> factorialTailRec(final int factorial, final int number ){

        if(number == 1){
            return TailCalls.done(factorial);
        } else {
            return TailCalls
                    .call(() -> factorialTailRec(factorial * number, number -1));
        }


    }

    public static int factorial(final int number){
        return factorialTailRec(1, number).invoke();
    }


    @Test
    public void testFactorailRec(){

        System.out.println(factorialRec(5));
    }

    @Test
    public void testFactorialException(){

        try{
            System.out.println(factorialRec(20000));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    @Test
    public void testTailCallRecursive(){
        System.out.println( factorial(5));
    }
}

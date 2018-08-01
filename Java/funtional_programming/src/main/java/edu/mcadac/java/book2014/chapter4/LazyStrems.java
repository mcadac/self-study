/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2014.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyStrems {

    private static int length(final String name){
        System.out.println("Getting length for: "+ name);
        return name.length();
    }

    private static String toUpper(final String name){
        System.out.println("Converting to uppercase : " +  name);
        return name.toUpperCase();
    }

    private static void test1(){

        final List<String> names = Arrays.asList("Camiloe", "Kim", "Espitia","David","Manrique");

        final String firstResult = names
                .stream()
                .filter(name -> length(name) == 3)
                .map(name -> toUpper(name))
                .findFirst()
                .get();

        System.out.println("Result : " + firstResult);
    }

    private static void test2(){

        final List<String> names = Arrays.asList("Camiloe", "Kim", "Espitia","David","Manrique");

        final Stream<String> namesWith3Letters = names
                .stream()
                .filter(name -> length(name) == 3)
                .map(name -> toUpper(name));

        System.out.println("Stream created, filtered, mapped...");
        System.out.println("Ready to call findFirst...");

        final String firstName = namesWith3Letters
                .findFirst()
                .get();

        System.out.println(firstName);

    }



    public static void main(final String... args){

        test2();


    }

}

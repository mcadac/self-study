/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2017.chapter2;

import java.util.function.Function;

public interface BinaryOperator extends Function<Integer, Function<Integer, Integer>> {

  BinaryOperator add = x -> (y -> x +y);

  BinaryOperator mult = x -> (y -> x*y);

}

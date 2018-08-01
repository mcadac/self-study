/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2017.chapter1;

public class Tuple<T, U> {

  public final T _1;

  public final U _2;

  public Tuple(final T _1, final U _2) {
    this._1 = _1;
    this._2 = _2;
  }
}

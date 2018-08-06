/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2017.chapter3;

public interface Result {

  public class Success implements Result{}

  public class Failure implements Result{

    private final String errorMessage;

    public Failure(final String errorMessage){
      this.errorMessage = errorMessage;
    }

    public String getMessage(){
      return this.errorMessage;
    }
  }

}

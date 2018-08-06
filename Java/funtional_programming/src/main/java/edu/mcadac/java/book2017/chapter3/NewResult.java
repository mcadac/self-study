/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2017.chapter3;

/**
 *
 * @param <T>
 */
public interface NewResult<T> {

  void isSuccess(Effect<T> success, Effect<String> failure);

  public static <T> NewResult<T> failure(String message){

    return new Failure<>(message);
  }

  public static <T> NewResult<T> success(T value){

    return new Success<>(value);

  }


  /**
   *
   * @param <T>
   */
  public class Success<T> implements NewResult<T>{

    private final T value;

    public Success(T value) {
      this.value = value;
    }

    @Override
    public void isSuccess(Effect<T> success, Effect<String> failure) {
      success.apply(value);
    }
  }

  /**
   *
   * @param <T>
   */
  public class Failure<T> implements NewResult<T> {

    private final String errorMessage;

    private Failure(String s) {
      this.errorMessage = s;
    }

    @Override
    public void isSuccess(Effect<T> success, Effect<String> failure) {
      failure.apply(errorMessage);
    }
  }



}

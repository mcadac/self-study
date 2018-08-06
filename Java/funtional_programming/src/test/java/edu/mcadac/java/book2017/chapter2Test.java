/*
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved
 */

package edu.mcadac.java.book2017;

import edu.mcadac.java.book2017.chapter1.Tuple;
import edu.mcadac.java.book2017.chapter2.BinaryOperator;
import java.util.List;
import java.util.function.Function;
import org.junit.Test;

public class chapter2Test {


  public static <T,U,V> Function< Function<U,V>,
                                    Function< Function<T, U>,
                                        Function<T, V>>> higherCompose(){

    //return tuFunc -> uvFunc -> t -> tuFunc.apply(uvFunc.apply(t));

    return (Function<U,V> f) -> (Function<T,U> g) -> (T x) -> f.apply(g.apply(x));
  }


  public static <T,U,V> Function< Function<T,U>,
                                    Function< Function<U,V>,
                                        Function<T,V>>> higherAndThen(){

    //return f -> g -> x -> g.apply(f.apply(x));

    return (Function<T,U> f) -> (Function<U,V> g) -> x -> g.apply(f.apply(x));
  }



  @Test
  public void using_binaryOperator(){

    System.out.println(BinaryOperator.add.apply(3).apply(5));

  }

  @Test
  public void exercise_2_4(){

    final Function< Function<Integer, Integer >, Function< Function<Integer, Integer>, Function<Integer, Integer>>> compose = x -> ( y -> ( z -> x.apply( y.apply(z) ) ) );

    final Function<Integer, Integer> triple = x -> x * 3;

    final Function<Integer, Integer> square = x -> x * x;

    final Function<Integer, Integer> f = compose.apply(square).apply(triple);

    final Function<Integer, Integer> f2 = compose.apply(triple).apply(square);

    System.out.println(f.apply(2));

    System.out.println(f2.apply(2));

  }


  @Test
  public void switching_arguments(){

    final Function<Double, Function<Double, Double>> addTax = x -> y -> y + y / 100 * x;

    final Function<Double, Double> add90PercentTax = addTax.apply(9.0);

    Double price = add90PercentTax.apply(5.0);

    System.out.println(price);

  }


  @Test
  public void debugging_with_lambda(){



  }


  public static <T,U,V> Function<U, Function<T,V>> reverseArg(Function<T, Function<U,V>> f){

    return u -> t -> f.apply(t).apply(u);

  }


  public <A, B, C> Function<B,C> partialA(final A a, final Function<A, Function<B,C>> f){

    return f.apply(a);

  }


  public <A,B,C> Function<A,C> partialB(final B b, final Function<A, Function<B,C>> f){

    return a -> f.apply(a).apply(b);

  }

  public void TestHigherCompose() {
    Function<Double, Integer> f = a -> (int) (a * 3);
    Function<Long, Double> g = a -> a + 2.0;

  }

  public <A,B,C,D> String function (A a, B b, C c, D d){

    return String.format("%s, %s, %s, %s",a,b,c,d);
  }

  public <A,B,C,D> Function<A, Function<B, Function<C, Function<D, String>>>> func(){

    return a -> b -> c -> d -> String.format("%s, %s, %s, %s",a,b,c,d);
  }

  public <A,B,C> Function<A, Function<B, C>> exercise2_10(final Function<Tuple<A,B>, C> f){

    return a -> b -> f.apply( new Tuple<>(a,b));
  }



}

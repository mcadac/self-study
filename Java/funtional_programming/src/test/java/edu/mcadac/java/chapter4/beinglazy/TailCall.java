package edu.mcadac.java.chapter4.beinglazy;

import java.util.stream.Stream;

@FunctionalInterface
public interface TailCall<T> {

    TailCall<T> apply();

    default boolean isComplete(){return false;}

    default T result () { throw new Error("No implemented");}

    default T invoke(){

        return Stream.iterate(this, TailCall::apply)
                .filter(TailCall::isComplete)
                .findFirst()
                .get()
                .result();

    }

}

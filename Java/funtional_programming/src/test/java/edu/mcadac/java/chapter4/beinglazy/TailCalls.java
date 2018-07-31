package edu.mcadac.java.chapter4.beinglazy;

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

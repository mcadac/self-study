package edu.mcadac.java.chapter4.beinglazy;

import java.util.function.Supplier;

public class Evaluation {


    public static boolean evaluate(final int value){

        System.out.println("Evaluating... " + value);
        sleep();
        return value > 100;

    }


    public static void eagerEvaluation(final boolean input1, final boolean input2){

        System.out.println("eager evalutaion called ...");
        System.out.println("accept? :" + (input1 && input2));

    }

    public static void lazyEvaluation(final Supplier<Boolean> input1, final Supplier<Boolean> input2){

        System.out.println("Lazy evalution called...");
        System.out.println("accept? :" + (input1.get() && input2.get()));

    }

    private static void sleep(){
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String... args) throws InterruptedException {

        eagerEvaluation(evaluate(1), evaluate(2));
        System.out.println("=========================");
        lazyEvaluation(() -> evaluate(1), () -> evaluate(2));

    }


}

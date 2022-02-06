package se.mbaeumer.javalab.functiondemo;

import java.util.function.Function;

public class FunctionObjectDemo {
    public static Function<Integer, Integer> functionObjectDemo(){
        Function<Integer, Integer> increaseFunction = Counter::increase;
        return increaseFunction;
    }
}

package se.mbaeumer.javalab.bifunctiondemo;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static String biFunctionDemoString(String string1, String string2){
        BiFunction<String, String, String> concatenation = (s1, s2) -> {
            return s1 + " " + s2;
        };

        return concatenation.apply(string1, string2);
    }

    public static String biFunctionDemoStringExpressionLambda(String string1, String string2){
        BiFunction<String, String, String> concatenation = (s1, s2) -> s1 + " " + s2;
        return concatenation.apply(string1, string2);
    }

    public static int biFunctionDemoInt(int number1, int number2){
        BiFunction<Integer, Integer, Integer> addition = (i1, i2) -> i1 + i2;
        return addition.apply(number1, number2);
    }
}

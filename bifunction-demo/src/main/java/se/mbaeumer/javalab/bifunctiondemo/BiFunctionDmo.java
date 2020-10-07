package se.mbaeumer.javalab.bifunctiondemo;

import java.util.function.BiFunction;

public class BiFunctionDmo {


    public static void main(String[] args){

        BiFunction<String, String, String> concatenation = (s1, s2) -> {
            return s1 + " " + s2;
        };

        System.out.println(concatenation.apply("Martin", "Bäumer"));

        BiFunction<Integer, Integer, Integer> addition = (i1, i2) -> i1 + i2;

        System.out.println(addition.apply(3, 4));



    }
}

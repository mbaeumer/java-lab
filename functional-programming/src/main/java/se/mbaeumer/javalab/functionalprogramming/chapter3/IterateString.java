package se.mbaeumer.javalab.functionalprogramming.chapter3;

public class IterateString {
    public static void unexpectedIteration(){
        String test = "testString";
        test.chars().forEach(System.out::println);
    }

    public static void expectedIteration(){
        String test = "testString";
        test.chars()
                .mapToObj(ch -> Character.valueOf((char) ch))
                .forEach(System.out::println);
    }
}

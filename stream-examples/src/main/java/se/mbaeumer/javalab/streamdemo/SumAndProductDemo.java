package se.mbaeumer.javalab.streamdemo;

import java.util.List;
import java.util.stream.Collectors;

public class SumAndProductDemo {
    public static int getSum(List<Integer> integers){
        return integers.stream().mapToInt(i -> i).sum();
    }

    public static int getProduct(List<Integer> integers){
        return integers.stream().reduce(1, (a,b) -> a*b);
    }
}

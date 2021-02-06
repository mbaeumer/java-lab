package se.mbaeumer.javalab.java12;

import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorDemo {
    public static void demo(){
        double mean = Set.of(5,6,8)
                .stream()
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(),(sum, count) -> sum/count));


        BiFunction<Double, Long, Double> meanFunction = (sum, count) -> {
            double v = sum / count;
            return v;
        };
        double mean2 = Set.of(5,6,8)
                .stream()
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(), (sum, count) -> meanFunction.apply(sum, count)));


        System.out.println(mean);
        System.out.println(mean2);
    }
}

package se.mbaeumer.javalab.functionalprogramming.chapter2;

import java.util.List;

public class SumofValues {

    public int calculateSumOldSchool(){
        final List<Integer> integers = List.of(1, 6, 2, 7, 3, 2);

        int sum = 0;
        for (Integer i : integers){
            sum += i;
        }

        return sum;
    }

    public Integer calculateSumWithStreams(){
        final List<Integer> integers = List.of(1, 6, 2, 7, 3, 2);

        return integers.stream().reduce(0, Integer::sum);
    }
}

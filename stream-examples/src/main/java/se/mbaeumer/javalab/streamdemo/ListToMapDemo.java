package se.mbaeumer.javalab.streamdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapDemo {


    public static void createCountMap(){
        List<String> words = List.of("one", "two", "three", "two", "three");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words){
            //wordCount.keySet().stream().filter(key -> word.equals(key)).findFirst().or
            Integer value = wordCount.get(word);
            int newValue = value == null ? 1 : value + 1;
            wordCount.put(word, newValue);
        }

        System.out.println();
    }

    public static void createWithStream(){
        List<String> words = List.of("one", "two", "three", "two", "three");

        //Map<String, Integer> wordCount = words.stream().collect(Collectors.toMap(Function.identity(), Map.entry(Function.identity(),null).getValue()));

        Map<String, Long> counts =
                words.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println();
    }
}

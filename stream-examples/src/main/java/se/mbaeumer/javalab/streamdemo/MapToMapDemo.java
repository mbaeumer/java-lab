package se.mbaeumer.javalab.streamdemo;

import java.util.Map;
import java.util.stream.Collectors;

public class MapToMapDemo {
    public static Map<String, Double> map(Map<String, Double> map){
        return map.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> 1 - e.getValue() == 0 ? 0.001 : 1 - e.getValue()
                ));
    }
}

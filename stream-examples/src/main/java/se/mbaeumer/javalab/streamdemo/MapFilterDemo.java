package se.mbaeumer.javalab.streamdemo;

import java.util.Map;
import java.util.stream.Collectors;

public class MapFilterDemo {
    public static Map<String, Integer> filterDemo(Map<String, Integer> map){
        return map.entrySet()
                .stream()
                .filter(stringIntegerEntry -> stringIntegerEntry.getValue() < 40)
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue()
                ));
    }
}

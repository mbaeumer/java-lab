package se.mbaeumer.javalab.streamdemo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapToMapDemoTest {

    @Test
    void map() {
        Map<String, Double> original = new HashMap<>();
        original.put("v1", 0.8);
        Map<String, Double> result = MapToMapDemo.map(original);
        double expected = Math.ceil(result.get("v1"));
        assertEquals(expected, 0.2);
    }
}
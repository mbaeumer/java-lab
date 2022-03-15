package se.mbaeumer.javalab.streamdemo;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapFilterDemoTest {

    @Test
    void filterDemo() {
        Map<String, Integer> map = Map.ofEntries(
                Map.entry("Martin", 41),
                Map.entry("Pelle", 47),
                Map.entry("Pernilla", 15),
                Map.entry("Jane", 37),
                Map.entry("Jessica", 42)
        );
        Map<String, Integer> actual = MapFilterDemo.filterDemo(map);
        assertTrue(actual.entrySet().size() == 2);
        assertTrue(actual.containsKey("Pernilla"));
        assertTrue(actual.containsKey("Jane"));
    }
}
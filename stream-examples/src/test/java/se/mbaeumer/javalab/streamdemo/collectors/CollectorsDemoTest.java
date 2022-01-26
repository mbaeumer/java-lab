package se.mbaeumer.javalab.streamdemo.collectors;

import org.junit.jupiter.api.Test;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CollectorsDemoTest {

    @Test
    void joiningDemo() {
        assertTrue( "alphabetagamma".equals(CollectorsDemo.joiningDemo()), CollectorsDemo.joiningDemo());
    }

    @Test
    void joiningDemoWithCharacter() {
        assertTrue( "alpha,beta,gamma".equals(CollectorsDemo.joiningDemoWithCharacter()), CollectorsDemo.joiningDemo());
    }

    @Test
    void averagingIntDemo() {
        assertEquals(6.0, CollectorsDemo.averagingIntDemo());
    }

    @Test
    void countingDemo() {
        assertEquals(3, CollectorsDemo.countingDemo());
    }

    @Test
    void groupingByDemo() {
        Map<Severity, List<Bug>> map = CollectorsDemo.groupingByWithNonPrimitiveDemo();
        List<Bug> highSeverityBugs = map.get(Severity.HIGH);
        assertEquals(5, highSeverityBugs.size());
    }

    @Test
    void maxByDemo() {
        Integer actual = CollectorsDemo.maxByDemo();
        assertEquals(9, actual);
    }

    @Test
    void minByDemo() {
        Integer actual = CollectorsDemo.minByDemo();
        assertEquals(2, actual);
    }

    @Test
    void reducingDemo() {
        int n = CollectorsDemo.reducingDemo();
        assertEquals(47, n);
    }

    @Test
    void partitioningDemo() {
        Map<Boolean, List<Integer>> map = CollectorsDemo.partitioningByDemo();
        List<Integer> entry = map.get(true);
        assertEquals(2, entry.size());
        assertEquals(entry.get(0), 8);
    }

    @Test
    void groupingByWithIntegerDemo() {
        Map<Integer, List<Integer>> map = CollectorsDemo.groupingByWithIntegerDemo();
        List<Integer> fives = map.get(5);
        assertEquals(2, fives.size());
        assertEquals(5, fives.get(0));
    }

    @Test
    void summarizingDemo() {
        IntSummaryStatistics intSummaryStatistics = CollectorsDemo.summarizingDemo();
        assertEquals(3, intSummaryStatistics.getMin());
        assertEquals(8, intSummaryStatistics.getMax());
        assertEquals(47, intSummaryStatistics.getSum());
        assertEquals(9, intSummaryStatistics.getCount());
    }

    @Test
    void summingDemo() {
        Integer integer = CollectorsDemo.summingDemo();
        assertEquals(47, integer);
    }

    @Test
    void teeingDemo() {
        Map<String, Optional<Integer>> stringOptionalMap = CollectorsDemo.teeingDemo();
        Optional<Integer> valueMin = stringOptionalMap.get("MIN");
        Optional<Integer> valueMax = stringOptionalMap.get("MAX");
        assertTrue(valueMin.isPresent());
        assertTrue(valueMax.isPresent());
        assertEquals(3, valueMin.get());
        assertEquals(8, valueMax.get());
    }
}
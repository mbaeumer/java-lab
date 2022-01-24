package se.mbaeumer.javalab.streamdemo.collectors;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

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
        Map<Severity, List<Bug>> map = CollectorsDemo.groupingByDemo();
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


}
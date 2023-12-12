package se.mbaeumer.javalab.functionalprogramming.chapter3;

import org.junit.jupiter.api.Test;
import se.mbaeumer.javalab.functionalprogramming.chapter3.comparator.Person;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxDemoTest {

    @Test
    void getYoungest() {
        MinMaxDemo minMaxDemo = new MinMaxDemo();
        final Person youngest = minMaxDemo.getYoungest();
        assertNotNull(youngest);
        assertEquals(27, youngest.getAge());
        assertEquals("Adam", youngest.getName());
    }

    @Test
    void getOldest() {
        MinMaxDemo minMaxDemo = new MinMaxDemo();
        final Person oldest = minMaxDemo.getOldest();
        assertNotNull(oldest);
        assertEquals(43, oldest.getAge());
        assertEquals("Charlie", oldest.getName());
    }
}
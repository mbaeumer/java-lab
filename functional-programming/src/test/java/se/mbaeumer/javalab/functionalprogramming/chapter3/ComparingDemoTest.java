package se.mbaeumer.javalab.functionalprogramming.chapter3;

import org.junit.jupiter.api.Test;
import se.mbaeumer.javalab.functionalprogramming.chapter3.comparator.Person;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComparingDemoTest {

    @Test
    void getSortedByAgeAscending() {
        ComparingDemo comparingDemo = new ComparingDemo();
        final List<Person> sortedByAge = comparingDemo.getSortedByAgeAscending();

        assertNotNull(sortedByAge);
        final Person person = sortedByAge.get(0);
        assertEquals(27, person.getAge());
        assertEquals("Adam", person.getName());
    }

    @Test
    void getSortedByAgeDescending() {
        ComparingDemo comparingDemo = new ComparingDemo();
        final List<Person> sortedByAge = comparingDemo.getSortedByAgeDescending();

        assertNotNull(sortedByAge);
        final Person person = sortedByAge.get(0);
        assertEquals(43, person.getAge());
        assertEquals("Charlie", person.getName());
    }
}
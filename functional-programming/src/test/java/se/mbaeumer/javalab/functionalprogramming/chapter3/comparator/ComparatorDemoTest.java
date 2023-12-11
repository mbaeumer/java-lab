package se.mbaeumer.javalab.functionalprogramming.chapter3.comparator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorDemoTest {

    @Test
    void demoSortedAscendingListWithLambda() {
        ComparatorDemo demo = new ComparatorDemo();
        final List<Person> demoSortedList = demo.demoSortedAscendingListWithLambda();

        assertNotNull(demoSortedList);
        final Person secondPerson = demoSortedList.get(1);
        assertEquals("Bob", secondPerson.getName());
        assertEquals(35, secondPerson.getAge());

    }

    @Test
    void demoSortedAscendingListWithMethodReference() {
        ComparatorDemo demo = new ComparatorDemo();
        final List<Person> demoSortedList = demo.demoSortedAscendingListWithMethodReference();

        assertNotNull(demoSortedList);
        final Person secondPerson = demoSortedList.get(1);
        assertEquals("Bob", secondPerson.getName());
        assertEquals(35, secondPerson.getAge());
    }
}
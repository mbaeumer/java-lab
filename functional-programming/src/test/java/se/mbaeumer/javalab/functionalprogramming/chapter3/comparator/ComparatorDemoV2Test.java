package se.mbaeumer.javalab.functionalprogramming.chapter3.comparator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorDemoV2Test {

    @Test
    void comparator() {
        ComparatorDemoV2 reuseComparatorDemo = new ComparatorDemoV2();

        final List<Person> personListSortedDescending = reuseComparatorDemo.comparator();

        assertNotNull(personListSortedDescending);
        final Person firstPerson = personListSortedDescending.get(0);
        assertEquals("Charlie", firstPerson.getName());
        assertEquals(43, firstPerson.getAge());
    }

    @Test
    void orderAscendingAndDescending() {
        ComparatorDemoV2 comparatorDemoV2 = new ComparatorDemoV2();

        final OrderedData orderedData = comparatorDemoV2.orderAscendingAndDescending();

        assertNotNull(orderedData);
        assertNotNull(orderedData.getOrderedAscending());
        assertNotNull(orderedData.getOrderedDescending());

        Person oldest = orderedData.getOrderedDescending().get(0);
        assertEquals("Charlie", oldest.getName());
        assertEquals(43, oldest.getAge());

        Person youngest = orderedData.getOrderedAscending().get(0);
        assertEquals("Adam", youngest.getName());
        assertEquals(27, youngest.getAge());
    }
}
package se.mbaeumer.javalab.functionalprogramming.chapter3.comparator;

import java.util.List;

public class OrderedData {
    private List<Person> orderedAscending;

    private List<Person> orderedDescending;

    public OrderedData(List<Person> orderedAscending, List<Person> orderedDescending) {
        this.orderedAscending = orderedAscending;
        this.orderedDescending = orderedDescending;
    }

    public List<Person> getOrderedAscending() {
        return orderedAscending;
    }

    public void setOrderedAscending(List<Person> orderedAscending) {
        this.orderedAscending = orderedAscending;
    }

    public List<Person> getOrderedDescending() {
        return orderedDescending;
    }

    public void setOrderedDescending(List<Person> orderedDescending) {
        this.orderedDescending = orderedDescending;
    }
}

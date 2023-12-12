package se.mbaeumer.javalab.functionalprogramming.chapter3.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemoV2 {
    public List<Person> duplicate(){
        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));

        return people
                .stream()
                .sorted((people1, people2) -> people2.ageDifference(people1))
                .collect(Collectors.toList());
    }

    public List<Person> comparator(){

        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));

        Comparator<Person> descending = (people1, people2) -> people2.ageDifference(people1);
        return people
                .stream()
                .sorted(descending)
                .collect(Collectors.toList());

    }

    public OrderedData orderAscendingAndDescending(){

        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));

        Comparator<Person> ascending = (people1, people2) -> people1.ageDifference(people2);
        List<Person> ascendingOrder = people
                .stream()
                .sorted(ascending)
                .collect(Collectors.toList());

        List<Person> descendingOrder = people
                .stream()
                .sorted(ascending.reversed())
                .collect(Collectors.toList());

        return new OrderedData(ascendingOrder, descendingOrder);
    }
}

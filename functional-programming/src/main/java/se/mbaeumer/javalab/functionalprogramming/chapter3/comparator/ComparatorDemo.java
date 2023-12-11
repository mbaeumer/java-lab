package se.mbaeumer.javalab.functionalprogramming.chapter3.comparator;

import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo {
    public List<Person> demoSortedAscendingListWithLambda(){
        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));

        return people
                .stream()
                .sorted((people1, people2) -> people1.ageDifference(people2))
                .collect(Collectors.toList());


    }

    public List<Person> demoSortedDescendingListWithLambda(){
        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));

        return people
                .stream()
                .sorted((people1, people2) -> people2.ageDifference(people1))
                .collect(Collectors.toList());


    }

    public List<Person> demoSortedAscendingListWithMethodReference(){
        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));

        return people
                .stream()
                .sorted(Person::ageDifference)
                .collect(Collectors.toList());


    }






}

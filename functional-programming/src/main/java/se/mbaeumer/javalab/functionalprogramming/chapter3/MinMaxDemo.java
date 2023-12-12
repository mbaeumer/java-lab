package se.mbaeumer.javalab.functionalprogramming.chapter3;

import se.mbaeumer.javalab.functionalprogramming.chapter3.comparator.Person;

import java.util.List;

public class MinMaxDemo {
    public Person getYoungest(){
        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));

        return people
                .stream()
                .min(Person::ageDifference)
                .orElse(null);
    }

    public Person getOldest(){
        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));

        return people
                .stream()
                .max(Person::ageDifference)
                .orElse(null);
    }
}

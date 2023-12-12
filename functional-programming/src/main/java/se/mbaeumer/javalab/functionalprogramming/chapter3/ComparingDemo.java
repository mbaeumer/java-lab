package se.mbaeumer.javalab.functionalprogramming.chapter3;

import se.mbaeumer.javalab.functionalprogramming.chapter3.comparator.Person;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ComparingDemo {

    public List<Person> getSortedByAgeAscending(){
        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));
        Function<Person, Integer> byAge = person -> person.getAge();
        return people.stream()
                .sorted(Comparator.comparing(byAge))
                .collect(Collectors.toList());
    }

    public List<Person> getSortedByAgeDescending(){
        final List<Person> people = List.of(new Person("Bob", 35), new Person("Adam", 27), new Person("Charlie", 43));
        Function<Person, Integer> byAge = person -> person.getAge();
        return people.stream()
                .sorted(Comparator.comparing(byAge).reversed())
                .collect(Collectors.toList());
    }
}

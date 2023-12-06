package se.mbaeumer.javalab.functionalprogramming.chapter2;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReuseLambdasWithPredicate {

    private final Predicate<String> stringsWithB = string -> string.startsWith("B");
    public void findNamesWithLambda() {
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        final List<String> namesWithB = names.stream()
                .filter(name -> name.startsWith("B"))
                .collect(Collectors.toList());
    }

    public void findNamesWithPredicate(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        final List<String> namesWithB = names.stream()
                .filter(stringsWithB)
                .collect(Collectors.toList());

    }

    public void findFriendsWithLambda() {
        final List<String> friends = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        final List<String> friendsWithB = friends.stream()
                .filter(name -> name.startsWith("B"))
                .collect(Collectors.toList());
    }

    public void findFriendsWithPredicate() {
        final List<String> friends = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        final List<String> friendsWithB = friends.stream()
                .filter(stringsWithB)
                .collect(Collectors.toList());
    }
}

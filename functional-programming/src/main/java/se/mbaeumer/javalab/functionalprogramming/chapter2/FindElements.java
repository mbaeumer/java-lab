package se.mbaeumer.javalab.functionalprogramming.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindElements {

    public void findElementsOldSchool() {
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        List<String> namesWithB = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("B")){
                namesWithB.add(name);
            }
        }
    }

    public void findElementsFilter() {
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        final List<String> namesWithB = names.stream()
                .filter(name -> name.startsWith("B"))
                .collect(Collectors.toList());
    }



}

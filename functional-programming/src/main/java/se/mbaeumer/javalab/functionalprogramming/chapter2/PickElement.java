package se.mbaeumer.javalab.functionalprogramming.chapter2;

import java.util.ArrayList;
import java.util.List;

public class PickElement {
    public void pickElementOldSchool(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        String matchingElement = null;
        for (String name : names) {
            if ("Mary".equals(name)){
                matchingElement = name;
            }
        }
    }

    public void pickElementWithStream(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        names.stream().filter(n -> "Mary".equals(n)).findFirst().orElse(null);
    }
}

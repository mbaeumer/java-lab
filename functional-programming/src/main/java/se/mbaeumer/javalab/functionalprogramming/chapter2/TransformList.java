package se.mbaeumer.javalab.functionalprogramming.chapter2;

import java.util.ArrayList;
import java.util.List;

public class TransformList {

    public void transformOldSchool(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Eddie", "Sara");

        List<String> upperCaseList = new ArrayList<>();
        for (int i = 0; i < names.size(); i++){
            upperCaseList.add(names.get(i).toUpperCase());
        }
    }

    public void transformWithLambda(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Eddie", "Sara");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
    }

    public void transformWithMethodReference(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Eddie", "Sara");

        names.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));
    }
}

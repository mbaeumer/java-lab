package se.mbaeumer.javalab.functionalprogramming.chapter2;

import java.util.List;
import java.util.function.Consumer;

public class IterateThroughList {

    public void iterateOldStyle(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Eddie", "Sara");

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }

    public void iterateWithConsumer(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Eddie", "Sara");

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    public void iterateWithLambda(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Eddie", "Sara");

        names.forEach(name -> System.out.println(name));
    }

    public void iterateWithMethodReference(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Eddie", "Sara");
        names.forEach(System.out::println);
    }
}

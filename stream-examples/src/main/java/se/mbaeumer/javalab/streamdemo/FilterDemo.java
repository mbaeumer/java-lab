package se.mbaeumer.javalab.streamdemo;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

    public void forEach(){
        List<String> letters = getLetters();
        letters.stream().forEach(System.out::println);
    }

    public void forEachParallel(){
        System.out.println();
        List<String> letters = getLetters();
        letters.parallelStream().forEach(System.out::println);
    }


    public List<String> getLetters(){
        List<String> letters = new ArrayList<>();
        letters.add("k");
        letters.add("z");
        letters.add("a");
        letters.add("v");
        letters.add("j");
        letters.add("p");
        letters.add("i");

        return letters;
    }

    public List<String> getNames(){
        List<String> names = new ArrayList<>();
        names.add("Pelle");
        names.add("Gustav");
        names.add("Lotta");
        return names;

    }
}

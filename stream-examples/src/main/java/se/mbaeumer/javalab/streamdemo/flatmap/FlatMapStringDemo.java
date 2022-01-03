package se.mbaeumer.javalab.streamdemo.flatmap;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStringDemo {

    public List<String> initNamesList(){
        List<String> names = List.of("Martin", "Bob", "Kalle");
        return names;
    }

    private List<List<String>> initListOfLists(){
        return List.of(List.of("a"), List.of("c"), List.of("d"), List.of("c"));
    }

    public void getAllCharactersFromNamesList(){
        List<String> names = initNamesList();
        List<Character> characters = names.stream().flatMap(str -> str.chars().mapToObj(c -> (char) c)).collect(Collectors.toList());
        System.out.println(characters);
    }

    public void getAllCharactersFromList(){
        List<List<String>> list = initListOfLists();
        List<String> flattenedStrings = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flattenedStrings);
    }
}

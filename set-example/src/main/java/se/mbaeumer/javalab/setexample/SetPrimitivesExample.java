package se.mbaeumer.javalab.setexample;

import java.util.HashSet;
import java.util.Set;

public class SetPrimitivesExample {

    private Set<String> strings;
    private Set<String> vowels;

    public SetPrimitivesExample() {
        initSetOfStrings();
        initVowels();
    }

    private void initSetOfStrings(){
        strings = new HashSet<>(); //Set.of("a","b","c","d");
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
    }

    private void initVowels(){
        vowels = Set.of("a", "e", "i", "o", "u");
    }

    public String addElement(String e){
        return strings.add(e) ? "added" : "not added";
    }

    public String removeElement(String e){
        return strings.remove(e) ? "removed" : "not removed";
    }

    public boolean containsElement(String e){
        return strings.contains(e);
    }

    public void removeConsonants(){
        strings.removeIf(s -> !vowels.contains(s));

    }

    public void showSetContent(){
        strings.stream().forEach(System.out::println);
    }
}

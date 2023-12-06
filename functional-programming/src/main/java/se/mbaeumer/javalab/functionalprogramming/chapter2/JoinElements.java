package se.mbaeumer.javalab.functionalprogramming.chapter2;

import java.util.List;
import java.util.stream.Collectors;

public class JoinElements {

    public String joinOldSchool(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        String joined = "";
        for (String name : names){
            joined = joined + name + ",";
        }

        return joined.substring(0, joined.length()-1);
    }

    public String joinWithStreams(){
        final List<String> names = List.of("Brian", "Lisa", "John", "Mary", "Bob", "Sara");

        return names.stream().collect(Collectors.joining(","));
    }
}

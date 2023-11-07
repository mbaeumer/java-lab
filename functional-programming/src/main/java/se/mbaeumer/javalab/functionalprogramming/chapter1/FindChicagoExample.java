package se.mbaeumer.javalab.functionalprogramming.chapter1;

import java.util.List;

public class FindChicagoExample {

    public boolean findOldStyle(){
        final List<String> cities = List.of("Munich", "Stockholm", "New York", "Chicago");
        boolean chicagoExists = false;
        for (String city : cities){
            if ("Chicago".equals(city)){
                chicagoExists = true;
            }
        }
        return chicagoExists;
    }

    public boolean findFunctionalStyle(){
        final List<String> cities = List.of("Munich", "Stockholm", "New York", "Chicago");
        return cities.contains("Chicago");
    }
}

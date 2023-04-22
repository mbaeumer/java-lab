package se.mbaeumer.javalab.streamdemo;

import java.util.List;

public class AnyMatchDemo {

    public static boolean anyMatchDemoWithLambda(final List<String> names, final String search){
        return names.stream().anyMatch(s -> search.equals(s));
    }

    public static boolean anyMatchDemoWithMethodReference(final List<String> names, final String search){
        return names.stream().anyMatch(search::equals);
    }

}

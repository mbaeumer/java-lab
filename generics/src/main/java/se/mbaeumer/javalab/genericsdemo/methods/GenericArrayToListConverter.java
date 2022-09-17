package se.mbaeumer.javalab.genericsdemo.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericArrayToListConverter {
    public static <T> List<T> convertArrayToList(T[] array){
        return Arrays.stream(array).collect(Collectors.toList());
    }
}

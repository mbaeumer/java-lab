package se.mbaeumer.javalab.genericsdemo.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListConverter {
    public static List<Byte> convertByteArray(Byte[] array){
        return Arrays.asList(array).stream().collect(Collectors.toList());
    }

    public static List<String> convertStringArrayToList(String[] strings){
        return Arrays.asList(strings).stream().collect(Collectors.toList());
    }

    public static List<Integer> convertIntegerArrayToList(Integer[] ints){
        return Arrays.asList(ints).stream().collect(Collectors.toList());
    }
}

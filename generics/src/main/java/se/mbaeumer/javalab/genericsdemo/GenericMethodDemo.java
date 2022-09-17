package se.mbaeumer.javalab.genericsdemo;

import se.mbaeumer.javalab.genericsdemo.methods.ArrayToListConverter;
import se.mbaeumer.javalab.genericsdemo.methods.GenericArrayToListConverter;

import java.util.List;

public class GenericMethodDemo {
    public static void main(String[] args){
        String[] strings = new String[]{"a", "b", "c", "d"};
        List<String> stringList = ArrayToListConverter.convertStringArrayToList(strings);

        Byte[] bytes = new Byte[]{1, 2, 3, 4};
        List<Byte> byteList = ArrayToListConverter.convertByteArray(bytes);

        Integer[] integers = new Integer[]{1, 2, 3, 4};
        List<Integer> integerList = ArrayToListConverter.convertIntegerArrayToList(integers);

        stringList = GenericArrayToListConverter.convertArrayToList(strings);
        byteList = GenericArrayToListConverter.convertArrayToList(bytes);
        integerList = GenericArrayToListConverter.convertArrayToList(integers);
    }
}

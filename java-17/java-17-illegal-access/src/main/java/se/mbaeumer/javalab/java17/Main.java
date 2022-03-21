package se.mbaeumer.javalab.java17;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args){
        String greeting = "hello";
        System.out.println("Value of 'greeting': " + greeting);
        try {
            Field valueField = String.class.getDeclaredField("value");
            valueField.setAccessible(true);
            Field modifier = Field.class.getDeclaredField("modifiers");
            modifier.setAccessible(true);
            modifier.setInt(valueField, valueField.getModifiers() & ~Modifier.FINAL);
            valueField.set(greeting, "hejho".getBytes());
            System.out.println("Value of 'greeting': " + greeting);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Is this executed?");
    }
}

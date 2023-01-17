package se.mbaeumer.stringformatdemo;

public class StringFormatDemo {
    public static void main(String[] args){
        // concatenation
        String firstName = "Martin";
        String lastName = "Bäumer";
        int age = 25;
        System.out.println("Hello, my name is " + firstName + " " + lastName + " and I am " + age + " years old");

        System.out.println("And now with String.format");
        System.out.println(String.format("Hello, my name is %s %s and I am %d years old", firstName, lastName, age));

    }
}

package se.mbaeumer.javalab.java14;

import se.mbaeumer.javalab.java14.records.User;

public class Main {
    public static void main(String[] args){
        SwitchDemo switchDemo = new SwitchDemo();
        switchDemo.demo();
        PatternMatchingDemo patternMatchingDemo = new PatternMatchingDemo();
        patternMatchingDemo.demo(1);
        patternMatchingDemo.demo("Some string");

        User user = new User("John", "Doe", "johndoe");
        System.out.println("Created an object of type User based on a record");
        System.out.println(user.firstname());
        System.out.println(user.lastname());
        System.out.println(user.username());
    }
}

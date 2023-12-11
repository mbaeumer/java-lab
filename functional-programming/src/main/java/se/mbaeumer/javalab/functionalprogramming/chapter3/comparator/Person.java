package se.mbaeumer.javalab.functionalprogramming.chapter3.comparator;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int ageDifference(Person other){
        return age - other.getAge();
    }
}

package se.mbaeumer.javalab.java14;

public class PatternMatchingDemo {

    public void demo(Object obj){
        if (obj instanceof String str){
            System.out.println("The string's length is: " +  str.length());
        }else{
            System.out.println("the parameter is not a string at all");
        }
    }
}

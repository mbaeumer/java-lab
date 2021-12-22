package se.mbaeumer.javalab.streamdemo;

public class Main {
    public static void main(String[] args){
        FilterDemo filterDemo = new FilterDemo();
        filterDemo.forEach();
        filterDemo.forEachParallel();
    }
}

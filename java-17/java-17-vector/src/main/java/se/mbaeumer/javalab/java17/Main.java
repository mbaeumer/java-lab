package se.mbaeumer.javalab.java17;

public class Main {
    public static void main(String[] args){
        VectorDemo vectorDemo = new VectorDemo();
        int[] a = new int[]{6,8};
        int[] b = new int[]{7,-9};
        int[] c = new int[2];
        vectorDemo.newVectorComputation(a,b,c);
        for (int i : c){
            System.out.println(i);
        }
    }
}
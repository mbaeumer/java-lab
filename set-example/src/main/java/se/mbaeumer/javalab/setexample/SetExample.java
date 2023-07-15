package se.mbaeumer.javalab.setexample;

public class SetExample {
    public static void main(String[] args) {
        System.out.println("Step 1: Creating a demo Set of strings");
        SetPrimitivesExample setPrimitivesExample = new SetPrimitivesExample();

        System.out.println("Step 2: Show the content of the Set");
        setPrimitivesExample.showSetContent();

        System.out.println("Step 3: Add an element");
        System.out.println(setPrimitivesExample.addElement("f"));

        System.out.println("Step 4: Show the content of the Set - after adding an element");
        setPrimitivesExample.showSetContent();

        System.out.println("Step 5: Add a duplicate element");
        System.out.println(setPrimitivesExample.addElement("f"));

        System.out.println("Step 6: Remove an element");
        System.out.println(setPrimitivesExample.removeElement("f"));

        System.out.println("Step 7: Remove an element that does not exist");
        System.out.println(setPrimitivesExample.removeElement("f"));

        System.out.println("Step 8: Check if the set contains a certain string");
        System.out.println(setPrimitivesExample.containsElement("a"));

        System.out.println("Step 9: Use removeIf");
        setPrimitivesExample.removeConsonants();

        System.out.println("Step 10: Show the content of the Set - after removing the consonants");
        setPrimitivesExample.showSetContent();

    }
}

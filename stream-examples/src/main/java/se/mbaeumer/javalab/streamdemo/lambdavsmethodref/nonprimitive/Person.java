package se.mbaeumer.javalab.streamdemo.lambdavsmethodref.nonprimitive;

public class Person {
    private String firstName;
    private String lastName;

    public void sayHi(){
        System.out.println(firstName + " says Hi!");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

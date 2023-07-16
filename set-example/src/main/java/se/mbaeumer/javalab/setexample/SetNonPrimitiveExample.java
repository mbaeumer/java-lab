package se.mbaeumer.javalab.setexample;

import java.util.HashSet;
import java.util.Set;

public class SetNonPrimitiveExample {
    private Set<Person> persons;

    public SetNonPrimitiveExample() {
        initData();
    }

    public boolean addPerson(Person person){
        return persons.add(person);
    }

    public void showContent(){
        persons.stream().forEach(p -> System.out.println(p.toString()));
    }

    private void initData(){
        persons = new HashSet<>();
        persons.add(createPerson(1, "Martin", "Bäumer"));
        persons.add(createPerson(2, "John", "Doe"));
        persons.add(createPerson(3, "Jane", "Doe"));

    }

    private Person createPerson(int id, String firstName, String lastName){
        return new Person(id, firstName, lastName);
    }

}

package se.mbaeumer.javalab.streamdemo.lambdavsmethodref.nonprimitive;

import java.util.ArrayList;
import java.util.List;

public class LambdaVsMethodReference {
    public static void demoLambda(){
        List<Person> persons = new ArrayList<>();
        persons.add(createPerson("John", "Doe"));
        persons.add(createPerson("Bob", "Marley"));

        persons.stream().forEach(p -> p.sayHi());
    }

    public static void demoMethodRef(){
        List<Person> persons = new ArrayList<>();
        persons.add(createPerson("John", "Doe"));
        persons.add(createPerson("Bob", "Marley"));

        persons.stream().forEach(Person::sayHi);
    }

    public static Person createPerson(final String firstName, final String lastName){
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);

        return person;
    }
}

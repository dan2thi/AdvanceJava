package stream.exercises.ex1;

import java.util.Arrays;
import java.util.List;

public class Person {

    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    static List<Person> getPersonList() {
        Person[] persons = {
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27)
        };

        return Arrays.asList(persons);
    }

}

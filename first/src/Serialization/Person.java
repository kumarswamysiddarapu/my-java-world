package Serialization;

import java.io.Serializable;

public class Person implements Serializable {
     String firstName="kumarswamy";
     String lastName="siddarapu";
     int age=19;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
    }
}

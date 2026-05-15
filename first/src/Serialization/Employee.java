package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    transient String surname;
    String dept;
    int age;
    int salary;
    Employee(String name, String dept, int age, int salary,String surname) {
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.salary = salary;
        this.surname=surname;
    }
}

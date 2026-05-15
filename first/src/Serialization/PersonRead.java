package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonRead {

    public static void main(String[] args) throws IOException {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\java1\\first\\src\\Serialization\\Person.txt"))) {

            Person s = (Person) ois.readObject();

            System.out.println(s.firstName);
            System.out.println(s.lastName);
            System.out.println(s.age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

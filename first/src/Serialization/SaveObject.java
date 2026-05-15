package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObject {
    public static void main(String[] args) throws IOException {
        Student s=new Student(101,"kumarswamy",85.23);
        try(FileOutputStream fos = new FileOutputStream("Student.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            System.out.println("Saved Successfully");
        }catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

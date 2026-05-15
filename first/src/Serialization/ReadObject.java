package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args)throws IOException {
        try {
            FileInputStream fis = new FileInputStream("D:\\java1\first\src\\Serialization\\Student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            System.out.println("ID " + s.id);
            System.out.println("Name " + s.name);
            System.out.println("score " + s.score);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

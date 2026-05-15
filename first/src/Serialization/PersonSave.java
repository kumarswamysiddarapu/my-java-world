package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSave {
    public static void main(String[] args) throws IOException {
        Person ps = new Person("kumarswamy","siddarapu",19);
       try(FileOutputStream fos=new  FileOutputStream("D:\\java1\\first\\src\\Serialization\\Person.txt")) {
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(ps);
           System.out.println(oos.toString());
           System.out.println("MISSION successfully ACCOMPLISHED ");
           oos.close();
       }catch(Exception e) {
           System.out.println(e.getMessage());
       }

    }
}

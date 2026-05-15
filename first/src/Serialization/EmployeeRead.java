package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try{
            FileInputStream f=new FileInputStream("D:\\java1\\first\\src\\Serialization\\Employee.text");
            ObjectInputStream o=new ObjectInputStream(f);
            Employee emp=(Employee)o.readObject();
            System.out.println(emp);
            System.out.println(emp.age);
            System.out.println(emp.salary);
            System.out.println(emp.dept);
            System.out.println(emp.name);
            System.out.println(emp.surname);

        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}

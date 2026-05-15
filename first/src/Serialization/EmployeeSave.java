package Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class EmployeeSave {
    public static void main(String[] args) throws IOException {
        Employee emp = new Employee("kumarswamy","statistics",19,20000,"siddarapu");
        try(FileOutputStream fis=new FileOutputStream("D:\\java1\\first\\src\\Serialization\\Employee.text")){
            ObjectOutputStream oos=new ObjectOutputStream(fis);
            oos.writeObject(emp);
            oos.close();
            System.out.println("Mission Accomplished successfully");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}

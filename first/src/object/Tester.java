package object;

import java.util.HashSet;

public class Tester {
    public static void main(String[] args) {
        Employee emp=new Employee("kumar",101,12000);
        Employee emp1=new Employee("swamy",102,10000);
        Employee emp2=new Employee("samay",103,12000);
        Employee emp3=new Employee("samay",104,12000);
        Employee emp4=new Employee("kumar",105,12000);
        Employee emp5=new Employee("swamy",106,10000);
        Employee emp6=new Employee("samay",107,12000);
        Employee emp7=new Employee("samay",108,12000);
        Employee emp8=new Employee("kumar",109,12000);
        Employee emp9=new Employee("swamy",1012,10000);
        Employee emp10=new Employee("samay",1013,12000);
        Employee emp11=new Employee("samay",1023,12000);
        Employee emp12=new Employee("kumar",1031,12000);
        Employee emp13=new Employee("swamy",1042,10000);
        Employee emp14=new Employee("samay",1053,12000);
        Employee emp15 =new Employee("samay",1063,12000);

        HashSet<Employee> h = new HashSet<Employee>();
        h.add(emp);
        h.add(emp1);
        h.add(emp2);
        h.add(emp3);
        h.add(emp4);
        h.add(emp5);
        h.add(emp6);
        h.add(emp7);
        h.add(emp8);
        h.add(emp9);
        h.add(emp10);
        h.add(emp11);
        h.add(emp12);
        h.add(emp13);
        h.add(emp14);
        h.add(emp15);

        System.out.println(h);
    }
}
class Employee{
    String name;
    int id;
    int salary;
    static int j=1;
    Employee(String name,int id,int salary){
        this.name=name;
        this.id = id;
        this.salary = salary;
    }
    public String toString() {return "name:"+name+",id:"+id+",salary:"+salary+"\n"+j++;}
    public int hashCode()
    {
       return Integer.hashCode(id);
    }
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(obj.getClass()!=this.getClass())
            return false;
        Employee e=(Employee)obj;
        return e.id==this.id;
    }
}

package has_a_relation.aggregation;

class Student {
    int id ;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;






    }
}
public class College {
    private Student student ;
    College(Student std){
        student = std;
    }
    public void details(){
        System.out.println("student id : "+student.id);
        System.out.println("student name : "+student.name);
    }
}
class Test{
    public static void main(String[] args) {
        Student student = new Student(1,"Kumar");
        College college = new College(student);
        college.details();
    }
}
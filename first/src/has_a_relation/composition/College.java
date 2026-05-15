package has_a_relation.composition;

public class College {
    private Department dept;
    College(){
        dept = new Department();
    }
    public static void main(String[] args) {
        College college = new College();
        college.Create();
    }
    public void Create(){
        System.out.println("College is exist");
        dept.dept();
    }
}
class Department{
    public void dept(){
        System.out.println("Department is created");
    }
}
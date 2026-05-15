package entity;


import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ManyToOne {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("kumar");
	private static EntityManager manager = factory.createEntityManager();
	private static EntityTransaction transaction = manager.getTransaction();
    private static Scanner sc=new Scanner(System.in);
    
    public void choice() {
    	
    	System.out.println("1 for add new department and employee");
    	System.out.println("2 for insert data of employee to department");
        System.out.println("3 for deleting employee from department");
        System.out.println("4 for exiting");
    	while(true) {
    		System.out.println("enter your choice");
    	int choice=sc.nextInt();
    		switch(choice) {
    		case 1:
    			insertNwDepartment();
    			break;
    		case 4:
    			System.exit(0);
    			break;
    		case 2:
    			insert();
    			break;
    		case 3:
    			delete();
    			break;
    		}
    	}
    }
    public  void insertNwDepartment() {
    	 Department d = new Department();
    	 System.out.println("enter department id");
    	 Integer dept_id=sc.nextInt();
         d.setDeptId(dept_id);
         System.out.println("enter designation of the employee");
         String designation=sc.next();
         d.setDeptName(designation);

         Employee e1 = new Employee();
         System.out.println("enter employee id ");
         Integer emp_id=sc.nextInt();
         e1.setEmpId(emp_id);
         System.out.println("enter emeployee name ");
         String name=sc.next();
         e1.setEmpName(name);
         System.out.println("enter salary");
         Integer salary=sc.nextInt();
         e1.setSalary(salary);
         e1.setDepartment(d);

        

         transaction.begin();
         manager.persist(d);
         manager.persist(e1);
         transaction.commit();
         System.out.println("Data Saved");	
    }
    public void insert() {
    	System.out.println("Enter Department id to add employee ");
    	Integer dept_id=sc.nextInt();
    	Employee employee=new Employee();
    	
    	System.out.println("enter employee id");
    	Integer emp_id=sc.nextInt();
    	
    	System.out.println("enter employee name");
    	String name=sc.next();
    	
    	System.out.println("enter salary of employee");
    	Double salary=sc.nextDouble();
    	
    	employee.setEmpId(emp_id);
		employee.setEmpName(name);
		employee.setSalary(salary);
		Department department=manager.find(Department.class,101);
		
    	transaction.begin();
    	if(department!=null) {
    		employee.setDepartment(department);
    		manager.persist(employee);
    		transaction.commit();
    		System.out.println("transaction completed succesfully");
    	}
    	else {
    		System.out.println("transaction not updated to ther table");
    	}
    }
    
    public void delete() {
    
    	System.out.println("enter Employee Id to delete");
    	Integer emp_id=sc.nextInt();
        Employee employee=manager.find(Employee.class, emp_id);
        transaction.begin();
        if(employee!=null) {
          Department dept=employee.getDepartment();
          if(dept!=null) {
           manager.remove(dept);
          }
          manager.remove(employee);
          transaction.commit();
        }
        else {
        	System.out.println("no record deleted");
        	
        }
    }
}










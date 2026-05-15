package manytomany;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class ManyToMany {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("kumar");
	private static EntityManager manager = factory.createEntityManager();
	private static EntityTransaction transaction = manager.getTransaction();
    private static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
    
    	transaction.begin();
    	Students stu = manager.find(Students.class, 1);
    	if(stu != null) {
    	    manager.remove(stu);
    	    System.out.println("Record is eliminated from the tables");
    	}
    	else {
              System.out.println("not detected any changes");
    	      }   	
    	
		Students students=new Students();
		students.setAge(22);
		students.setStu_id(1105);
		students.setStu_name("karna");
		
		Subjects subjects1=manager.find(Subjects.class, 102);
		
		Subjects subjects2=manager.find(Subjects.class, 105);
		
		Subjects subjects3=manager.find(Subjects.class, 104);
		
	
		
	    List<Subjects> list= new ArrayList<Subjects>();
	    if(subjects1!=null&&subjects2!=null&&subjects3!=null) {
	    list.add(subjects1);
	    list.add(subjects2);
	    list.add(subjects3);
	    }
	    
		
		
		students.setSubjects(list);
		manager.persist(students);
		manager.persist(subjects1);
		manager.persist(subjects2);
		manager.persist(subjects3);
		transaction.commit();
		
		
//		Students students2=manager.find(Students.class, 1);
//		if(students2!=null) {
//			System.out.println("subjects are ");
//			for(Subjects sub:students2.getSubjects()) {
//				System.out.println(sub.getSub_name());
//			}
//		}
		
	}
}

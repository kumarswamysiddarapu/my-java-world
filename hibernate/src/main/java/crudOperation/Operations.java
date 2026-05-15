package crudOperation;

import java.util.Scanner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Operations {
	private static EntityManagerFactory factory=Persistence.createEntityManagerFactory("kumar");
	private static EntityManager manager=factory.createEntityManager();
	private static EntityTransaction transaction=manager.getTransaction();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter your choice to do operation");
		System.out.println("1 for insertion");
		System.out.println("2 for deletion");
		System.out.println("3 for updation");
		System.out.println("0 for stop the execution");
		int choice=sc.nextInt();
		while(true) {
		    System.out.println("Enter your choice");
		     choice = sc.nextInt();

		    switch(choice) {
		        case 1: insertData(); break;
		        case 2: deleteData(); break;
		        case 3: updateData(); break;
		        case 0: System.exit(0);
		                System.out.println("Execution stopped ");
		        default: System.out.println("Invalid choice");
		    }
		}
	}
	public static void insertData() {
		System.out.println("enter id ");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
	
		System.out.println("enter subject");
		String subject=sc.next();
		
		transaction.begin();
		Teacher p=new  Teacher();
		    p.setId(id);
		    p.setName(name);
		    p.setSubject(subject);
		    manager.persist(p);
		    transaction.commit();
		    System.out.println("Executed Sucssfully");
		    System.out.println("----------------------------");

	}
	public static void  deleteData() {
		System.out.println("Enter id to delate record");
		int id=sc.nextInt();
		transaction.begin();
		Teacher p=manager.find(Teacher.class, id);
		if(p!=null) {
		manager.remove(p);
		transaction.commit();
		System.out.println("transactiion done successfully");
	    System.out.println("----------------------------");

		}
		else {
			System.out.println("No Record found matched");
		    System.out.println("----------------------------");

		}	
	}
	public static  void updateData() {
		System.out.println("Enter id to update record");
		int id=sc.nextInt();
		System.out.println("enter name to upadate");
		String name=sc.next();
		 System.out.println("Enter subject to update");
		 String sub=sc.next();
		 transaction.begin();
		Teacher p=manager.find(Teacher.class, id);
		if(p!=null) {
			p.setName(name);
			p.setSubject(sub);
			manager.merge(p);
			transaction.commit();
			System.out.println("Transaction done successfully");
		    System.out.println("----------------------------");

		}
		else {
			System.out.println("No record found matched");
		    System.out.println("----------------------------");

		}
	}
}

package crudOperation;


import java.util.List;
import java.util.Scanner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class HQLQuery {
	private static EntityManagerFactory factory=Persistence.createEntityManagerFactory("kumar");
	private static EntityManager manager=factory.createEntityManager();
	private static EntityTransaction transaction=manager.getTransaction();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Query query1=manager.createQuery("SELECT t FROM Teacher t WHERE t.id>=:id and name=:name ");
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name1=sc.next();
		query1.setParameter("id",id);
		query1.setParameter("name", name1);
		List<Teacher> teacher3=query1.getResultList();
		if(teacher3.isEmpty()) {
			System.out.println("no records found in list");
		}else {
		
		for (Teacher teacher2 : teacher3) {
			System.out.println(teacher2.getId()+" "+teacher2.getName()+"  "+teacher2.getSubject());	
		}
		}
		
		System.out.println("_____________________________________________________________________________");
		Query query=manager.createQuery("SELECT t FROM Teacher t WHERE t.id>=?1 or name=?2 ");
		query.setParameter(1, 101);
		query.setParameter(2, "samay");
		List<Teacher> teacher1=query.getResultList();
		for (Teacher teacher2 : teacher1) {
			System.out.println(teacher2.getId()+" "+teacher2.getName()+"  "+teacher2.getSubject());
			
		}
		
		System.out.println("_____________________________________________________________________________");
	
		Query q=manager.createQuery("SELECT t FROM Teacher t WHERE t.id>100 ");
		
		List<Teacher> teacher=q.getResultList();
		for (Teacher teacher2 : teacher) {
			System.out.println(teacher2.getId()+" "+teacher2.getName()+"  "+teacher2.getSubject());
			
		}
	}
}

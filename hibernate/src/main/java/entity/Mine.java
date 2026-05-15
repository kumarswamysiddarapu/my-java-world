package entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mine {
	public static void main(String ar[]) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("kumar");
		System.out.println(em+"connected succesfully");
		
		EntityManager manager=em.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		
		transaction.begin();
		Principal p=manager.find(Principal.class,103);
		if(p!=null) {
		    p.setName("kumarswamy");
		    transaction.commit();
		}
		else {
			System.out.println("Record not matched with any primarykey");
		}
	}
}

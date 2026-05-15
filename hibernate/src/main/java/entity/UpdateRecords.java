package entity;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateRecords {
	public static void main(String[] args) {
		EntityManagerFactory  factory=Persistence.createEntityManagerFactory("kumar");
		
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		
//		transaction.begin();
//		Principal p=manager.find(Principal.class, 101);
//		if(p!=null) {
//			p.setAge(21);
//			p.setName("");
//			transaction.commit();
//		}
		transaction.begin();
		Principal p=manager.find(Principal.class, 102);
		if(p!=null) {
			p.setName("kumarswmy");
			manager.merge(p);
			transaction.commit();
			System.out.println("Transaction done successfully");
		}
		else {
			System.out.println("No record found matched to given primary key");
		}
	}

}

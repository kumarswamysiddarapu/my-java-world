package entity;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class RemoveRecords {
	public static void main(String[] args) {
//		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kumar");
//		EntityManager manager=factory.createEntityManager();
//		EntityTransaction transaction=manager.getTransaction();
//		transaction.begin();
//		Principal p=manager.find( Principal.class,101);
//		if(p!=null) {
//		manager.remove(p.getId());
//		transaction.commit();
//		}
//		else {
//			System.out.println("No Record found with given arguement");
//		}
		

		
		
		
	 EntityManagerFactory factory=Persistence.createEntityManagerFactory("kumar");
	 EntityManager manager=factory.createEntityManager();
	 EntityTransaction transaction=manager.getTransaction();
	 
	 Principal p=manager.find(Principal.class,101);
	 transaction.begin();
	 if(p!=null) {
		 p.setName("swamy");
		 transaction.commit();
	 }
	 else {
		 System.out.println("no record changet in the table/entity");
	 }
//	 p.setId(104);
//	 p.setAge(24);
//	 p.setName("samay");
//	 
//	 transaction.begin();
//	 manager.persist(p);
//	 transaction.commit();
	 
//	 p.setId(105);
//	 p.setAge(22);
//	 p.setName("komal");
//	 transaction.begin();
//	 manager.persist(p);
//	 transaction.commit();
	 
//	 p.setId(106);
//	 p.setAge(21);
//	 p.setName("satya");
//	 transaction.begin();
//	 manager.persist(p);
//	 transaction.commit();
//	 
//	 System.out.println("record is inserted successfully");
	 
	 
	}

}

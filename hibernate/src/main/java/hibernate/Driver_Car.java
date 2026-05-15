package hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver_Car {
	private static EntityManagerFactory factory=Persistence.createEntityManagerFactory("kumar");
	private static EntityManager manager=factory.createEntityManager();
	private static EntityTransaction transaction=manager.getTransaction();
	public static void main(String[] args) {
		 
		 
		 Engine en=new Engine();
		 en.setId(105);
		 en.setType("DIESEL");
		 en.setCost(60000);
		 
		 Car c=new Car();
		 c.setEngine(en);
		 c.setId(1105);
		 c.setName("Thar-Black");
		 c.setPrice(2000000);
		 transaction.begin();
		 manager.persist(en);
		 manager.persist(c);
		transaction.commit();
		
		
		 update();
	
		delete();
		
	}
	public static void update() {
		transaction.begin();
		Car car=manager.find(Car.class,1104);
		if(car!=null) {
			car.getEngine().setType("DIESEL");
			manager.merge(car);
			manager.merge(car.getEngine());
			System.out.println("Updation Executed succesfully");
		    transaction.commit();
		}
	}
	public static void delete() {
		Engine e=manager.find(Engine.class, 104);
		Car car=manager.find(Car.class,1104);
		transaction.begin();
		if(car!=null&&car.getEngine()!=null) {
			car.setEngine(null);
			manager.merge(car);
			manager.remove(e);
			System.out.println("Deletion Executed succesfully");
			transaction.commit();
		}

		
	}

}

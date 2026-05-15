package hibernate;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FirstProgram {
	public static void main(String ar[]) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("kumar");
		System.out.println(em+"connected succesfully");
	}

}

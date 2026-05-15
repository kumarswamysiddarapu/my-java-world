package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {
	private static String url = "jdbc:postgres://localhost:5432/school";
	private static String user = "postgres";
	private static String pswd = "123";
	private static  Connection connection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.postgres.Driver");
			
			DriverManager.getConnection(url,user, pswd);
			
			Statement statement = connection.createStatement();
			
			String sql = "Insert into student values(101, 'mike',22)";
			
			statement.execute(sql);
			
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}

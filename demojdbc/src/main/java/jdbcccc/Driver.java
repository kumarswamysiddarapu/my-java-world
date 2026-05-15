package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {
	private static String url = "jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
//	private static String user = "postgres";
//	private static String pswd = "123";
	private static  Connection connection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.postgresql.Driver");
			
			connection = DriverManager.getConnection(url);
			
			Statement statement = connection.createStatement();
			
			String sql = "Insert into student values(106, 'mike',22)";
			System.out.println(true);
			
			statement.execute(sql);
			
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}

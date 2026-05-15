package jdbcccc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class kumardata {
	//String url="";
	static String url="jdbc:postgresql://localhost:5432/school";
    static String username="postgres";
    static String password="123";
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("org.postgresql.Driver");
		Connection connection= DriverManager.getConnection(url,username,password);
		String sql="INSERT into student values(123,'kiran',23)";
		Statement statement = connection.prepareStatement(sql);
		statement.execute(sql);
		connection.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

package start;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnectionPooling {
	private static String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
    private static Connection con=null;
    private static List<Connection> list=new ArrayList<>();
	static {
		try {
			con=DriverManager.getConnection(url);
			for(int i=0;i<5;i++) {
				list.add(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		if(!list.isEmpty()) {
			Connection connection =list.get(0);
			list.remove(0);
			return connection;
		}
		else {
			return createConnection();
		}
	}
	private Connection createConnection() {
		try {
			System.out.println("you are getting from external source");
			Connection connect= DriverManager.getConnection(url);
			return connect;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
public boolean receiveConnection(Connection con)	{
		if(list.size()<5) {
		 list.add(con);	
         return true;
		}
		return false;
	}
}

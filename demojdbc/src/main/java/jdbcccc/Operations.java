package jdbcccc;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operations {
	static Connection con=null;
	static Statement smt=null;
	static PreparedStatement pre=null;
	static ResultSet rs=null;
	static String url="jdbc:postgresql//localhost:5432/school?user=postgres&password=123";
	public static void main(String[] na) throws SQLException,FileNotFoundException {
	 try {
		con=DriverManager.getConnection(url);
		smt=con.createStatement();
		String query="select * from Employee";
		rs=smt.executeQuery(query);
		while(rs.next()) {
			System.out.print(rs.getInt("SLNO")+" ");
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getInt("salary")+" ");
			System.out.print(rs.getString("id")+" ");
		}
		System.out.println("Executed successfully");
		
		
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	 }
	 finally {
		 if(rs!=null) rs.close();
		 if(smt!=null) smt.close();
		 if(con!=null) con.close();
	 }
	}
}

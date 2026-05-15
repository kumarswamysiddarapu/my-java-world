package jdbcccc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class allOperartions {
	public static void main(String ag[]) throws SQLException {
		String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
		Connection con=null;
		Statement smt=null;
		PreparedStatement pre=null;
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url);
			smt=con.createStatement();
			String query1="insert into Employee values (1022,'sameer',400000,'SBA1103')";
			smt.execute(query1);
			System.out.println("first staement is executed");
			pre=con.prepareStatement(
					"insert into employee values(?,?,?,?)");
			pre.setInt(1,1023);
			pre.setString(2,"sadafayun");
			pre.setInt(3,1200000);
			pre.setString(4,"SBA1104");
			System.out.println("another statement executed successfully");
			pre.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(smt!=null) smt.close();
			if(con!=null) con.close();
		}
		}
}


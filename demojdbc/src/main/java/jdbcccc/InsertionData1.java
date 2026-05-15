package jdbcccc;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionData1 {
	private static Connection con=null;
	private static Statement smt=null;
	private static String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
 public static void main(String[] ag) throws FileNotFoundException,SQLException {
	 try {
	 con=DriverManager.getConnection(url);
	 smt=con.createStatement();
	 String query="insert into student values(102,'kumar',19)";
	 smt.execute(query);
	 System.out.println("one row inserted into table ");
	 }catch(Exception e) {
		System.out.println(e.getMessage());
	 }
	 finally {
		 if(smt!=null) smt.close();
		 if(con!=null) con.close();
	 }
	 
 }
 
}

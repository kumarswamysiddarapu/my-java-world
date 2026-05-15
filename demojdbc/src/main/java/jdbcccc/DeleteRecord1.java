package jdbcccc;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord1 {
	static private Connection con=null;
	static private Statement smt=null;
	//static private String url="jdbc:postgresql//localhost:5432/school?user=postgres&password=123";
	static String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
    public static void main(String[] args)throws FileNotFoundException,SQLException {
    	  try {
    	  con=DriverManager.getConnection(url);
    	  smt=con.createStatement();
    	  String query="delete from employee where SLNO>=1021";
    	  smt.execute(query);
    	  System.out.println("query executed succesfully"); 
    	  }catch(Exception e) {
    		 System.out.println("the reason is \n"+e.getMessage()); 
    	  }
    	  finally {
    		  if(smt!=null) smt.close();
    		  if(con!=null) con.close();
    	  }
    }
}

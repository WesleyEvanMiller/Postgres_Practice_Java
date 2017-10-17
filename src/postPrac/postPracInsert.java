package postPrac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class postPracInsert {
	public postPracInsert(){
		//Declare Connection c
		Connection myC = null;
		
		//Declare statement
		Statement myS = null;
		
		//Declare Connection String
		String myConString = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=burton1994"; 
		
		try {
			//Load Driver
			Class.forName("org.postgresql.Driver");
			
			//Create Connection
			myC = DriverManager.getConnection(myConString);
			
			//Create Statement
			myS = myC.createStatement();
			
			String sql = "";
			
			myS.executeUpdate(sql);
			
	        myS.close();
	        myC.close();
	        
	        System.out.println("Complete");
			
		} catch (Exception e){
			e.printStackTrace();
	        System.err.println(e.getClass().getName()+": "+e.getMessage());
	        System.exit(0);
		}		
	}
	public static void main (String[] args) {
		postPracInsert postgres = new postPracInsert();
	}
}

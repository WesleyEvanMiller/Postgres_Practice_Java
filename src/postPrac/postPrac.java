package postPrac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class postPrac {
	public postPrac(){
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
			
			String sql = "INSERT INTO TESTT (ID,FNAME,LNAME) VALUES (1,'Wes','Miller')";
			
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
		postPrac postgres = new postPrac();
	}
}

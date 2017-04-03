package trymethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnecction {

	/**
	 * @param args
	 * @throws SQLException 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	//A simple code to connect to the data base 
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String host = "jdbc:derby://localhost:1527/students";
		String uName = "Your_Username_Here";
		String uPass= " Your_Password_Here ";
		
		// this will create the connection 
		Connection con = DriverManager.getConnection( host, uName, uPass );
		
	
		
		

	}

}

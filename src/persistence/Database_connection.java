package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Database_connection {

	private static String url = "jdbc:mysql://127.0.0.1/computer-database-db?serverTimezone=UTC"; 
	private static String username = "admnincdb";
	private static String password = "qwerty1234";
	
	private static Connection con;
	private static Database_connection instance = null;
	
	
	public static Database_connection getInstance() {
		if (instance == null) {
			instance = new Database_connection();	
		}
		return instance;
			
		}
	
	
	public static void main(String args[]) {
		a();
	}
	static public void a() {
	      try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	          con = DriverManager.getConnection(url, username, password); 
	          
	      } 
	      catch (SQLException e) {
	    	  e.printStackTrace();
	    	  
	      } catch (ClassNotFoundException e) {
			System.out.print("Driver not found");
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			con.close();
		} catch(SQLException e) {
			
		}

	}
	
	
	public static Connection getConnection() {

		return con;
	}

  
}


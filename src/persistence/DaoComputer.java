package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Computer;



public class DaoComputer {

	public static List<Computer> fetchData() throws SQLException{
	
		String SQL_QUERY = "select * from computer";
		List<Computer> computers = null;
	
		try(Connection con = Database_connection.getConnection()){
		
			PreparedStatement pst = con.prepareStatement(SQL_QUERY);
			ResultSet rs = pst.executeQuery();
				
			computers = new ArrayList<>();
			Computer computer;
			
			while (rs.next()) {
				computer = new Computer(rs.getInt("id"),
						rs.getString("name"), 
						rs.getDate("introduced"), 
						rs.getDate("discontinued"), 
						rs.getInt("company_id"));
				computers.add(computer);
			}
			
	} catch(SQLException e) {
		e.printStackTrace();
		}
		
		return computers;	
	}
}
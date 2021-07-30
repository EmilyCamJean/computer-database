package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Company;


public class DaoCompany {
	
public static List<Company> fetchData(){
	
	String SQL_QUERY = "select * from company";
	List<Company> companies = null;
		try (Connection con = Database_connection.getConnection()) {
			
			PreparedStatement pst = con.prepareStatement(SQL_QUERY);
			ResultSet rs = pst.executeQuery();
	
			companies = new ArrayList<>();
			Company company;
			
			while (rs.next()) {
				company = new Company(rs.getInt("id"), rs.getString("name"));
				companies.add(company);	
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
					
		return companies;
	}
}

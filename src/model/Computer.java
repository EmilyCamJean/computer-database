package model;
import java.util.Date;

public class Computer {
	
	private final int id;
	private String name;
	private Date introduced;
	private Date discontinued;
	private final int company_id;
	
	public Computer(int id, String name, Date introduced, Date discontinued, int company_id) {
		this.id = id;
		this.name = name;
		this.introduced = introduced;
		this.discontinued = discontinued;
		this.company_id = company_id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getIntroduced() {
		return introduced;
	}

	public void setIntroduced(Date introduced) {
		this.introduced = introduced;
	}

	public Date getDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(Date discontinued) {
		this.discontinued = discontinued;
	}

	public int getId() {
		return id;
	}

	public int getCompany_id() {
		return company_id;
	}



}

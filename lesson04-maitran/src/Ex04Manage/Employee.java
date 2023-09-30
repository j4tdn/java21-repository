package Ex04Manage;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee extends HumanResources{

	private String faculty;
	private Manager manager;
	
    public Employee() {
	}
    
	public Employee(String name, LocalDate date, BigDecimal coefficientsSalary, String faculty, Manager manager) {
		super(name, date, coefficientsSalary);
		this.faculty = faculty;
		this.manager = manager;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "ROLE: Employee | " + super.toString() + "Faculty: " + faculty + ", Manager: " + manager.getName();
	}

	@Override
    public BigDecimal calSalary() {
    	BigDecimal base = new BigDecimal("1250000");
    	return (getCoefficientsSalary().multiply(base));
    }
}

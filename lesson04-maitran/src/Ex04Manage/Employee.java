package Ex04Manage;

import java.math.BigDecimal;

public class Employee extends HumanResources{

	private String faculty;
	private Manager manager;
	
    public Employee() {
	}

	public Employee(String faculty, Manager manager) {
		super();
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
		return "Employee [faculty=" + faculty + ", manager=" + manager + "]";
	}

    @Override
    public BigDecimal tinhLuong() {
    	BigDecimal base = new BigDecimal("1250000");
    	return (getCoefficientsSalary().multiply(base));
    }
}

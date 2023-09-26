package ex04.hrm;

public class HeadOfDepartment extends Personnel {
	private Integer numEmployees;
	
	public HeadOfDepartment() {
	}
	
	public HeadOfDepartment(String name, String date, double salary, Integer numEmployees) {
		super(name, date, salary);
		this.numEmployees = numEmployees;
	}

	public Integer getNumEmployees() {
		return numEmployees;
	}
	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}
	@Override
	public String toString() {
		return "HeadOfDepartment [numEmployees=" + numEmployees + "]";
	}
	
	
}

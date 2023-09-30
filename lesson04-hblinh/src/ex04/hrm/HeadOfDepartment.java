package ex04.hrm;

public class HeadOfDepartment extends Personnel {
	private Integer numEmployees;
	private int valuePosition = 2;
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
	public int getValuePosition() {
		return valuePosition;
	}
	@Override
	public String toString() {
		return "HeadOfDepartment [numEmployees=" + numEmployees + "]";
	}
	public Double totalSalary(HeadOfDepartment headDm) {
		Double total = headDm.getSalary()*2200000;
		return total;
	}
	
}

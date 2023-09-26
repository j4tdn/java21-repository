package ex04.hrm;

public class Staff extends Personnel {
	private String department;
	public Staff() {
	}
	public Staff(String name, String date, double salary, String department) {
		super(name, date, salary);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Staff [department=" + department + "]";
	}
	
	
}

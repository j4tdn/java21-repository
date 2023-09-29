package ex04.hrm;

public class Staff extends Personnel {
	private String department;
	private int valuePosition = 3;
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
	public int getValuePosition() {
		return valuePosition;
	}
	@Override
	public String toString() {
		return "Staff [department=" + department + "]";
	}
	public Double totalSalary(Staff staf) {
		double total = staf.getSalary()*1250000;
		return total;
	}
	
}

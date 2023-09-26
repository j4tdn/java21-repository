package ex04.hrm;

public class Personnel {
	private String name;
	private String date;
	private double salary;
	
	public Personnel() {
	}
	public Personnel(String name, String date, double salary) {
		super();
		this.name = name;
		this.date = date;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Personnel [name=" + name + ", date=" + date + ", salary=" + salary + "]";
	}
	
	
	
	
	
}

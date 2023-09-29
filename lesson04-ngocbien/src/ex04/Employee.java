package ex04;

import java.time.LocalDate;

public class Employee extends Human {

	private String deparment;
	private String nameDirector;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, LocalDate dateOfBirth, double salary, String deparment, String nameDirector) {
		super(name, dateOfBirth, salary);
		this.deparment = deparment;
		this.nameDirector = nameDirector;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public String getNameDirector() {
		return nameDirector;
	}

	public void setNameDirector(String nameDirector) {
		this.nameDirector = nameDirector;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", deparment = " + deparment + ", nameDirector = " + nameDirector;
	}

	@Override
	double calculateSalary() {
		double result = this.getSalary() * 3000000;
		return result;
	}
	
	
}

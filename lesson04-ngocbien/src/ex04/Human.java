package ex04;

import java.time.LocalDate;

public abstract class Human {

	private String name;
	private LocalDate dateOfBirth;
	private double salary;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, LocalDate dateOfBirth, double salary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + "]";
	}
	
	abstract double calculateSalary();
}

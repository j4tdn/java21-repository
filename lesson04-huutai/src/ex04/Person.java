package ex04;

import java.time.LocalDate;

public class Person {
	private String name;
	
	private LocalDate birthDay;
	
	private double coeSalary;

	public Person() {
	}

	public Person(String name, LocalDate birthDay, Double cfSalary) {
		this.name = name;
		this.birthDay = birthDay;
		this.coeSalary = cfSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public Double getCfSalary() {
		return coeSalary;
	}

	public void setCfSalary(Double cfSalary) {
		this.coeSalary = cfSalary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDay=" + birthDay + ", cfSalary=" + coeSalary + "]";
	}
	
}

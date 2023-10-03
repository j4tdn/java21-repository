package hw.lesson04.ex04;

import java.time.LocalDate;

public abstract class Person {
	
	private String fullname;
	private LocalDate dateOfBirth;
	private int salaryLevel; // hệ số lương
	
	public Person() {
	}

	public Person(String fullname, LocalDate dateOfBirth, int salaryLevel) {
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.salaryLevel = salaryLevel;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}
	
	public abstract int getSalary();

	@Override
	public String toString() {
		return "Person [fullname=" + fullname + ", dateOfBirth=" + dateOfBirth + ", salaryLevel=" + salaryLevel + "]";
	}
}

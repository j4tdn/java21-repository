package homework.bai4;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Person {
	
	private String fullName;
	private LocalDate dob;
	private float coefficientsSalary;
	
	public Person() {
	}

	public Person(String fullName, LocalDate dob, float coefficientsSalary) {
		this.fullName = fullName;
		this.dob = dob;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "Họ tên: " + fullName + ", dob: " + dob + ", Hệ số lương: " + coefficientsSalary;
	}
	
	abstract BigDecimal calSalary();
	
}

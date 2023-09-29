package Ex04;

import java.time.LocalDate;

public abstract class Personel {

	private String fullName;
	private LocalDate dob;
	private double coefficientSalary;
	
	public Personel() {
	}

	public Personel(String fullName, LocalDate dob, double coefficientSalary) {
		this.fullName = fullName;
		this.dob = dob;
		this.coefficientSalary = coefficientSalary;
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

	public double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	@Override
	public String toString() {
		return "fullName=" + fullName + ", dayOfBird=" + dob + ", coefficientSalary=" + coefficientSalary;
	}
	
	public abstract double calcSalary();
	
}

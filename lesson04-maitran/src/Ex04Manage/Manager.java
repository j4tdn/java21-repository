package Ex04Manage;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Manager extends Director {

	private String faculty;

	public Manager() {
	}
	
	public Manager(String name, LocalDate date, BigDecimal coefficientsSalary, BigDecimal positionCoefficient, String faculty) {
		super(name, date, coefficientsSalary , positionCoefficient);
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return super.toString() + ", Faculty: " + faculty;
	}

	@Override
	public BigDecimal calSalary() {
		BigDecimal base = new BigDecimal("2200000");
		return (getCoefficientsSalary().add(getPositionCoefficient())).multiply(base);
	}
}

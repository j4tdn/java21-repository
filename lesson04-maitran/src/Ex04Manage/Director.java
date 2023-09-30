package Ex04Manage;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Director extends HumanResources {

	private BigDecimal positionCoefficient;
	
	public Director() {
	}

	public Director(String name, LocalDate date, BigDecimal coefficientsSalary, BigDecimal positionCoefficient) {
		super(name, date, coefficientsSalary);
		this.positionCoefficient = positionCoefficient;
	}

	public BigDecimal getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(BigDecimal positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "ROLE: " + getClass().getName().substring(11)+ " | " + super.toString() + ", Position Coefficient: " + getPositionCoefficient();
	}

	@Override
	public BigDecimal calSalary() {
		BigDecimal base = new BigDecimal("3000000");
		return (getCoefficientsSalary().add(positionCoefficient)).multiply(base);
	}
	
}

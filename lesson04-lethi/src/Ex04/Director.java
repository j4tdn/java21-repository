package Ex04;

import java.time.LocalDate;

public class Director extends Personel{

	private double positionCoefficient;
	
	public Director() {
	}
	
	public Director(String fullName, LocalDate dob, double coefficientSalary, double positionCoefficient) {
		super(fullName, dob, coefficientSalary);
		this.positionCoefficient = positionCoefficient;
	}

	public double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return super.toString() + ", positionCoefficient=" + positionCoefficient;
	}

	@Override
	public double calcSalary() {
		return (getCoefficientSalary() + getPositionCoefficient()) * 3000000;
	}

	
}

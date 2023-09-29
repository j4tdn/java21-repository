package Ex04;

import java.time.LocalDate;

public class Manager extends Personel{

	private double positionCoefficient;
	private String nameOfDepartment;
	
	public Manager() {
	}

	public Manager(String fullName, LocalDate dob, double coefficientSalary, double positionCoefficient, String nameOfDepartment) {
		super(fullName, dob, coefficientSalary);
		this.positionCoefficient = positionCoefficient;
		this.nameOfDepartment = nameOfDepartment;
	}

	public double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	@Override
	public String toString() {
		return super.toString() + ", positionCoefficient=" + positionCoefficient + ", nameOfDepartment=" + nameOfDepartment;
	}

	@Override
	public double calcSalary() {
		return (getCoefficientSalary() + getPositionCoefficient()) * 2200000;
	}
	
	

}

package ex04;

import java.time.LocalDate;

public class Manager extends Human {

	private double positionMar;
	private String deparment;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, LocalDate dateOfBirth, double salary, double positionMar, String deparment) {
		super(name, dateOfBirth, salary);
		this.positionMar = positionMar;
		this.deparment = deparment;
	}

	public double getPositionMar() {
		return positionMar;
	}

	public void setPositionMar(double positionMar) {
		this.positionMar = positionMar;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	@Override
	public String toString() {
		return super.toString() + ", positionMar = " + positionMar + ", deparment: " + deparment;
	}

	@Override
	double calculateSalary() {
		double result = (this.getSalary() + this.getPositionMar()) * 2200000;
		return result;
	}
	
}

package ex04;

import java.time.LocalDate;

public class Director extends Human {

	private double positionDir;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String name, LocalDate dateOfBirth, double salary, double positionDir) {
		super(name, dateOfBirth, salary);
		this.positionDir = positionDir;
	}

	public double getPositionDir() {
		return positionDir;
	}

	public void setPositionDir(double positionDir) {
		this.positionDir = positionDir;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", positionDir " + positionDir;
	}

	@Override
	double calculateSalary() {
		double result = (this.getSalary() + this.getPositionDir()) * 1250000;
		return result;
	}
	
	
	
	
	
	
	
}

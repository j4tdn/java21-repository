package Ex04;

import java.time.LocalDate;

public class Staff extends Personel {

	private String nameOfDepartment;
	private Manager manager;
	
	public Staff() {
	}

	public Staff(String fullName, LocalDate dob, double coefficientSalary, String nameOfDepartment, Manager manager) {
		super(fullName, dob, coefficientSalary);
		this.nameOfDepartment = nameOfDepartment;
		this.manager = manager;
	}
	
	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", nameOfDepartment=" + nameOfDepartment + ", manager=" + manager;
	}

	@Override
	public double calcSalary() {
		return getCoefficientSalary() * 1250000;
	}

	
	
}

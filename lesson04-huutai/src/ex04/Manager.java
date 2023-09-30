package ex04;

import java.time.LocalDate;

public class Manager extends Person {
	private double positionCoe;
	
	private String departmentName;

	public Manager() {
	}

	public Manager(String name, LocalDate birthDay, double cfSalary, double positionCoe, String departmentName) {
		super(name, birthDay, cfSalary);
		this.positionCoe = positionCoe;
		this.departmentName = departmentName;
	}

	public double getPositionCoe() {
		return positionCoe;
	}

	public void setPositionCoe(double positionCoe) {
		this.positionCoe = positionCoe;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Manager [" + super.toString() + "positionCoe=" + positionCoe + ", departmentName=" + departmentName + "]";
	}
	
}

package ex04;

import java.time.LocalDate;

public class Employee extends Person{
	private String departmentName;
	
	private Manager manager;

	public Employee() {
	}

	public Employee(String name, LocalDate birthDay, Double cfSalary, String departmentName, Manager manager) {
		super(name, birthDay, cfSalary);
		this.departmentName = departmentName;
		this.manager = manager;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employye [" + super.toString() + "departmentName=" + departmentName + ", manager=" + manager + "]";
	}
	
}

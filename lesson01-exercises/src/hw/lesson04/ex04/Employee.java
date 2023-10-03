package hw.lesson04.ex04;

import java.time.LocalDate;

public class Employee extends Person{
	
	private String department; // tên đơn vị, phòng ban
	private Manager manager; // trưởng phòng của nhân viên
	
	public Employee() {
	}

	public Employee(String fullname, LocalDate dateOfBirth, int salaryLevel, String department, Manager manager) {
		super(fullname, dateOfBirth, salaryLevel);
		this.department = department;
		this.manager = manager;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Manager getManager() {
		return manager;
	}
	
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	// Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
	@Override
	public int getSalary() {
		return getSalaryLevel() * 1250000;
	}
	
	@Override
	public String toString() {
		return "Person ["
				+ "fullname=" + getFullname() 
				+ ", dateOfBirth="  + getDateOfBirth() 
				+ ", salaryLevel="  + getSalaryLevel() 
				+ ", department = " + getDepartment() 
				+ ", manager = " + getManager().getFullname() + "]";
	}
}

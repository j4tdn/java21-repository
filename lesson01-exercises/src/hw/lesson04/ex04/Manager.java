package hw.lesson04.ex04;

import java.time.LocalDate;

public class Manager extends Person{
	
	private int titleLevel; // hệ số chức vụ
	private String department; // tên đơn vị, phòng ban
	
	public Manager() {
	}

	public Manager(String fullname, LocalDate dateOfBirth, int salaryLevel, int titleLevel, String department) {
		super(fullname, dateOfBirth, salaryLevel);
		this.titleLevel = titleLevel;
		this.department = department;
	}
	
	public int getTitleLevel() {
		return titleLevel;
	}
	
	public void setTitleLevel(int titleLevel) {
		this.titleLevel = titleLevel;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
	@Override
	public int getSalary() {
		return (getSalaryLevel() + getTitleLevel()) * 2200000;
	}
	
	@Override
	public String toString() {
		return "Person ["
				+ "fullname=" + getFullname() 
				+ ", dateOfBirth="  + getDateOfBirth() 
				+ ", salaryLevel="  + getSalaryLevel() 
				+ ", titleLevel = " + getTitleLevel()
				+ ", department = " + getDepartment() + "]";
	}
}

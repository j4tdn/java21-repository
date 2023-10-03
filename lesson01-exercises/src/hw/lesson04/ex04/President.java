package hw.lesson04.ex04;

import java.time.LocalDate;

public class President extends Person{
	
	private int titleLevel; // hệ số chức vụ
	
	public President() {
	}

	public President(String fullname, LocalDate dateOfBirth, int salaryLevel, int titleLevel) {
		super(fullname, dateOfBirth, salaryLevel);
		this.titleLevel = titleLevel;
	}
	
	public int getTitleLevel() {
		return titleLevel;
	}
	
	public void setTitleLevel(int titleLevel) {
		this.titleLevel = titleLevel;
	}
	
	// Giam đóc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 3000000
	@Override
	public int getSalary() {
		return (getSalaryLevel() + getTitleLevel()) * 3000000;
	}
	
	@Override
	public String toString() {
		return "Person ["
				+ "fullname=" + getFullname() 
				+ ", dateOfBirth="  + getDateOfBirth() 
				+ ", salaryLevel="  + getSalaryLevel() 
				+ ", titleLevel = " + getTitleLevel() +   "]";
	}
}

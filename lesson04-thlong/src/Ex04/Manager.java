package Ex04;

import java.time.LocalDate;

public class Manager extends Director {
	
	private String unitName;
	
	public Manager() {
	}


	public Manager(String name, LocalDate date, float coeSalary, float coePosition, String unitName) {
		super(name, date, coeSalary, coePosition);
		this.unitName = unitName;
	}


	public Manager(String name, LocalDate date, float coeSalary, String unitName) {
		super(name, date, coeSalary);
		this.unitName = unitName;
	}


	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	@Override
	public double salary() {
		return (getCoePosition() + getCoeSalary()) * 2200000;
	}


	@Override
	public String toString() {
		return "Trưởng phòng [Họ và tên=" + getName() + ", Ngày sinh=" + getDate() + ", Hệ số lương=" + getCoeSalary()
				+ ", Hệ số chức vụ=" + getCoePosition() + ", Tên đơn vị=" + unitName + "]";
	}



}

package Ex04;

import java.time.LocalDate;

public class Director extends Person {
	private float coePosition;
	
	public Director() {
	}

	public Director(String name, LocalDate date, float coeSalary, float coePosition) {
		super(name, date, coeSalary);
		this.coePosition = coePosition;
	}



	public Director(String name, LocalDate date, float coeSalary) {
		super(name, date, coeSalary);
	}

	public float getCoePosition() {
		return coePosition;
	}

	public void setCoePosition(float coePosition) {
		this.coePosition = coePosition;
	}
	@Override
	public double salary () {
		return (getCoeSalary() + getCoePosition()) * 3000000;
	}

	@Override
	public String toString() {
		return "Giám đốc [Họ và tên=" + getName() + ", Ngày sinh=" + getDate()
				+ ", Hệ số lương=" + getCoeSalary() + ", Hệ số chức vụ=" + coePosition + "]";
	}
	
}

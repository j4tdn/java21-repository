package Ex04Manage;

import java.math.BigDecimal;

public class Manager extends Director {

	private String faculty;
	

	public Manager() {
	}


	public Manager(String faculty) {
		super();
		this.faculty = faculty;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	@Override
	public String toString() {
		return "Manager [faculty=" + faculty + "]";
	}

	

	@Override
	public BigDecimal tinhLuong() {
		BigDecimal base = new BigDecimal("2200000");
		return (getCoefficientsSalary().add(getPositionCoefficient())).multiply(base);
	}

}

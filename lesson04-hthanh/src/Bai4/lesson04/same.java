package Bai4.lesson04;

import java.math.BigDecimal;

public class same {
	private String name;
	private birdday day;
	private BigDecimal coefficientsSalary;

	public same() {
		// TODO Auto-generated constructor stub
	}

	public same(String name, birdday day, BigDecimal coefficientsSalary) {
		super();
		this.name = name;
		this.day = day;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public birdday getDay() {
		return day;
	}

	public void setDay(birdday day) {
		this.day = day;
	}

	public BigDecimal getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(BigDecimal coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "same [name=" + name + ", day=" + day + ", coefficientsSalary=" + coefficientsSalary + "]";
	}

}

package Ex04Manage;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class HumanResources {

	private String name;
	private LocalDate date;
	private BigDecimal coefficientsSalary;
	
	
	public HumanResources() {
	}

	public HumanResources(String name, LocalDate date, BigDecimal coefficientsSalary) {
		super();
		this.name = name;
		this.date = date;
		this.coefficientsSalary = coefficientsSalary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public BigDecimal getCoefficientsSalary() {
		return coefficientsSalary;
	}


	public void setCoefficientsSalary(BigDecimal coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public BigDecimal calSalary() {
        return BigDecimal.ZERO;
    }

	@Override
	public String toString() {
		return " Name: " + name + ", Date: " + date + ", CoefficientsSalary= " + coefficientsSalary ;
	}
}

package Ex04Manage;

import java.math.BigDecimal;
import java.sql.Date;

public class HumanResources {

	private String name;
	private Date date;
	private BigDecimal coefficientsSalary;
	
	
	public HumanResources() {
	}


	public HumanResources(String name, Date date, BigDecimal coefficientsSalary) {
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


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public BigDecimal getCoefficientsSalary() {
		return coefficientsSalary;
	}


	public void setCoefficientsSalary(BigDecimal coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public BigDecimal tinhLuong() {
        return BigDecimal.ZERO;
    }

	@Override
	public String toString() {
		return "HumanResources [name=" + name + ", date=" + date + ", coefficientsSalary=" + coefficientsSalary + "]";
	}
}

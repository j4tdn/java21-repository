package ex04quanlynhansu;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Director extends Person{

	private BigDecimal factorPosition;
	
	public Director(String name, LocalDate birth, BigDecimal factorSalary, BigDecimal factorPosition) {
		super(name, birth, factorSalary);
		this.factorPosition = factorPosition;
	}

	public BigDecimal getFactorPosition() {
		return factorPosition;
	}
	
	public void setFactorPosition(BigDecimal factorPosition) {
		this.factorPosition = factorPosition;
	}

	public String toString() {
		return super.toString() + ", factorPosition=" + this.factorPosition;
	}

	@Override
	public BigDecimal countSalary() {
		return (this.getFactorSalary().add(this.getFactorPosition())).multiply(BigDecimal.valueOf(3000000));
	}

	
}

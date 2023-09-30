
package ex04quanlynhansu;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Manager extends Person {

	private BigDecimal factorPosition;
	private String unitName;

	public Manager(String name, LocalDate birth, BigDecimal factorSalary, BigDecimal factorPosition, String unitName) {
		super(name, birth, factorSalary);
		this.factorPosition = factorPosition;
		this.unitName = unitName;
	}

	public BigDecimal getFactorPosition() {
		return factorPosition;
	}

	public void setFactorPosition(BigDecimal factorPosition) {
		this.factorPosition = factorPosition;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public String toString() {
		return super.toString() + ", factorPosition=" + this.factorPosition + ", unitName=" + this.unitName;
	}

	@Override
	public BigDecimal countSalary() {
		return (this.getFactorSalary().add(this.getFactorPosition())).multiply(BigDecimal.valueOf(2200000));
	}

}

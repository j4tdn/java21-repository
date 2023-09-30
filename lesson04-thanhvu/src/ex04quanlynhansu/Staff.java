package ex04quanlynhansu;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Staff extends Person {

	private String unitName;
	private Manager manager;

	public Staff(String name, LocalDate birth, BigDecimal factorSalary, String unitName, Manager manager) {
		super(name, birth, factorSalary);
		this.unitName = unitName;
		this.manager = manager;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return super.toString() + ", unitName= " + this.unitName + ", manager= " + this.manager.getName();
	}

	@Override
	public BigDecimal countSalary() {
		return (this.getFactorSalary()).multiply(BigDecimal.valueOf(1250000));
	}

}

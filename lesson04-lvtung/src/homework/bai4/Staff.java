package homework.bai4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Staff extends Person{
	
	private String unitName;
	private Manager manager;
	
	public Staff() {
	}

	public Staff(String fullName, LocalDate dob, float coefficientsSalary, String unitName, Manager manager) {
		super(fullName, dob, coefficientsSalary);
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
		return super.toString() + ", Tên đơn vị: " + unitName + ", Tên TP:" + manager;
	}
	
	@Override
	BigDecimal calSalary() {
		return BigDecimal.valueOf(super.getCoefficientsSalary()).multiply(BigDecimal.valueOf(1250000)).setScale(2, RoundingMode.HALF_UP);
	}
}

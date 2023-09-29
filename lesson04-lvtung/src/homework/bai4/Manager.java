package homework.bai4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Manager extends Person{
	
	private float positionCoefficient;
	private String unitName;
	
	public Manager() {
	}

	public Manager(String fullName, LocalDate dob, float coefficientsSalary, float positionCoefficient, String unitName) {
		super(fullName, dob, coefficientsSalary);
		this.positionCoefficient = positionCoefficient;
		this.unitName = unitName;
	}

	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public String toString() {
		return super.toString() + ", Hệ số chức vụ: " + positionCoefficient + ", Tên đơn vị: " + unitName;
	}

	@Override
	BigDecimal calSalary() {
		return BigDecimal.valueOf(super.getCoefficientsSalary())
				   .add(BigDecimal.valueOf(positionCoefficient))
				   .multiply(BigDecimal.valueOf(2200000)).setScale(2, RoundingMode.HALF_UP);
	}
	
}

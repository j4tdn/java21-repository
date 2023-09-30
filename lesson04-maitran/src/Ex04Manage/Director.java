package Ex04Manage;

import java.math.BigDecimal;

public class Director extends HumanResources {

	private BigDecimal positionCoefficient;
	
	public Director() {
	}

	public Director(BigDecimal positionCoefficient) {
		super();
		this.positionCoefficient = positionCoefficient;
	}

	public BigDecimal getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(BigDecimal positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return "Director [positionCoefficient=" + positionCoefficient + "]";
	}
	
	@Override
	public BigDecimal tinhLuong() {
		BigDecimal base = new BigDecimal("3000000");
		return (getCoefficientsSalary().add(positionCoefficient)).multiply(base);
	}
	
}

package homework.bai4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class President extends Person{
	
	private float positionCoefficient;
	
	public President() {
	}

	public President(String fullName, LocalDate dob, float coefficientsSalary, float positionCoefficient) {
		super(fullName, dob, coefficientsSalary);
		this.positionCoefficient = positionCoefficient;
	}

	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(float positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		return super.toString() + ", Hệ số chức vụ: " + positionCoefficient;
	}

	@Override
	BigDecimal calSalary() {
		return BigDecimal.valueOf(super.getCoefficientsSalary())
			   .add(BigDecimal.valueOf(positionCoefficient))
			   .multiply(BigDecimal.valueOf(3000000)).setScale(2, RoundingMode.HALF_UP);
	}
	
}

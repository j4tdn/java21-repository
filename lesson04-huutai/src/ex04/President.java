package ex04;

import java.time.LocalDate;

public class President extends Person{
	private double positionCoe;

	public President() {
	}

	public President(String name, LocalDate birthDay, Double cfSalary, double positionCoe) {
		super(name, birthDay, cfSalary);
		this.positionCoe = positionCoe;
	}

	public double getPositionCoe() {
		return positionCoe;
	}

	public void setPositionCoe(double positionCoe) {
		this.positionCoe = positionCoe;
	}

	@Override
	public String toString() {
		return "President [" + super.toString() + "positionCoe=" + positionCoe + "]";
	}
	
}

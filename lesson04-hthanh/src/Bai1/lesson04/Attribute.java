package Bai1.lesson04;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Attribute {
	private BigInteger MSSV;
	private String name;
	private BigDecimal pointTheory;
	private BigDecimal pointPractice;

	public Attribute() {
		// TODO Auto-generated constructor stub
	}

	public Attribute(BigInteger mSSV, String name, BigDecimal pointTheory, BigDecimal pointPractice) {
		super();
		MSSV = mSSV;
		this.name = name;
		this.pointTheory = pointTheory;
		this.pointPractice = pointPractice;
	}

	public BigInteger getMSSV() {
		return MSSV;
	}

	public void setMSSV(BigInteger mSSV) {
		MSSV = mSSV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPointTheory() {
		return pointTheory;
	}

	public void setPointTheory(BigDecimal pointTheory) {
		this.pointTheory = pointTheory;
	}

	public BigDecimal getPointPractice() {
		return pointPractice;
	}

	public void setPointPractice(BigDecimal pointPractice) {
		this.pointPractice = pointPractice;
	}

	@Override
	public String toString() {
		return "Attribute [MSSV=" + MSSV + ", name=" + name + ", pointTheory=" + pointTheory + ", pointPractice="
				+ pointPractice + "]";
	}

}

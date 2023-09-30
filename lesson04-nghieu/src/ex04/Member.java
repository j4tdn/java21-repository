package ex04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Member {

	private String name;
	private String dateOfBirth;
	private float heSoLuong;
	
	public Member() {
	}

	public Member(String name, String dateOfBirth, float heSoLuong) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.heSoLuong = heSoLuong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", dateOfBirth=" + dateOfBirth + ", heSoLuong=" + heSoLuong + "]";
	}
	
	
	
}

	

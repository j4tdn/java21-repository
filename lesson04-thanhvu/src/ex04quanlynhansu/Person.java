package ex04quanlynhansu;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Person {

	private String name;
	private LocalDate birth;
	private BigDecimal factorSalary;
	
	public Person(String name, LocalDate birth, BigDecimal factorSalary) {
		this.name = name;
		this.birth = birth;
		this.factorSalary = factorSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public BigDecimal getFactorSalary() {
		return factorSalary;
	}

	public void setFactorSalary(BigDecimal factorSalary) {
		this.factorSalary = factorSalary;
	}

	@Override
	public String toString() {
		return "name=" + name + ", birth=" + birth + ", factorSalary=" + factorSalary;
	}
	
	public abstract BigDecimal countSalary();
	
	
	
}

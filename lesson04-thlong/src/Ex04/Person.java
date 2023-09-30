package Ex04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate date;
	private float coeSalary;
	
	public Person() {
	}

	public Person(String name, LocalDate date, float coeSalary) {
		this.name = name;
		this.date = date;
		this.coeSalary = coeSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public float getCoeSalary() {
		return coeSalary;
	}

	public void setCoeSalary(float coeSalary) {
		this.coeSalary = coeSalary;
	}
	
	public double salary() {
		return 0;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", date=" + date + ", coeSalary=" + coeSalary + "]";
	}
}

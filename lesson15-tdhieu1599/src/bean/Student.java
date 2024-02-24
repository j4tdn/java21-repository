package bean;

import java.util.Objects;

public class Student {
	private String id;
	private String name;
	private double gpa;
	private String gender;

	public Student() {
	}

	public Student(String line) {
		String[] tokens = line.split(", ");
		this.id = tokens[0];
		this.name = tokens[1];
		this.gpa = Double.parseDouble(tokens[2]);
		this.gender = tokens[3];
	}

	public Student(String id, String name, double gpa, String gender) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Student)) {
			return false;
		}

		Student that = (Student) o;
		return getId().equals(that.getId());
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + ", gender=" + gender + "]";
	}

}
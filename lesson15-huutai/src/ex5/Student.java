package ex5;

import java.util.Objects;

public class Student {
	
	private Integer id;
	private String name;
	private Double GPA;
	private String gender;
	
	public Student() {
	}
	
	public Student(Integer id, String name, Double gPA, String gender) {
		this.id = id;
		this.name = name;
		GPA = gPA;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getGPA() {
		return GPA;
	}
	public void setGPA(Double gPA) {
		GPA = gPA;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Student)) {
			return false;
		}
		
		Student that = (Student)o;
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", GPA=" + GPA + ", gender=" + gender + "]";
	}
	
	public static Student transfer(String line) {
		String[] tokens = line.split(", ");
		Student student = new Student();
		if (tokens.length == 4) {
			Integer a1 = Integer.parseInt(tokens[0]);
			String a2 = tokens[1];
			Double a3 = Double.parseDouble(tokens[2]);
			String a4 = tokens[3];
			student = new Student(a1, a2, a3, a4);
		}
		return student;
	}
}

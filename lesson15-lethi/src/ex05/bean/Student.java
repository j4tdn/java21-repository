package ex05.bean;

public class Student {

	private int id;
	private String name;
	private double grade;
	private String gender;
	
	public Student() {
	}

	public Student(int id, String name, double grade, String gender) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "+Student [id=" + id + ", name=" + name + ", grade=" + grade + ", gender=" + gender + "]";
	}
	
	
	
}

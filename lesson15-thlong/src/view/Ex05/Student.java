package view.Ex05;

import java.util.Objects;

public class Student {
	private String id;
	private String name;
	private Double score;
	private String gender;
	
	public Student() {
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

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

	public Student(String id, String name, Double score, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.gender = gender;
	}


	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", gender=" + gender + "]";
	}
	
	
	
	
}

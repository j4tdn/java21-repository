package ex5;

public class Student {

	private int id;
	private String name;
	private Double score;
	private String gender;
	
	public Student() {
	}

	public Student(int id, String name, Double score, String gender) {
		this.id = id;
		this.name = name;
		this.score = score;
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

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", gender=" + gender + "]";
	}
	
	
	
	
}

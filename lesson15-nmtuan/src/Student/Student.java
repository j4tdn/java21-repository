package Student;

public class Student {
	private String id;
	private String name;
	private double score;
	private String sex;

	public Student() {
	}

	public Student(String id, String name, double score, String sex) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.sex = sex;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", score: " + score + ", nam: " + sex;
	}

}
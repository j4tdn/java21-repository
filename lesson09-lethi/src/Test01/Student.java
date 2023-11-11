package Test01;

import Test01.Rank.Ranked;

public class Student {

	private int studentId;
	private String name;
	Rank.Ranked rank;
	
	public Student() {
	}

	public Student(int studentId, String name, Ranked rank) {
		this.studentId = studentId;
		this.name = name;
		this.rank = rank;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rank.Ranked getRank() {
		return rank;
	}

	public void setRank(Rank.Ranked rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", rank=" + rank + "]";
	}

	
	
}

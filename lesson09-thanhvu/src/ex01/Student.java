package ex01;

public class Student {
	private int studentId;
	private String fullName;
	private AcademicRank rank;

	public Student(int studentId, String fullName, AcademicRank rank) {
		this.studentId = studentId;
		this.fullName = fullName;
		this.rank = rank;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public AcademicRank getRank() {
		return rank;
	}

	public void setRank(AcademicRank rank) {
		this.rank = rank;
	}

}

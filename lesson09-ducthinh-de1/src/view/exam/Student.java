package view.exam;

public class Student {
	private int id;
	private String fullname;
	private Grade grade;
	
	public Student() {
		
	}

	public Student(int id, String fullname, Grade grade) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", grade=" + grade + "]";
	}
	
	
}

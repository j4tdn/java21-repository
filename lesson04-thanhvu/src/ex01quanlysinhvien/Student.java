package ex01quanlysinhvien;

public class Student {

	private String id;
	private String name;
	private double theoryMark;
	private double practiceMark;

	public Student() {
		this.id = "May";
		this.name = "May";
		this.theoryMark = 8d;
		this.practiceMark = 7d;
	}

	public Student(String id, String name, double theoryMark, double practiceMark) {
		this.id = id;
		this.name = name;
		this.theoryMark = theoryMark;
		this.practiceMark = practiceMark;
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

	public double getTheoryMark() {
		return theoryMark;
	}

	public void setTheoryMark(double theoryMark) {
		this.theoryMark = theoryMark;
	}

	public double getPracticeMark() {
		return practiceMark;
	}

	public void setPracticeMark(double practiceMark) {
		this.practiceMark = practiceMark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryMark=" + theoryMark + ", practiceMark=" + practiceMark
				+ "]";
	}

}

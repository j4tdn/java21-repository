package Ex01ManageStudent;

public class Student {
	private int id;
	private String name;
	private double theoryMark;
	private double practiceMark;
	
	public Student() {
	}

	public Student(int id, String name, double theoryMark, double practiceMark) {
		super();
		this.id = id;
		this.name = name;
		this.theoryMark = theoryMark;
		this.practiceMark = practiceMark;
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
	
	public double calAverage() {
		return (theoryMark + practiceMark)/2;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", TheoryMark: " + theoryMark + ", PracticeMark: " + practiceMark + ", Average: " + calAverage();
	}
	
}

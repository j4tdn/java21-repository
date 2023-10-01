package ex01;

public class Student {

	private int idStudent;
	private String name;
	private float theoryPoint;
	private float practicePoint;
	
	public Student() {
	}

	public Student(int idStudent, String name, float theoryPoint, float practicePoint) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	@Override
	public String toString() {
		return "id = " + idStudent + ", name = " + name + ", theoryPoint = " + theoryPoint
				+ ", practicePoint = " + practicePoint;
	}

	
	
	
}

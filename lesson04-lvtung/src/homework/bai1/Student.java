package homework.bai1;

public class Student {
	private int id;
	private String fullName;
	private double theoreticalPoint; // điểm lý thuyết
	private double practicePoint; // điểm thực hành
	
	public Student() {
	}

	public Student(int id, String fullName, double theoreticalPoint, double practicePoint) {
		this.id = id;
		this.fullName = fullName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(double theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public double getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(double practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public double calAverage() {
		return (theoreticalPoint + practicePoint) / 2;
	}
	
	@Override
	public String toString() {
		return id + ", " + fullName + ", " + theoreticalPoint + ", " + practicePoint + ", Điểm TB: " + calAverage();
	}
}

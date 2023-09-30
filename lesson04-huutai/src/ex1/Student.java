package ex1;

public class Student {
	
	private int id;
	
	private String name;
	
	private double theoryPoint;
	
	private double pacticePoint;

	public Student() {
	}

	public Student(int id, String name, double theoryPoint, double pacticePoint) {
		super();
		this.id = id;
		this.name = name;
		this.theoryPoint = theoryPoint;
		this.pacticePoint = pacticePoint;
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

	public double getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(double theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public double getPacticePoint() {
		return pacticePoint;
	}

	public void setPacticePoint(double pacticePoint) {
		this.pacticePoint = pacticePoint;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryPoint=" + theoryPoint + ", pacticePoint="
				+ pacticePoint + "]";
	}
	
	public double calAverageP() {
		return (this.pacticePoint + this.theoryPoint) / 2;
	}
}

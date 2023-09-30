package Ex01;

public class Student {
	private int id;
	private String name;
	private float theoPoint;
	private float pracPoint;
	
	public Student() {
	}

	public Student(int id, String name, float theoPoint, float pracPoint) {
		this.id = id;
		this.name = name;
		this.theoPoint = theoPoint;
		this.pracPoint = pracPoint;
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

	public float getTheoPoint() {
		return theoPoint;
	}

	public void setTheoPoint(float theoPoint) {
		this.theoPoint = theoPoint;
	}

	public float getPracPoint() {
		return pracPoint;
	}

	public void setPracPoint(float pracPoint) {
		this.pracPoint = pracPoint;
	}
	
	public float averagePoint() {
		return (theoPoint + pracPoint) / 2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoPoint=" + theoPoint + ", pracPoint=" + pracPoint + "]";
	}
	
	
}

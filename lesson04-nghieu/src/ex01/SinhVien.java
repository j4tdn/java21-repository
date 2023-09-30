package ex01;


public class SinhVien {

	private int id;
	private String name;
	private float theoPoint;
	private float praPoint;
	
	public SinhVien() {
	}

	public SinhVien(int id, String name, float theoPoint, float praPoint) {
		this.id = id;
		this.name = name;
		this.theoPoint = theoPoint;
		this.praPoint = praPoint;
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

	public float getPraPoint() {
		return praPoint;
	}

	public void setPraPoint(float praPoint) {
		this.praPoint = praPoint;
	}

	@Override
	public String toString() {
		return "SinhVien [MSV: " + id + ", Tên: " + name + ", điểm lý thuyết: " + theoPoint + ", điểm thực hành: " + praPoint + "]";
	}
	
	public float avg(float a, float b) {
		return (a+b)/2;
	}
}

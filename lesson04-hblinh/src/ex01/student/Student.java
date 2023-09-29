package ex01.student;

public class Student {
	private Integer id;
	private String name;
	private float pointTheory;
	private float pointPractice;
	
	public Student() {
		this.id = 0;
		this.name = "";
		this.pointTheory = 0;
		this.pointPractice = 0;
		
	}
	
	
	public Student(Integer id, String name, float pointTheory, float pointPractice) {
		
		this.id = id;
		this.name = name;
		this.pointTheory = pointTheory;
		this.pointPractice = pointPractice;
	}
	
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPointTheory() {
		return pointTheory;
	}


	public void setPointTheory(float pointTheory) {
		this.pointTheory = pointTheory;
	}


	public float getPointPractice() {
		return pointPractice;
	}


	public void setPointPractice(float pointPractice) {
		this.pointPractice = pointPractice;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pointTheory=" + pointTheory + ", pointPractice="
				+ pointPractice + "]";
	}	
}

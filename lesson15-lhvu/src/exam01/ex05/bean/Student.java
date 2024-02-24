package exam01.ex05.bean;

import java.util.Objects;

public class Student {
	/*  102130174, Le Na, 7.8, Nu
		102130125, Hoang Nam, 8.2, Nam
		102130176, Van Cuong, 9.8, Nam
		102130177, Van Cong, 6.8, Nam
		102130178, Ngoc Nu, 9.1, Nu
		102130180, Hoang Nhung, 7.8, Nu
	*/
	private Integer id;
	private String name;
	private Double grade;
	private GioiTinh gender;
	
	public Student() {
		
	}
	

	public Student(Integer id, String name, Double grade, GioiTinh gender) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.gender = gender;
		
	}
	public Integer getId() {
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


	public Double getGrade() {
		return grade;
	}


	public void setGrade(Double grade) {
		this.grade = grade;
	}


	public GioiTinh getGender() {
		return gender;
	}


	public void setGender(GioiTinh gender) {
		this.gender = gender;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student that = (Student) obj;
		return getId().equals(that.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", gender=" + gender + "]";
	}
	
}

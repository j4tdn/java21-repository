package bean;

import java.util.Objects;

public class Student {
	private String id;
    private String name;
    private double mediumScore;
    private String gender;
    
    public Student() {
	}

	public Student(String id, String name, double mediumScore, String gender) {
		this.id = id;
		this.name = name;
		this.mediumScore = mediumScore;
		this.gender = gender;
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

	public double getMediumScore() {
		return mediumScore;
	}

	public void setMediumScore(double mediumScore) {
		this.mediumScore = mediumScore;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mediumScore=" + mediumScore + ", gender=" + gender + "]";
	}
    
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Student)) {
			return false;
		}
		
		Student that = (Student)o;
		
		return getId().equals(that.getId()); 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
}

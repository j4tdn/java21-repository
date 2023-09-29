package lesson01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private String id;
	private String name;
	private double theoryScore;
	private double practiceScore;
	
	public Student() {
		
	}

	public Student(String id, String name, double theoryScore, double practiceScore) {		
		this.id = id;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
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

	public double getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(double theoryScore) {
		this.theoryScore = theoryScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryScore=" + theoryScore + ", practiceScore="
				+ practiceScore + "]";
	}
	public double calAverage(double a, double b) {
		return (a+b)/2;
	}
	
}

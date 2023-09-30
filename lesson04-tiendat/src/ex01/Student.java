package ex01;

public class Student {

	private int ID;
	private String name;
	private double TheoryGPA;
	private double PracticeGPA;

	// default constructrer
	public Student() {
	}

	// constructor with full parameters
	public Student(int iD, String name, double theoryGPA, double practiceGPA) {
		ID = iD;
		this.name = name;
		TheoryGPA = theoryGPA;
		PracticeGPA = practiceGPA;
	}

	// getter, setter
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTheoryGPA() {
		return TheoryGPA;
	}

	public void setTheoryGPA(double theoryGPA) {
		TheoryGPA = theoryGPA;
	}

	public double getPracticeGPA() {
		return PracticeGPA;
	}

	public void setPracticeGPA(double practiceGPA) {
		PracticeGPA = practiceGPA;
	}

	// calculate the average GPA
	public double calculateAverageGPA() {
		return (TheoryGPA + PracticeGPA) / 2;
	}

	// toString
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", TheoryGPA=" + TheoryGPA + ", PracticeGPA=" + PracticeGPA
				+ "]";
	}

}

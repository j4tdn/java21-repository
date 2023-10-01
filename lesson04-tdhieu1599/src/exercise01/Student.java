package exercise01;

public class Student {
	// Attributes
	private int id;
	private String name;
	private float theoryMark;
	private float practiceMark;
	
	
	// Constructors
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float theoryMark, float practiceMark) {
		this.id = id;
		this.name = name;
		this.theoryMark = theoryMark;
		this.practiceMark = practiceMark;
	}
	
	// Methods
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

	public float getTheoryMark() {
		return theoryMark;
	}

	public void setTheoryMark(float theoryMark) {
		this.theoryMark = theoryMark;
	}

	public float getPracticeMark() {
		return practiceMark;
	}

	public void setPracticeMark(float practiceMark) {
		this.practiceMark = practiceMark;
	}
	
	public float calAverageMark(float theoryMark, float practiceMark) {
		return (this.theoryMark + this.practiceMark)/2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryMark=" + theoryMark + ", practiceMark=" + practiceMark
				+ "]";
	}
	
	
	}
	
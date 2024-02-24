package bean;

public class Student {
	private String id;
	private String name;
	private double mark;
	private String sex;

	public Student() {
	}

	public Student(String id, String name, double mark, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.sex = sex;
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

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	   @Override
	    public String toString() {
	        return String.format("ID: %s, Name: %s, GPA: %.2f, SEX: %s\n", id, name, mark, sex);
	    }

}

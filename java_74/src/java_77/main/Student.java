package java_77.main;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {
	private String id;
	private String name;
	private String subject;
	private double mark;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, String subject, double mark) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.mark = mark;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return 0;
	}
	
	
}

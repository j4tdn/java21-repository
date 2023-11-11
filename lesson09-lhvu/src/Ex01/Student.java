package Ex01;

public class Student {
	private int id;
	private String name;
	private Rate rate;
	/**
	 * @param id
	 * @param name
	 * @param rate
	 */
	public Student(int id, String name, Rate rate) {
		super();
		this.id = id;
		this.name = name;
		this.rate = rate;
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
	public Rate getRate() {
		return rate;
	}
	public void setRate(Rate rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rate=" + rate + "]";
	}
	
}

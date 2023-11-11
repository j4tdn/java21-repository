package view.test01.ex1;

public class Student {
	private int id;
	private String name;
	private LevelStatus level;

	public Student() {
	}

	public Student(int id, String name, LevelStatus level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
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

	public LevelStatus getLevel() {
		return level;
	}

	public void setLevel(LevelStatus level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "ID: " + id + "\t\tName: " + name + "\tLevel: " + level;
	}

}

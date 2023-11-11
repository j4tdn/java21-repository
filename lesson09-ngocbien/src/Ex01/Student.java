package Ex01;

public class Student {

	private int idStudent;
	private String name;
	private Rank rank;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int idStudent, String name, Rank rank) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.rank = rank;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", name=" + name + ", rank=" + rank + "]";
	}
	
	
	
	
	
	
	
	
}

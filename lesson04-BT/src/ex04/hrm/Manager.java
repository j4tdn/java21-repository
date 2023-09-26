package ex04.hrm;

public class Manager extends Personnel {
	private double position;
	
	public Manager() {
	}

	public Manager(String name, String date, double salary, double position) {
		super(name, date, salary);
		this.position = position;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Manager [position=" + position + "]";
	}
	
	
	
}

package ex04.hrm;

public class Manager extends Personnel {
	private double position;
	private int valuePosition = 1;
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
	public int getValuePosition() {
		return valuePosition;
	}

	@Override
	public String toString() {
		return "Manager [position=" + position + "]";
	}
	
	public double totalSalaryManager(Manager mng) {
		Double total = (mng.getSalary()+mng.getPosition())*3000000;
		return total;
	}
	
	
}

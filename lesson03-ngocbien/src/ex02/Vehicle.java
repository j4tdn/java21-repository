package ex02;

public class Vehicle {
	private String name;
	private String typevehicle;
	private int capacity;
	private double cost;
	
	public Vehicle() {

	}

	public Vehicle(String name, String vehicle, int capacity, double cost) {
		super();
		this.name = name;
		this.typevehicle = vehicle;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehicle() {
		return typevehicle;
	}

	public void setVehicle(String vehicle) {
		this.typevehicle = vehicle;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", vehicle=" + typevehicle + ", capacity=" + capacity + ", cost=" + cost + "]";
	}
	
	
}

package bean;

public class Vehicle {
	private String fullName;
	private String name;
	private int capacity;
	private double price;
	
	public Vehicle() {
	}
	
	public Vehicle(String fullName, String name, int capacity, double price) {
		this.fullName = fullName;
		this.name = name;
		this.capacity = capacity;
		this.price = price;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle [fullName=" + fullName + ", name=" + name + ", capacity=" + capacity + ", price=" + price + "]";
	}

	public double tax() {
		double tax = 0;
		if(capacity < 100) {
			tax = price * 1 / 100;
		}if(200 > capacity && capacity > 100) {
			tax = price * 3 / 100;
		}else {
			tax = price * 5 / 100;
		}
		return tax;
	}
}

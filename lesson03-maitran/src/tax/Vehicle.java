package tax;

public class Vehicle {
	private Owner owner;
	private String type;
	private double price;
	private double capacity;
	
	
	public Vehicle() {
	}


	public Vehicle(Owner owner, String type, double price, double capacity) {
		super();
		this.owner = owner;
		this.type = type;
		this.price = price;
		this.capacity = capacity;
	}


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getCapacity() {
		return capacity;
	}


	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "Vehicle [owner=" + owner + ", type=" + type + ", price=" + price + ", capacity=" + capacity + "]";
	}

}

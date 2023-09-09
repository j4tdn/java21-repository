package bean;

public class Car {
	//attributes
	public String id;
	public String model;
	public String color;
	public double salesPrice;
	
	// default constructor
	public Car() {
		
	}

	// constructor with full parameters
	public Car(String id, String model, String color, double salesPrice) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice + "]";
	}
	
	
	
	
}

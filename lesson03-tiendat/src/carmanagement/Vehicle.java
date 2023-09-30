package carmanagement;

public class Vehicle {

	private String ownerName;
	private String type;
	private int capacity;
	private double price; // Thuộc tính này e muốn dùng kiểu BigDecimal lắm mà chưa nắm rõ code về kiểu dữ
							// liệu này á anh :((
	private double tax;

	// default constructer
	public Vehicle() {
	}

	// constructor with full parameters
	public Vehicle(String ownerName, String type, int capacity, double price, double tax) {
		this.ownerName = ownerName;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
		calculateTax();
	}

	// Caculating the tax
	public void calculateTax() {
		if (capacity < 100) {
			tax = price * 0.01;
		} else if (capacity >= 100 && capacity <= 200) {
			tax = price * 0.03;
		} else {
			tax = price * 0.05;
		}
	}

	// Display method
	public void printInfo() {
		System.out.println(ownerName + " - " + type + " - " + capacity + "cc - " + price + " - " + tax);
	}

}

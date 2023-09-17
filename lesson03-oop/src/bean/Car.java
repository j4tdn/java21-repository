package bean;

// pojo; plain old java object
// Car, Item, Store, Employee: Khai báo kdl của bài toán

// Spring FW: Lưu trữ những đối tượng của class vào vùng nhớ của nó
//          : Đối tượng

public class Car {

	// System = Objects
	// Object = Attributes + Methods;
	// Class

	// attributes
	// sẽ được cấp phát, gán giá trị khi tạo ra đối tượng mới
	// mỗi đối tượng sẽ lưu trữ thông tin riêng của các thuộc tính

	// oop: mỗi đối tượng sẽ quản lý thông tin thuộc tính của riêng nó
	// access modifier: private
	
	// thuộc tính
	//static: thuộc phạm vi của class
//			: các đối tượng của class sẽ mang cùng giá trị của static
//			: gọi class
//			: gọi object cũng được nhưng kh khuyến khích
	
	// non-static: thuộc phạm vi của object
//				 : mỗi đối tượng sẽ lưu trữ thông tin riêng
	
	private String id;
	public static String model;
	private String color;
	private double salesPrice;

	// default constructor
	public Car() {
	}

	// constructor with full parametters
	public Car(String id, String color, double salesPrice) {
		this.id = id;
		this.color = color;
		this.salesPrice = salesPrice;
	}

	// getter, setter
	// để các class bên ngoài có thể truy cập, thay đổi giá trị của các thuộc tính
	// private bên trong
	
	// Car c1 = new Car("C1", "Honda", "Yellow", 550);
	// c1.id		--> c1.getId()
	// c1.id = "Cz" --> c1.setId("Cz")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	// toString
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice + "]";
	}
}

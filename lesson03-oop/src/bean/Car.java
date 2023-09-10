package bean;

// pojo: plain old java object
// car, item, store, emloyee: khai báo kiểu dữ liệu của bài toán

// Spring FW: lưu trữ những đối tượng của class vào vùng nhớ của nó
//			: Đối tượng -> bean

// DTO

// Enity

public class Car {
	
	// system = objects
	// object = attributes + methods
	// class
	
	// attributes
	// sẽ được cấp phát, gán giá trị khi tạo ra 1 đối tượng mới
	// mỗi đối tượng được lưu trữ thông tin riêng của các thuộc tính
	
	// mỗi đối tượng sẽ quản lí thông tin thuộc tính riêng nó
	// access modifier: private
	private String id;
	private String model;
	private String color;
	private double salesPrice;
	
	// default constructor
	public Car() {
		
	}
	// constructor with full parameters
	public Car(String id, String model, String color, double salesPrice) {
	super();
	this.id = id;
	this.model = model;
	this.color = color;
	this.salesPrice = salesPrice;
}
	// 
	
	// getter, setter
	// để các class bên ngoài có thể truy cập, thay đổi giá trị của các thuộc tính private bên trong thuộc tính
	private String getId() {
		return this.id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	}
	// toString


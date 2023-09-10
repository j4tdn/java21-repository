package bean;

// pojo: plain old java object
// Car, Item, Store, Employee: Khai báo kiểu dữ liệu của bài toán

// Spring FW:

public class Car {
	
	// System = Objects
	// Object = Attributes + Methods
	// Class
	

	// attributes
	// sẽ được cấp phát, gán giá trị khi tạo ra đối tượng mới
	// mỗi đối tượng sẽ lưu trữ thông tin riêng của các thuộc tính
	
	// oop: mỗi đối tượng sẽ quản lí thông tin thuộc tính của riêng nó
	// access modifier: private
	
	// thuộc tính
	// static: thuộc phạm vi của class
	// 		 : các đối tượng của class sẽ mang cùng giá trị static
	//		 : gọi Class.
	//       :    object. (ko nên dùng)
	
	// non-static: thuộc phạm vi của object
	//			 : mỗi đối tượng sẽ lưu trữ thông tin thuộc tính riêng
	
	private String id;
	private String model;
	private String color;
	private double salesPrice;
	
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
	
	// getter, setter
	// để các class bên ngoài có thể truy cập, thay đổi giá trị của các thuộc tính private bên 
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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

	// toString
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice + "]";
	}
	
	
	
	

}

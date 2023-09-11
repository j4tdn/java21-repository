package bean;

public class Car {
	
	// System = Objects
	// Object = Attribute + Method
	// Class
	
	// attributes
	// sẽ đc cấp phát, gán giá trị khi tạo ra đối tượng mới
	// mỗi đối tượng sẽ lưu trữ thông tin riêng của các thuộc tính
	
	// oop: mỗi đối tượng sẽ quản lý thông tin thuộc tính của riêng nó
	// access modifier: private
	
	// thuộc tính
	// static: thuộc pham vi của class
	//		 : các đối tượng của class sẽ mang cung giá trị static
	//		 : gói Class.
	//			   Object. (k khuyến khích)
	
	// non-static: thuộc phạm vi của object
	//				 mỗi ddoooois tượng sẽ lưu trũ thông tin thuộc tính riêng
	private String id;
	public static String model;
	private String color;
	private double salesPrice;

	// default
	public Car() {
	}
	
	// constructor with full parameters
	public Car(String id, String color, double salesPrice) {
		this.id = id;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	
	// getter, setter
	// để các class bên ngoài có thể truy cập, thay đổi giá trị của các thuộc tính private bên trong
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice="
				+ salesPrice + "]";
	}

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
	
	
}

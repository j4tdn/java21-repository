package bean;

// pojo: plain old java object 
// Car, Item, Store, Employee: khai báo KDL của bài toán 

//Spring FW: lưu trữ những đối tượng của class vào vùng nhớ của nó 
//		   : đối tưọng --> bean
public class Car {

	// System = Objects
	// Object = Attribute + Methods
	
	// attributes
	// sẽ được cấp phát, gán giá trị khi tạo ra đối tượng mới
	// mỗi đối tượng sẽ lưu trữ thông tin riêng của các thuộc tính
	
	// oop: mỗi đối tượng sẽ quản lý thông tin thuộc tính của riêng nó
	// access modifier : private
	
	
	//thuộc tính 
	//static: thuộc phạm vi của class
	//		: các đối tượng của class sẽ mang cùng giá trị static
	//		: gọi class.
	//		: 	  object. (ko khuyến khích)
	
	//non-static: thuộc phạm vi của object
	//			: mỗi đối tượng sẽ lưu trữ thông tin thuộc tính riêng
	private static String model;
	
	private String id;
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
	
	//
	
	//getter, setter
	//để các class bên ngoài có thể truy cập, thay đổi giá trị của các thuộc tính private bên trong 
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

	
	//toString
	//id = this.id
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice + "]";
	}

	
	
	
	
	
	
}

package bean;

// pojo : plan old java object
// Car, Item, Store: khai báo KDL của bài toán

// Spring FW: lưu trữ những đối tượng của class vào vùng nhớ của nó
            // Đối tượng: bean

public class Car {
	
	// System = Objects ( system hiểu như 1 bài toán có nhiều đối tượng)
	// Object = Attributes + Methods;
	// Class
	
	// attributes 
	// sẽ được cấp phát, gán giá trị khi tạo ra đối tượng
	// mỗi đối tượng sẽ lưu trữ thông tin riêng của các thuộc tính  
	
	// oop: mỗi đối tượng sẽ quản lí thông tin thuộc tính của riêng nó
	// vì sao dùng private rồi getter setter:làm vậy sẽ dài? tại sao kh dùng public? 
	// access modifier: private 
	
	//thuộc tính
	// static: thuộc phạm vi của class
	//       : các đối tượng của class sẽ mang cùng giá trị static
	//       : gọi Class. 
	//       :     Object. (không khuyến khích)
	
	// non-static: thuộc phạm vi của object
	//           : mỗi đối tượng sẽ lưu trữ thông tin thuộc tính riêng
	
	
	public static String model;
	
	private String id;
	private String color;
	private double salesPrice; 
	
	// default constructor
	public Car() {		
	}
	
	// constructor with full parameters
	public Car(String id, String color, double salesPrice) {
		super();
		this.id = id;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	
	
	// getter, setter 
	// để các class bên ngoài có thể truy cập, thay đổi giá trị của các thuộc tính private bên trong 
	
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
	

	

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice + "]";
	}

	
	
	
	
}

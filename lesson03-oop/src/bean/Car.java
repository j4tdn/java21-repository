package bean;

//pojo: plain old java object ( class dùng để khai báo)
// Car, Item, Store, Employee.. :Dùng để khai báo KDL của bài toán

//Spring FW: Lưu trữ những đối tượng của class vào vùng nhớ của nó
			// Đối tượng --> bean
// DTO

//Entity
public class Car {
	
	//attributes
	// sẽ được cấp phát, gán giá trị khi khởi tạo ra đối tượng mới
	//System = Object
	//Object = Attributes +  Methods
	// mỗi đối tượng sẽ lưu trữ thông tin riêng của các thuộc tính
	
	//oop: mỗi đối tượng sẽ quản lý thông tin thuộc tính của riêng nó
	//access modifier : private nhưng dữ liệu cũng phải tương tác với các class khác, trao đổi với nhau
	//
	private String id;
	public static String model;
	private String color;
	private double salesPrice;
	
	// Nên tạo hàm khởi tạo rỗng: default constructor - bấm crtrl + space
	public Car() {
	}
	
	// constructor with full parameters : tạo hàm khởi tạo với full tham số
	public Car(String id, String color, double salesPrice) {
		this.id = id;
		this.color = color;
		this.salesPrice = salesPrice;
		
		//getter, setter
		//phương thức này sinh ra để các class bên ngoài có thể truy cập, thay đổi giá trị của các thuộc tính private bên rong class
		
	}
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

	//toString
	//id = this.id
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	


	
}

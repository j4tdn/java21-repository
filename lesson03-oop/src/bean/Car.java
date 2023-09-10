package bean;

public class Car {
	// System = Object
	// Object  = Attributes + Methods
	// Class
	
	// Attributes
	// Sẽ được cập phát, gán giá trị khi tạo ra đối tượng mới
	// mỗi đối tượng sẽ lưu trữ thông tin riêng của các thuộc tính
	
	// OOP: mỗi đối tượng sẽ quản lý thông tin thuộc tính của riêng nó
	// access modifier: private
	private String id;
	private String model;
	private String color;
	private Double salesPrice;
	
	public Car() {
	}

	public Car(String id, String model, String color, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.color = color;
		this.salesPrice = salesPrice;
	}
	
	// public getter, setter
	// Để các class bên ngoài có thể truy cập, thay đổi giá trị của các thuộc tính private bên ngoài
	
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

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", salesPrice=" + salesPrice + "]";
	}

}

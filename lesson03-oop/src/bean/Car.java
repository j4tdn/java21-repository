package bean;

public class Car {
	// static thuộc phạm vi củae class
	//      : các đối tượng cúa class sẽ mang cùng giá trị static
	
	// non-static:  thuộc phạm vị của object
	//           :  mỗi đối tượng sẽ lưu trữ thông tin thuộc tính riêng
	private String id;
	private String model;
	private String color;
	private double salesPrice;

	public Car() {
	}

	public Car(String id, String model, String color, double salesPrice) {
		// super();
		this.color = color;
		this.id = id;
		this.model = model;
		this.salesPrice = salesPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

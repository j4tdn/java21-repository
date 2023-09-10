package bean;


// pojo: plain old java object
// Car, Item, Store, Employee: Khai báo KDL của bài toán

// Spring FW: Lưu trữ những đối tượng của class vào vùng nhớ của nó 
//			: Đối tượng --> bean

// DTO

// Entity
public class Car {

		// System = Object
		// Object = Atributess + Methods
		//class
		
		// atributes
		// sẽ được cấp phát, gán giá trị khi tạo ra đối tượng mới
		// mỗi đối tượng sẽ lưu trữ thông tin riêng của các thuộc tính
	
		// oop: mỗi đối tượng sẽ quản lý thông tin thuộc tính của riêng nó
		// access modifier: private
	
		// thuộc tính
		// static: thuộc phạm vi của class
		//			các đối tượng của class sẽ mang cùng giá trị static
		//			: gọi Class.
		//			:
	
	
	
		// non-static: thuộc phạm vi của object
					: 
		private String id;
		private String model;
		private String coler;
		private double salesPrice;
		
		//default constructor
		public Car() {
			
		}

		public Car(String id, String model, String coler, double salesPrice) {
			super();
			this.id = id;
			this.model = model;
			this.coler = coler;
			this.salesPrice = salesPrice;
		}
		
		// getter, setter
		// để các class bên ngoài có thể truy cập, thay đổi các giá trị của thuộc tính privatr bên ngoài
		private String getId() {
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

		public String getColer() {
			return coler;
		}

		public void setColer(String coler) {
			this.coler = coler;
		}

		public double getSalesPrice() {
			return salesPrice;
		}

		public void setSalesPrice(double salesPrice) {
			this.salesPrice = salesPrice;
		}


		//toString
		@Override
		public String toString() {
			return "Car [id=" + id + ", model=" + model + ", coler=" + coler + ", salesPrice=" + salesPrice + "]";
		}
		
}


package bean;

public  class Car {
	
	public String id;
	public String coler;
	public String model;
	public double price;
	// sẽ được cấp phát, gán giá trị khi tạo ra đối tượng mới
	// mỗi đối tượng sẽ lưu trữ thông tin riêng của các thuộc tính

// default contructor
	public Car() {

	}
//contructor with full parameters

	public Car(String id, String coler, String model, double price) {
		this.id = id;
		this.coler = coler;
		this.model = model;
		this.price = price;
	}

	// getter, setter:
	// để các class bên ngoài có thể truy cập, thay đổi giá trị của các private bên ngoài
	//getter : lấy giá trị
	//setter : gán giá trị
	
	//Sử dụng contructor, setter,getter khi nào ?
	// ---> Contructor: Khi tạo ra một đối tượng
	// ---> setter    : khi muốn cập nhập, thay đổi giá trị trên vùng nhớ HEAP
	// ---> getter    : khi muốn lấy giá trị từng thuộc tính
	
	// public  ---> được phép truy từ bất kì class nào---> không thể quản lí được dữ liệu riêng của từng đối tượng hay class
	// private ---> chỉ được phép truy cập ở class hiện tại
	//              bên ngoài chỉ có thể truy cập thông qua getter, setter
	//              bên ngoài không thể thay đổi cấu trúc dữ liệu của thuộc tính
	//              bên ngoài nên truy cập tăng/giảm giá trị của thuộc tính chứ không nên biết chính xác giá trị hay nguồn gốc của thuộc tính
	/*          ---> VD: Class Company{
	 *                   private double balance;  quỹ lương
	 *                   public void payment(Employee employeeId, double salary){
	 *                   balance = balace - salary;
	 *                   employee.plusIncome(salary);
	 *                   
	 *                   }
	 *                   class Employee{
	 *                   private double income;  lương nhân viên
	 *                   public void plusIncome(double salary){
	 *                   this.income = this.income + salary;
	 *                   }
	 *                   }
	 *                   static: thuộc phạm vi class
	 *                         : các đối tượng class sẽ mang cùng giá trị static
	 *                         : gọi static --> Class.
	 *                   non-static: thuộc phạm vi object
	 *                             : mỗi đối tượng sẽ lưu trữ thông tin thuộc tính riêng
	*/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColer() {
		return coler;
	}

	public void setColer(String coler) {
		this.coler = coler;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
//toString

	@Override
	public String toString() {
		return "Car [id=" + id + ", coler=" + coler + ", model=" + model + ", price=" + price + "]";
	}

}

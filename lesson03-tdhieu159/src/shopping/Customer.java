package shopping;

public class Customer {
	private String name;
	private String phone;
	private String id;
	private String address;
	
	// tạo hàm khởi tạo rỗng
	public Customer() {
	}

	// khởi tạo full tham số
	public Customer(String name, String phone, String id, String address) {
		this.name = name;
		this.phone = phone;
		this.id = id;
		this.address = address;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// toString
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", id=" + id + ", address=" + address + "]";
	}
	
	
	
}

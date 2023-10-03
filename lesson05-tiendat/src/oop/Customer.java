package oop;

public class Customer {
	// Mã khách hàng, họ tên, số điện thoại, địa chỉ
	private String idCustomer;
	private String name;
	private String phoneNumber;
	private String addres;

	public Customer() {
	}

	public Customer(String idCustomer, String name, String phoneNumber, String addres) {
		this.idCustomer = idCustomer;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.addres = addres;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + ", name=" + name + ", phoneNumber=" + phoneNumber + ", addres="
				+ addres + "]";
	}

}

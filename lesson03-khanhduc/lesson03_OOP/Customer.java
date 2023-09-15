package lesson03_OOP;

public class Customer {
	private String ID;
	private String Name;
	private String Phone;
	private String diaChi;

	public Customer() {

	}

	public Customer(String iD, String name, String phone, String diaChi) {
		super();
		ID = iD;
		Name = name;
		Phone = phone;
		this.diaChi = diaChi;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", Name=" + Name + ", Phone=" + Phone + ", diaChi=" + diaChi + "]";
	}

}

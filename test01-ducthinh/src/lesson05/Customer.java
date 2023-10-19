package lesson05;

public class Customer {
	private String id;
	private String fullname;
	private String phoneNumber;
	private String address;
	
	public Customer() {
		
	}

	public Customer(String id, String fullname, String phoneNumber, String address) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

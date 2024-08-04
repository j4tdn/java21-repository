package persistence;

import java.util.Objects;

public class Customer {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_EMAIL = "email";
	public static final String PROP_ADDRESS = "address";
	public static final String PROP_PHONE = "phone";

	private Integer id;
	private String name;
	private String email;
	private String address;
	private String phone;
	private String username;
	private String password;
	
	public Customer() {
	}

	public Customer(Integer id, String name, String email, String address, String phone, String username,
			String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}
	
	public static Customer of() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Customer)) {
			return false;
		}

		Customer that = (Customer) o;
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phone="
				+ phone + "]";
	}
		
	
}
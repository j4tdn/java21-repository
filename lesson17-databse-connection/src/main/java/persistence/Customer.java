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
		return new Customer();
	}

	public Integer getId() {
		return id;
	}

	public Customer withId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Customer withName(String name) {
		this.name = name;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Customer withEmail(String email) {
		this.email = email;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Customer withAddress(String address) {
		this.address = address;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public Customer withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public Customer withUsername(String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public Customer withPassword(String password) {
		this.password = password;
		return this;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Customer)) {
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

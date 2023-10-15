package lesson00;

public class User1 {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private String address;
	
	private User1() {
	}
	
	private User1(Builder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.email = builder.email;
		this.address = builder.address;
	}
	
	public static Builder builder() {
		return new Builder();
	}

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email="
				+ email + ", address=" + address + "]";
	}
	
	public static class Builder {
		private Integer id;
		private String firstName;
		private String lastName;
		private Integer age;
		private String email;
		private String address;
		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}
		public Builder withEmail(String email) {
			this.email = email;
			return this;
		}
		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}
		
		public User1 build() {
			return new User1(this);
		}
	}
}

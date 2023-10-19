package pattern.builder;

public class User {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private String address;
	
	private User() {
		
	}
	
	private User(Builder builder) {
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
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email="
				+ email + ", address=" + address + "]";
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



	public static class Builder{
		private Integer id;
		private String firstName;
		private String lastName;
		private Integer age;
		private String email;
		private String address;
		
		
				

		private Builder() {
			
		}

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
		public User build() {
			return new User(this);
		}
		
	}
}

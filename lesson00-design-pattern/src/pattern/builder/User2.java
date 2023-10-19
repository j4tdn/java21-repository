package pattern.builder;

public class User2 {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String address;

	private User2() {

	}
	
	private User2(Builder builder) {
		this.id = builder.withId(id);
		this.firstName = builder.withFirstName(firstName);
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

	public String getAddress() {
		return address;
	}

	public static class Builder {
		private Integer id;
		private String firstName;
		private String lastName;
		private Integer age;
		private String address;

		public Builder() {

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

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}

		public User2 build() {
			return new User2(this);
		}

	}
}

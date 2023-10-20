package pattern.builder;

// Owner Class
// Class --> Immutable class
public class User1 {

	private String id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private String address;

	// Required: id, firstName, lastName
	// Required: id, email
	// Required: id, email, address --> X

	// Tạo đối tượng và khởi tạo --> do builder xử lý
	// User1 chỉ nhận thông tin từ cái Builder
	private User1() {

	}
	
	// Nhận giá trị từ Builder	
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
	
	// Chỉ chứa hàm getter
	public String getId() {
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
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email="
				+ email + ", address=" + address + "]";
	}

	// Nested class(class nằm bên trong class khác)
	// Class có nhiệm vụ là khởi tạo đối tượng chứa các thông tin của User1
	// --> Truyền các giá trị này qua cho User1
	public static class Builder {
		// B1: Copy tất cả thuộc tính từ User1
		private String id;
		private String firstName;
		private String lastName;
		private Integer age;
		private String email;
		private String address;

		// B2: Cho class này có private constructor, để dùng cho chính nó hoặc User1
		// Lý do:
		private Builder() {

		}

		// B3: Tạo các hàm setter(return Builder) cho class Builder
		public Builder withId(String id) {
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

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		// B4: Sau khi khởi tạo đối tượng Builder và set cho các giá trị xong
		// --> truyền giá trị này cho các thuộc tính tương ứng bên User1
		public User1 build() {
			return new User1(this);
		}
	}

}

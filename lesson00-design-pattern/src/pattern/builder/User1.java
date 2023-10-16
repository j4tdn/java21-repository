package pattern.builder;

//owner Class
// Class --> imumtable class
public class User1 {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private String address;
	//Required: id, first name, last Name
 	//Required: id, email
	//Required: id, email, address  ---> lỗi
	// Tạo đối tượng và khởi tạo --> do Builder xử lý
	// User1 chỉ nhận thông tin từ Builder
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
	
	// Chỉ chứa hàm getter
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
	
	//Nested Class nằm trong class chính
	// Class có nhiệm vụ là khởi tạo đối tượng chứa thống tin của user1
	public static class Builder {
		//B1: Coppy tất cả các thuộc tính từ use1
		private Integer id;
		private String firstName;
		private String lastName;
		private Integer age;
		private String email;
		private String address;
		
		//B2: Cho class này có private constructor, để dùng cho chính nó hoặc user1
		//Lý do:
		private Builder() {
			
		}

		//B3: Tạo các hàm setter(return Builder cho class Builder
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
		
		//B4: Sau khi khởi tạo đối tượng Builder và set các giá trị xong
		// --> truyền cấc giá trị này cho các thuộc tính bên User1
		
		public User1 build() {
			return new User1(this);
		}
		
	}
	
}

package pattern.builder;

public class User1 {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private String address;

//	public User1(Integer id, String firstName, String lastName) {
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
	public User1() {

	}

	public User1(Integer id, String firstName, String lastName, Integer age, String email, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email="
				+ email + ", address=" + address + "]";
	}

	// nested class
	// class có nhiệm vụn là khởi tạo dối tượng các thông ti user1
	// Truyền các giá trị này qua sUser1
	public static class Builder {
		// B1: copy tất cả các thuộc tính từ User1
		private Integer id;
		private String firstName;
		private String lastName;
		private Integer age;
		private String email;
		private String address;

		// B2: Cho class này có private constructer, để dùng cho các chiính nó hơạc
		// User1
		// Lý do :....
		private Builder() {

		}

		// B3: Tạo các hàm setter(return Builder) ch class Builder
		private Builder withid(Integer id) {
			this.id = id;
			return this;
		}

		private Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		private Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		private Builder withAge(Integer age) {
			this.age = age;
			return this;
		}

		private Builder withEmail(String email) {
			this.email = email;
			return this;
		}

		private Builder withAddress(String address) {
			this.address = address;
			return this;
		}
	}
}

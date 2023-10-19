package pattern.builder;

/**
 Code with builder patter but custom style
 
 Mutable class
 */
public class User2 {

	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private String address;
	
	public User2() {
	}
	
	/*
	 Static method to create a new instance for User2
	 */
	
	public static User2 of() {
		return new User2();
	}
	// getter, setter(void)
	// getter, with... (this)
	public Integer getId() {
		return id;
	}

	public User2 withId(Integer id) {
		//
		this.id = id;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public User2 withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public User2 withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public User2 withAge(Integer age) {
		this.age = age;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User2 withEmail(String email) {
		this.email = email;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public User2 withAddress(String address) {
		this.address = address;
		return this;
	}
	
	
	
	
}

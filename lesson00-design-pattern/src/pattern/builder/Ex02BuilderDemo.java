package pattern.builder;

public class Ex02BuilderDemo {
	public static void main(String[] args) {
		User1 user1 = User1.builder()	//Builder
				.withId(15)//Builder
				.withFirstName("Teo")//Builder
				.withLastName("Le")//Builder
				.build();
		
		User1 user2 = User1.builder()	//Builder
				.withId(15)//Builder
				.withEmail("nga@gmail.com")
				.withAddress("sw")
				.build();
		System.out.println("User1:" +user1);
		System.out.println("User2:" +user2);
	// Builder pattern with custom style --> using User2
	User2 uA = new User2() // H1
			.withId(27) // H1
			.withEmail("teo@gmail.com");

	User2 uB = User2.of() // H2
			.withId(22) // H2
			.withEmail("ti@gmail.com");

	System.out.println("uA:" + uA);
	System.out.println("uB:" + uB);
}
}
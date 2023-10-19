package pattern.builder;

public class Ex02BuilderPattern {
	public static void main(String[] args) {
		User user = User.builder() // Builder
				.withId(1)
				.withAddress("Tran Thu Do")
				.withAge(18)
				.build();
		
		User user1 = User.builder()
				.withFirstName("teo")
				.withLastName("Nguyen")
				.withEmail("thinhnguyen")
				.build();
		
		System.out.println(user);
		System.out.println(user1);
		
		// Builder pattern with custom style --> using User2
		User2 uA = User2.of() //H1
				.withId(27) //H1
				.withEmail("teo@gmail.com");
		
		System.out.println("uA --> "+uA);
	}
}

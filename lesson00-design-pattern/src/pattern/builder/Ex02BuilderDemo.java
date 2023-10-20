package pattern.builder;

public class Ex02BuilderDemo {

	public static void main(String[] args) {
		
		User1 user1 = User1.builder() // Builder
				.withId("15")
				.withFirstName("Phạm")
				.withLastName("Vũ")
				.build();
		
		System.out.println("user1 --> " + user1);
		
		// Builder pattern with custom style --> using User2
		User2 uA = User2.of().withId("27").withEmail("@gmail.com");
		User2 uB = User2.of().withId("27").withEmail("@gmail.com");
		
		System.out.println("uA --> " + uA);
	}
}

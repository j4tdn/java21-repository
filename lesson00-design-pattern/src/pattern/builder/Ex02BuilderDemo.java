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
	}
}

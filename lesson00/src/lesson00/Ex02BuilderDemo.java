package lesson00;

public class Ex02BuilderDemo {
	public static void main(String[] args) {
		User1 user1 = User1.builder()
				.withFirstName("Linh")
				.build();
		
		User1 user2 = User1.builder()
				.withFirstName("Hoàng")
				.withId(2)
				.build();
		
		User1 user3 = User1.builder()
				.withFirstName("Hải")
				.withAge(12)
				.build();
		
		System.out.println(user1);
	}
}

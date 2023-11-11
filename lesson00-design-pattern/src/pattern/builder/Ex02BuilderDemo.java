package pattern.builder;

import java.math.BigDecimal;

public class Ex02BuilderDemo {

	public static void main(String[] args) {
		
		User1 user1 = User1.builder()
				.withId(1)
				.withFirstName("tai")
				.withLastName("Loc")
				.build();
		
		User1 user2 = User1.builder()
				.withId(13)
				.withEmail("tai@gmail.com")
				.build();
		
		System.out.println(user1);
		System.out.println(user2);
		
		// Builder pattern with custom style
		BigDecimal a = new BigDecimal(12)	// BigDecimal
				.add(bd(22))				// BigDecimal
				.subtract(bd(44));			// BigDecimal
		System.out.println("a --> " + a);
		
		BigDecimal b = BigDecimal.valueOf(20)
				.add(bd(22))
				.subtract(bd(44));
		System.out.println("b --> " + b);
		
		// Builder pattern with custom style --> Using User2
		User2 uA = User2.of()
				.withId(22)					// H1
				.withEmail("tl@gmail.com");	// H1
		
		User2 uB = new User2()
				.withId(23)					// H2
				.withEmail("tailoc@dev.com");// H2
		System.out.println("uA ->" + uA);
		System.out.println("uB -> " + uB);
	}
	
	private static BigDecimal bd(double d) {
		return BigDecimal.valueOf(d);
	}
}

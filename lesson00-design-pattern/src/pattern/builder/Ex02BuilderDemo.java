package pattern.builder;

import java.math.BigDecimal;

public class Ex02BuilderDemo {
	
	public static void main(String[] args) {
		
		User1 user1 = User1.builder() // Builder(H1)
				.withId(15)           // Builder
				.withFirstName("Teo") // Builder
				.withLastName("Le")   // Builder
				.build();
		
		User1 user2 = User1.builder()      // Builder(H2)
				.withId(18)                // Builder
				.withEmail("na@gmail.com") // Builder
				.build();
		
		User1 user3 = User1.builder()      // Builder(H2)
				.withId(22)                // Builder
				.withAddress("sw")         // Builder
				.withEmail("na@gmail.com") // Builder
				.build();
		
		System.out.println("user1 --> " + user1);
		System.out.println("user2 --> " + user2);
		System.out.println("user3 --> " + user3);
		
		// Builder pattern with custom style
		BigDecimal a = new BigDecimal(12)
							.add(bd(22))
							.subtract(bd(44));
		System.out.println("a --> " + a);
		
		BigDecimal b = BigDecimal.valueOf(20)
				.add(bd(22))
				.subtract(bd(44));
		System.out.println(" b --> " + b);
						
		
		
		//  Builder patter but custom style --> using User2
		User2 uA = new User2() // H1
				.withId(27) // H1
				.withEmail("teo@gmail.com");
		
		
		
		User2 uB = User2.of() // H2
				.withId(27) // H2
				.withEmail("teo@gmail.com");
		
		System.out.println("uA --> " + uA);
		System.out.println("uB --> " + uB);
	}
	
	private static BigDecimal bd(double doubleValue) {
		return BigDecimal.valueOf(doubleValue);
	}
}

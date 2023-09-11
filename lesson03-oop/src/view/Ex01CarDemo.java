package view;

import bean.Car;

public class Ex01CarDemo {
	public static void main(String[] args) {
		// Tạo đối tượng car
		Car c1 = new Car();
		
		c1.setId("c1");
		// c1.id = "C1";
		
		c1.setColer("Black");
		// c1.coler = "Black";
		c1.setModel("Lexus");
		// c1.model = "Lexus 570";
		
		c1.setPrice(1234567.89); 
		// c1.price = 10000000000.00;

		Car c2 = new Car("C2", "While", "Audi", 7000000000.00);
		Car c3 = new Car("C3", "Red", "Toyota", 399999999.00);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}
}

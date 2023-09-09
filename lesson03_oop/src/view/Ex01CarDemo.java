package view;

import bean.Car;

public class Ex01CarDemo {
	
	public static void main(String[] args) {
		
		// tạo n đối tượng car
		Car c1 = new Car();
		c1.id = "C1";
		c1.model = "MG5";
		c1.color = "Yellow";
		c1.salesPrice = 550d;
		
		Car c2 = new Car("C2", "Toyota Cross", "Black", 800);
		
		Car c3 = new Car("C3", "Honda CRV", "White", 880);
		
		Car c4 = new Car("C4", "Huyndai creta", "Red", 620);
		
		System.out.println("c1 --> "+  c1);
		System.out.println("c2 --> "+  c2);
		System.out.println("c3 --> "+  c3);
		System.out.println("c4 --> "+  c4);

	}
}

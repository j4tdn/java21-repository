package view;

import bean.Car;

public class Ex01CarDemo {
	// Tạo n đối tượng car
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setId("C1");
		c1.setModel("MG5");
		c1.setColor("Yellow");
		c1.setSalesPrice(550d);
		
		Car c2 = new Car("C2", "Toyota Cross", "Black", 800);
		
		Car c3 = new Car("C3", "Honda CRV", "White", 880);
		
		Car c4 = new Car("C4", "Huyndai Creta", "Red", 620);
		
		System.out.println("c1--->" + c1);
		System.out.println("c2--->" + c2);
		System.out.println("c3--->" + c3);
		System.out.println("c4--->" + c4);
	}
}

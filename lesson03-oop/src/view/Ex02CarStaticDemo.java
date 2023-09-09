package view;

import bean.Car;

public class Ex02CarStaticDemo {
	
	public static void main(String[] args) {
		
		// CarModel
		//    model
		
		// Car
		// CarModel carModel;
		
		// Car.model = "Audi";
		
		Car c1 = new Car("C1", "Yellow", 550d);
		c1.model = "MG";
		
		Car c2 = new Car("C2", "Black", 800);
		
		Car c3 = new Car("C3", "White", 880);
		c3.model = "Honda";
		
		Car c4 = new Car("C4", "Red", 620);
		
		System.out.println("c1 --> " + c1);
		
		System.out.println("\nc2 --> " + c2);
		
		System.out.println("\nc3 --> " + c3);
		
		System.out.println("\nc4 --> " + c4);
		
		// Khi nào hàm static ?
		
	}
}

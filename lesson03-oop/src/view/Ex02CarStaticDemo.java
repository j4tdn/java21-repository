package view;

import bean.Car;

public class Ex02CarStaticDemo {
	public static void main(String[] args) {
		Car c1 = new Car("C1", "yellow", 550);
		c1.setModel("MG");
		Car c2 = new Car("C2", "Black", 800);
		Car c3 = new Car("C3", "White", 880);
		Car c4 = new Car("C4", "red", 790);
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		
		// Khi nao h�m static ?
	}
}

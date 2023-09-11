package view;

import bean.Car;

public class Ex02CarStaticDemo {
	public static void main(String[] args) {
		Car.model = "Audi";

		Car c1 = new Car("C1", "Yello", 550d);
		//c1.setModel("MG");
		Car c2 = new Car("C2", "Black", 800d);
		Car c3 = new Car("C3",  "Black", 880d);
		Car c4 = new Car("C4" , "Black", 620);
		System.out.println("c1-->" +c1);
		System.out.println("c2-->" +c2);
		System.out.println("c3-->" +c3);
		System.out.println("c4-->" +c4);
		
		// Khi nào dùng static? 
		
	}
}
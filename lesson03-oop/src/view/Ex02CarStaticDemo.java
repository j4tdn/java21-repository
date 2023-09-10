package view;

import bean.Car;

public class Ex02CarStaticDemo {
	public static void main(String[] args) {
		Car c1 = new Car("C1", "Audi", "Yellow", 550d);
		Car c2 = new Car("C2", "Audi", "Black", 800d);
		Car c3 = new Car("C3", "Audi", "Blue", 900d);
		Car c4 = new Car("C4", "Audi", "Red", 500d);
		
		System.out.println("C1 -->: " + c1);
		System.out.println("\nC2 -->: " + c2);
		System.out.println("\nC3 -->: " + c3);
		System.out.println("\nC4 -->: " + c4);
	}
}

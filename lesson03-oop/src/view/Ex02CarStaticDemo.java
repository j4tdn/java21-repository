package view;

import bean.Car;

public class Ex02CarStaticDemo {
public static void main(String[] args) {
//	Car c1 = new Car();
//	c1.setId("C1");
//	c1.setModel("MG5");
//	c1.setColor("Yellow");
//	c1.setSalesPrice(200d);
	Car c1 = new Car("C1", "Audi", "Yellow", 200d);
	c1.setModel("MG");
	Car c2 = new Car("C2", "Audi", "Black", 800);
	Car c3 = new Car("C3", "Audi", "White", 880);
	Car c4 = new Car("C4", "Audi", "Red", 620);
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
}
}

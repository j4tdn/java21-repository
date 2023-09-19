package view.polymorphism.object;

public class Square extends Shape {
	@Override
	void paint() {
		System.out.println("Rectangle --->paint...");
	}

	@Override
	void cals() {
		System.out.println("Rectangle--> calS");
	}
	void setBackground() {
	System.out.println("Square ---> setBackgroungh ");	
	}
}

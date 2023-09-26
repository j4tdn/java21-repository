package view.polymorphism.object;

public class Rectangle extends Shape {
	
	@Override
	void paint() {
		System.out.println("Retangle --> paint ...");
	}
	
	@Override
	void cals() {
		System.out.println("Retangle --> cals ...");
	}
}

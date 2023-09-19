package view.polymorphism.object;

public class Square extends Shape {

	void paint() {
		System.out.println("Square --> paint...");
	}
	
	void calS() {
		System.out.println("Square --> calS...");
	}
	
	void setBackground() {
		System.out.println("Square --> setBackground...");
	}
}

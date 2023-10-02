package view.polymorphism.object;

public class Square extends Shape {

	@Override
	void paint() {
		System.out.println("Square --> paint...");
		super.paint();
	}
	
	@Override
		void calS() {
		System.out.println("Square --> calS...");
		super.calS();
		}
	
	void setBackground() {
		System.out.println("Square --> setBackground...");
	}
}

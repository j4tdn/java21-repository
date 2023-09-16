package view.polymorphism.object;

public class Rectangle extends Shape{
	
	@Override
	void paint() {
		super.paint();
		System.out.println("Rectangle --> paint ...");
		
	}
	@Override
	void claS() {
		super.claS();
		System.out.println("Rectangle -- > paint ...");
		
	}
	
}

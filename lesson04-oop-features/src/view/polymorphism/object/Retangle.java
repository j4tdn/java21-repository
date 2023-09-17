package view.polymorphism.object;

public class Retangle extends Shape{
	@Override
	void paint() {
		System.out.println("Retangle --> paint ...");
	}
	
	@Override
	void calS() {
		System.out.println("Retangle --> calS ...");
	}
}

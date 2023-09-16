package view.polymorphism.object;

public class Square extends Shape {
	@Override
	public void claS() {
		System.out.println("Shape -- > paint .....");
		super.claS();
	}

	@Override
	public void paint() {
		System.out.println("Shape -- > calS .....");
		super.paint();
	}

	public void setBackground() {
		System.out.println("Square --> setBackground ...");
	}
}

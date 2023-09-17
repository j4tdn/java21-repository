package view.polymorphism.object;

public class Ex01PolyObjectDemo {
	public static void main(String[] args) {
		//Shape
		System.out.println("\n--- Shape ---");
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		//Square
		System.out.println("\n--- Square ---");
		Square square = new Square();
		square.paint();
		square.calS();
		square.setBackground();
		//Rectangle
		System.out.println("\n--- Rectangle ---");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calS();
		//Polymorphism with Object
		System.out.println("\n---Polymorphism with Object---");
	}
}

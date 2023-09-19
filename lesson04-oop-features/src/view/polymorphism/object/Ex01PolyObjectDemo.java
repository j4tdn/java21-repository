package view.polymorphism.object;

public class Ex01PolyObjectDemo {
	public static void main(String[] args) {
		// Shape
		System.out.println("==============Shape==============");
		Shape shape =  new Shape();
		shape.calS();
		shape.paint();
		
		// Square
		System.out.println("==============Square==============");
		Square s =  new Square();
		s.calS();
		s.paint();
		
		
		// Rectangle
		System.out.println("==============Rectangle==============");
		Rectangle rec =  new Rectangle();
		rec.calS();
		rec.paint();
		
		// Polymorphism with Object
		//            s1
		// compile:  Shape
		// runtime:  Square
		System.out.println("==============Polymorphism with Object==============");
		Shape s1  = new Square();
		s1.calS();
		s1.paint();
		
		Shape s2 = new Rectangle();
		s2.calS();
		s2.paint();
	}
}

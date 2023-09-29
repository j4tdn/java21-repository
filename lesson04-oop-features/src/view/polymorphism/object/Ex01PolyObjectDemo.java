package view.polymorphism.object;

public class Ex01PolyObjectDemo {

	public static void main(String[] args) {
		
		// Shape
		System.out.println("---Shape---");
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		
		// Square
		System.out.println("\n---Square---");
		Square square = new Square();
		square.paint();
		square.calS();
		square.setBackground();
		
		// Rectangle
		System.out.println("\n---Rectangle---");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calS();
		
		// Polymorphism with Object
		System.out.println("\n---Polymorphism with Object---");
		Shape s1 = new Square();
		s1.paint();
		s1.calS();
		
		Shape s2 = new Rectangle();
		s2.paint();
		s2.calS();
		
		/*
		 Câu hỏi
		 1. Parent p = new Child();
		 	có thể lấy Child c = new Parent(); đc ko, vì sao?
		 
		    --> không, khi biến thuộc Child gọi hàm tự tạo ra, lúc runtime ko thể tìm thấy đc trong đối tượng KDL cha
		    --> failed first
		    
		    Biến KDL cha có thể nhận giá trị KDL chính nó hoặc KDL con
		    
		 2. Tại sao ko khai báo trực tiếp
		      + Parent p = new Parent();
		      + Child c = new Child();
		    mà phải sử dụng đa hình trong đối tượng
		      + Parent p1 = new ChildX();
		      + Parent p2 = new ChildY(); 
		      
		    --> dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
		    --> hỗ trợ tạo danh sách(mảng) các phần tử trong phạm vi cha con
		    --> hỗ trợ tạo hàm KDL cha
		    	có thể truyền tham số KDL cha, con
		    	
		    	log(shape);
		    	log(rectangle);
		    	log(square);
		    	
		    	// Shape shape = shape;
		    	// Shape shape = rectangle;
		    	// Shape shape = square;
		    	void log(Shape shape){
		    		sout(shape)
		    	}
		    --> hỗ trợ factory pattern	
		 
		 */
		
		// cho danh sách các hình(vuông, chữ nhật, tròn,...)
		Shape[] shapes = {shape, rectangle, s1, s2, square};
		
	}
}

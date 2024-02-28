package view.polymorphism.object;

public class Ex01PolyObjectDemo {
	
	public static void main(String[] args) {
		System.out.println("--- Shape ---");
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		
		System.out.println("\n--- Square ---");
		Square square = new Square();
		square.paint();
		square.calS();
		square.setBackground();
		
		System.out.println("\n--- Rectangle ---");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calS();
		
		// Tương lai, rect có thể biến thành square --> dùng hàm của đối tượng square
		// rectangle = square;
		
		//             s1
		// compile:  Shape
		// runtime: 
		
		System.out.println("\n--- Polymorphism with Object ---");
		Shape s1 = new Square(); // H1
		s1.paint();
		s1.calS();
		
		Shape s2 = new Rectangle();
		s2.paint();
		s2.calS();
		
		s2 = s1;
		
		/*
		 Câu hỏi
		 1. Parent p = new Child();
		    Có thể lấy, gán Child c = new Parent() được ko, vì sao ?
		    
		    --> Không, khi biến thuộc Child gọi hàm tự tạo ra, lúc runtime
		        không thể tìm thấy được trong đối tượng KDL cha
		    --> failed first 
		    
		    Biến KDL cha có thể nhận giá trị KDL chính nó hoặc KDL con
		    
		  2. Tạo sao không khai báo trực tiếp
		       + Parent p = new Parent();
		       + Child c = new Child();
		     mà phải sử dụng đa hình trong đối tượng
		       + Parent p1 = new ChildX();
		       + Parent p2 = new ChildY();
		       
		     --> Dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
		     --> Hỗ trợ tạo danh sách(mảng) các phần tử trong phạm vi cha con
		     --> Hỗ trợ tạo hàm có KDL cha(chung)
		         Có thể truyền tham số KDL cha, con 
		         
		         log(shape);
		         log(rectangle);
		         log(square);
		         
		         // Shape shape = shape;
		         // Shape shape = rectangle;
		         // Shape shape = square;
		         void log(Shape shape) {
		            sout(shape);
		         }
		      --> Hỗ trợ factory pattern
		 */
		
		// Cho danh sách các hình(vuông, chữ nhật, tròn ...)
		Shape[] shapes = {shape, rectangle, s1, s2, square};
		
		shape = rectangle;
		// rectangle = shape; // error
		
		Square sq1 = (Square)new Shape(); // error cannot cast Parent to Child
		sq1.paint();
		sq1.calS();
		sq1.setBackground();
		
	}
}
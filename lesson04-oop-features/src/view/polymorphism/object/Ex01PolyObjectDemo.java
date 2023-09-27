package view.polymorphism.object;

public class Ex01PolyObjectDemo {
	
	public static void main(String[] args) {
		
		// Shape
		System.out.println("===SHAPE===");
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		
		// Square
		System.out.println("===Square===");
		Square square = new Square();
		square.paint();
		square.calS();
		square.setBackground();
		
		// Rectangle
		System.out.println("===Rectangle===");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calS();
		
		//			s1
		// compile: Shape
		// runtime: Square
		
		// polymorphism with object
		
		System.out.println("\n=== polymorphism with object ===");
		Shape s1 = new Square();
		s1.paint();
		s1.calS();
		
		Shape s2 = new Rectangle();
		s2.paint();
		s2.calS();
		
		/*
		 	Câu hỏi
		 	1. Parent p = new Child();
		 	Có thể lấy Child c = new Parent() được không, vì sao ?
		 	--> Không, bởi vì khi biến thuộc Child gọi hàm tự tạo ra, lúc runtime không thể tìm thấy được trong
		 	đối tượng KDL cha --> failed first
		 	
		 	Biến KDL cha có thể nhận giá trị KDL chính nó hoặc KDL con
		 	
		 	2. Tại sao không khai báo trực tiếp 
		 		+ Parent p = new Parent();
		 		+ Child c = new Child();
		 	mà phải sử dụng đa hình trong đối tượng
		 		+ Parent p1 = new ChildX();
		 		+ Parent p2 = new ChildY();
		 		
		 	--> Dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
		 	--> Hỗ trợ tạo ds các phần tử trong phạm vi cha con
		 	--> Hỗ trợ tạo hàm có KDL(chung)
		 		Có thể truyền tham số KDL cha, con
		 	--> Hỗ trợ factory pattern	
		 */
		
		// cho ds các hình(vuông, hcn, hình tam giác..)
		Shape[] shapes = {rectangle, square, s1, s2, shape};
		
	}
}

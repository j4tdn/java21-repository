package view.polymorphism.object;

public class Ex01PolyObjectDemo {
	public static void main(String[] args) {

		// Shape
		System.out.println("-----------Shape------------");
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		
		// Square
		System.out.println("\n-----------Square------------");
		Square square = new Square();
		square.paint();
		square.calS();
		square.setBackground();
		
		// Rectangle
		System.out.println("\n-----------Rectangle------------");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calS();
		
		//				s1
		// compile:	  Shape
		// runtime:
		
		// Polymorphism with Object
		System.out.println("\n-----Polymerphism with Object -----");
		Shape s1 = new Square();
		s1.paint();
		s1.calS();
		
		Shape s2 = new Rectangle();
		s2.paint();
		s2.calS();
		
		/*
		 Câu hỏi
		 1. Parent p = new Child();
		 	Có thể lấy, gán Child c = new Parent(); đc k, vì sao?
		 
		 	--> không, khi biến thuộc Child gọi hàm từ tạo ra, lúc runtime không thể tìm thấy đc trong đối tượng KDL cha
		 	--> failed first
		 	
		 	Biên KDL cha có thể nhận giá trị KDL chính nó hoặc KDL con
		 	
		 2. Tại sao không khai báo trực tiếp
		 		+ Parent p = new Parent();
		 		+ Child c = new Child():
		 	mà phải sử dụng đa hình trong đối tượng
		 		+ Parent p1 = new ChildX();
		 		+ Parent p2 = new ChildY();
		 		
		 	--> Dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
		 	--> Hỗ trợ tạo danh sách (mảng) các phần tử trong phạm vi cha con
		 	--> Hỗ trợ tạo hàm có KDL cha(chung)
		 		Có thể truyền tham số KDL cha, con
		 		
		 		log(shape);
		 		log(rectangle);
		 		
		 		// Shape shape = shape;
		 		// Shape shape = rectangle
		 		void log(Shape shape) {
		 			sout(shape);
		 		}
		 		
		 	--> Hỗ trợ factory pattern
		 */
		// Cho danh sách hình(vuông , vn, tròn)
		Shape[] shapes = {s1,shape, rectangle, square};
	}
}

package view.polymorphism.object;

public class Ex01PolyObjectDemo {

	public static void main(String[] args) {
		
		//Shape
		System.out.println("---Shape---");
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		
		//Square
		System.out.println("---Square---");

		Square square = new Square();
		square.paint();
		square.calS();
		square.setBackground();
		
		//rectangle
		System.out.println("---Rangtangle---");

		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calS();
		
		
		
		//			s1
		// compile: Shape
		// runtime: Square
		System.out.println("---Polymorphism with Object---");
		Shape s1 = new Square();
		s1.paint();
		s1.calS();
		
		Shape s2 = new Rectangle();
		s2.paint();
		s2.calS();
		
		s2 = s1;

		/*
		 Câu hỏi
		 1. Parent p = new Child();
		 	Có thể lấy Child c = new Parent() được ko, vì sao
		 	
		 	--> không, khi biến thuộc Child gọi hàm tự tạo ra, lúc runtime
		 		không thể tìm thấy được trong đối tượng KDL cha
		 	--> failed first	
		 	
		 	Biến KDL cha có thể nhận giá trị KDL chính nó hoặc KDL con
		 	
		 2. Tại sao không khai báo trực tiếp
		 		+ Parent p = new Parent();
		 		+ Child c = new Child();
		 	mà phải sử dụng đa hình trong đối tượng
		 		+ Parent p1 = new ChildX();
		 		+ Parent p2 = new ChildY();
		 		
		 	--> dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
		 	--> Hỗ trợ tạo ds(mảng) các phần tử trong phạm vi cha con
		 	--> Hỗ trợ tạo hàm có KDL cha(chung)
		 		Có thể truyền tham số KDL cha, con
		 		
		 		log(shape);
		 		log(rectangle);
		 		log(square);
		 		
		 		// Shape shape = shape;
		 		// Shape shape = rectangle;
		 		// Shape shape = square;
		 		
		 		void log(Shape shape){
		 			sout(shape);
		 		}
		 		
		 		--> Hỗ trợ factory pattern (mò)
		 */
		
		// Cho ds các hình (vuông, chữ nhật, tròn,....)
		Shape[] shapes = {shape, square, rectangle, s1, s2};
		
		
		shape = rectangle;
		// rectangle = shape; // error
		
		//Square sq1 = (Square) new Shape(); // error 
	}
}

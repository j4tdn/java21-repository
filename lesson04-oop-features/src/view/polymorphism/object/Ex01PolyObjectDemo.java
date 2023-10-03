package view.polymorphism.object;

public class Ex01PolyObjectDemo {

	public static void main(String[] args) {

		// Shape
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		System.out.println("----------------------\n");

		// Square
		Square square = new Square();
		square.paint();
		square.calS();
		square.setBackground();
		System.out.println("-----------------------\n");

		// Rectangle
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calS();
		System.out.println("------------------------\n");

		// Polymorphism with object
		System.out.println("==== Polymorphism with object ===\n");
		Shape s1 = new Square();
		s1.paint();
		s1.calS();

		Shape s2 = new Rectangle(); 
		s2.paint();
		s2.calS();
		
		System.out.println("\n------------------------------\n");
		s1 = s2;
		s1.paint();
		s1.calS();
		s2.paint();
		s2.calS();
		

//		Square sq1 = (Square) new Shape(); // --> error cannot cast Parent to Child
//		sq1.calS();
//		sq1.paint();
//		sq1.setBackground();
//		
		//    -->      :    s1, s2
		// compile time: Shape
		// runtime     : Square, Rectangle
		
		/*
		   Câu hỏi:
		 1. Parent p = new Child();
		    Có thể lấy Child c = new Parent(); được không ?
		 --> Không, vì biến thuộc Child gọi hàm tự tạo ra thì lúc runtime không 
		            thể tìm thấy được trong KDL cha
		 --> failed first
		 
		 Biến KDL cha có thể nhận giá trị KDL chính nó hoặc KDL con.
		 
		 2. Tại sao mình không khai báo trực tiếp 
		    - Parent p = new Parent();
		    - Child c = new Child();
		    mà phải sử dụng đa hình trong đối tượng:
		    - Parent p1 = new ChildX(); ?
		    - Parent p2 = new ChildY();
		    ------------------ Trả lời: -------------------
		    --> Dễ dáng ép kiểu qua về các biến trong phạm vi KDL cha con
		    --> Hỗ trợ tạo danh sách(mảng) các phần tử trong phạm vi cha con
		        vd:
		        Cho danh sách các hình (vuông, tròn, HCN,..)
		        --> Shape[] shapes = {hình,vuông, tròn, HCN,.........};
		    --> Hỗ trợ hàm có KDL cha -> có thể truyền tham số KDL cha, con
		        vd: 
		        
		        main method() {
		           log(rectangle);
		           log(square);
		           .........
		        }
		        
		        // Shape shape = shape || rectangle || square
		        void log(Shape shape) {
		            sout(shape);
		        }
		        --> hỗ trợ factory pattern
		 */
		
		

	}

}

package view.polymorphism.object;
// tính đa hình đối tượng
public class Ex01PolyObjectDemo {
	public static void main(String[] args) {
		
		// Shape
		System.out.println(" -- Shape--");
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		
		//Square
		System.out.println(" -- square--");
		Square square = new Square();
		square.paint();
		square.calS();
		square.setBackground();
		
		//Rectangle
		System.out.println(" -- Rectangle--");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calS();
		
		// compile:
		// runtime:
		/*
		 * Cẩu hỏi
		 * 1. Parent p = new Child ();
		 *  	có thể lấy Child c= new Parent () được không, vì sao?
		 *  Không thể vì trên vùng nhớ HEAP chỉ có hàm của chính nó thôi, khi runtime thì chỉ có hàm của con
		 *  Không, kh biến thuộc child gọi hàm tự tạo ra, lúc runtime, không thể tìm thấy được trong đối tượng của KDL cha
		 *  --> failed first
		 *   Biến KDL ch có thể nhận giá trị KDL chính nó hoặc KDL con
		 * 2. Tại sao không khai báo trực tiếp
		 * 	  +Parent p = new Parent ();
		 * 	  +Child c = new Child ();
		 * 	mà phải sử dụng đa hình trong đối tượng
		 *    +Parent p1 = new ChildX();
		 *    +Parent p2 = new ChildY();
		 *  
		 *  --Dễ Dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
		 *  --Hỗ trợ tạo danh sách (mảng) các phần tử trong phạm vi cha con
		 *  -- Hỗ trợ tạo hàm có KDL cha (chung)
		 *   có thể truyền tham số KDL cha, con
		 *    VD: 
		 *    	log (shape);
		 *      log(rectangle);
		 *      log(square);
		 *      
		 */
			// Shape shape = shape;
		    // Shape shape = rectangle;
		    // Shape shape = square;
		//   void log(Shape shape) {
		//	   sout (shape)
		//     }
		//   -- HỖ trợ factory pattern  (Về nghiên cứ tra GG)
		// Cho danh sách các hình ( vuông, chữ nhật, tròn ..)
		Shape[] shapes = {shape, rectangle, square};
		 shape = rectangle;
		// rectangle = shape; // lỗi không thể gán cha cho con
		//Polymorphism with Object
		System.out.println(" -- Polymorphism with Object--");
		Shape s1 = new Square();
		s1.paint();
		s1.calS();
		
		Shape s2 = new Rectangle();
		s2.paint();
		s2.calS();
		s2 = s1; // dể dàng ép kiểu qua về giữa các biến trong phạm vi cha con
		
		Square sq1 = (Square)new Shape(); // error cannot cast
		sq1.paint();
		sq1.calS();
		sq1.setBackground();
		
	}
	


	
}

package view.polymorphism.object;

public class Ex01PolyObjectDemo {
	public static void main(String[] args) {
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
		System.out.println("===Retangle===");
		Rectangle retangle = new Rectangle();
		retangle.paint();
		retangle.calS();
		
		// compile:
		// runtime:
		
//		polymorphism with object
		System.out.println("\n=== polymorphism with object ===");
		Shape s1 = new Square();
		s1.paint();
		s1.calS();

		
		/*
		 Câu hỏi
		 1. Parent p  = new Child();
		    Có thể lấy Child c = new Parent() được không vì sao
		    vì khi new cha thì trên vùng nhớ heap của cha chỉ có những hàm của cha thôi
		    lúc runtime thì trên cùng nhớ heap không có hàm của con 
		 
		    Biến KDL cha có thể nhận giá trị KDL chính nó hoặc KDL con 
		    
		 2. Tại sao không khai báo trực tiếp 
		   + Parent p = new Parent
		   + Child c = new Child();
		   
		   mà phải sử dụng đa hình trong đối tượng
		   + Parent p1 = new ChildX();
		   + Parent p2 = nê ChildX();'
		   
		   --> Dễ dàng ép kiểu qua về giữa các biến trong phạm vi kiểu dữ liệu cha con
		   --> Hỗ trợ tạo danh sách (mảng) các phần tử trong phạm vi cha con
		   --> Hỗ trợ tạo hàm có KDL cha(chung)
		       Có thể truyền tham số KDL cha, con
		       
		       log(Shape);
		       log(rect);
		       log(square);
		       
		       //Shape shape = shape;
		       //Shape shape = rectangle;
		       //Shape shape = square;
		        * void log(Shape shape) {
		                sout(shape);
		          }
		       --> Hỗ trợ factory pattern
		 */
		
		// Cho danh sách các hình (vuông, tròn, chữ nhật ..)
		Shape[] shapes = {shape, retangle, s1, square};
		
		
		// cha : 1 2
		// con : 1 2 3
		
		Square sq1 = (Square) new Shape(); // error cannot cast parent to child
		sq1.paint();
		sq1.calS();
		sq1.setBackground();
 	}
}
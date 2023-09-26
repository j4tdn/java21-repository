package view.polymorphism.object;

public class Ex01PolyObjectDemo {
	
	public static void main(String[] args) {
		 
		//shape
		System.out.println("--- shape ---");
		Shape shape = new Shape();
		shape.paint();
		shape.cals();
		
		//square
		System.out.println("--- square ---");
		Square square = new Square();
		square.paint();
		square.cals();
		square.setBackground();
		
		//rectangle
		System.out.println("--- rectangle ---");
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.cals();
		
		//			 s1
		// compile: shape
		// runtime:	Square
		
		//polymorphism with object
		System.out.println("\n --- polymorphism with object ---");
		Shape s1 = new Square();
		s1.paint();
		s1.cals();
		
		Shape s2 = new Rectangle();
		s2.paint();
		s2.cals();
		
		/*
		 câu hỏi:
		 1. mình có thể lấy Parent p = new Child();
		 	v có thể lấy Child c = new Parent() được ko, vì sao?
		  
		  --> không, vì khi biến thuộc Child gọi hàm tự tạo ra, lúc runtime 
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
		  	--> hỗ trợ tạo danh sách(mảng) các phần tử trong phạm vi cha con
		  	--> hỗ trợ tạo hàm có KDL cha(chung)
		  		có thể truyền tham số KDL cha, con
		  		
		  			log(shape);
		  			log(square);
		  			log(rectangle);
		  			
		  		void log(Shape shape){
		  			sout(shape);
		  		}
		  		
		  		--> hỗ trợ factory pattern
		*/
	}
}

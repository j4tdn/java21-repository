package view.polymorphism.object;

import java.awt.Rectangle;

public class Ex01PolyObjectDemo {
	public static void main(String[] args) {

		// Shape
		Shape shape = new Shape();
		shape.paint();
		shape.claS();
		
		// Square
		Square square1 = new Square();
		
		square1.claS();
		square1.paint();
		square1.setBackground();
		
		// Rectangle
		Rectangle rectangle = new Rectangle();
		// rectangle.paint();
		Shape s1 = new Square();
		s1.paint();
		s1.claS();
		
		Rectangle s2 = new Rectangle();
		s1.claS();
		s1.paint();
		// Polymorphism with Obiect
		/*
		 Câu hỏi 
		 1. Parent p = new Child();
		 Có thể lấy, gán Child c = new Parent() được k, vì sao?
		  	--> Không, khi biến thuộc Child gọi hàm tự tạo ra, lúc runtime Không thể tìm thấy đc trong đối tựng KDL cha
		  	
		  	--> failed first
		  	
		  	Biến KDL cha có thể nhận giá trị KDL chính nó hoặc KDL con.
		 2. Tại sao mình k khai báo trực tiếp 
		 	Parent p = new Parent();
		 	Child c = new Child();
		 	mà phải sử dụng đa hình trong đối tượng
		 		+ Parent p1 = new ChildX();
		 		+ Parent p2 = new ChildY();
		 		
		 			--> dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
		 			--> Hỗ trợ tạ danh sách(mảng) các phần tử trng phạm vi cha con
		 			--> Hỗ trợ tạo hàm có KDL cha(chung)
		 				có thể truyên tham sô KDL cha,con
		 				 
		 				 
		 			--> Hỗ trợ factory pattern
		 */
		// Cho danh sách các hình( vuông, chữ nhật, tròn, ....)
		//Shape[] shapes = {shape, rectangle, s1, s2)};
	}
}

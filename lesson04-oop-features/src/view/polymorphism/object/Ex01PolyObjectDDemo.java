package view.polymorphism.object;



public class Ex01PolyObjectDDemo {
public static void main(String[] args) {
	//Shape
	Shape shape = new Shape();
	shape.paint();
	shape.cals();
	
	//Square
	Square square = new Square();
	square.paint();
	square.cals();
	
	//Rectangle
	
	Rectangle rectangle = new Rectangle();
	rectangle.paint();
	rectangle.cals();
	
			
	//s1
	//compile: Shape
	//runtime:
	Shape s1 = new Shape(); //H1
	s1.paint();
	s1.cals();
	Shape s2 = new Rectangle();
	s2.paint();
	s2.cals();
}
/*
 câu 1: 
 1.Parent p = new Chil();
 mình có thể lấy Child c= new Parent đc k?, vì sao? 
 Lớp con không thể tạo hay new ra lớp cha
 
 Shape = rectangle, được bởi vì mình gán rectangle cho lớp Shape(lớp cha)
 hay nói cách khác: Biến KDL cha có thể nhận giá trị KDL chính nớ hoặc KDL con
 
 nhưng rectangle = shape thì không được, k thể gán lớp cha cho lớp con
 
 câu 2: tại sao mình không khai báo trực tiếp parent p = new parent, child c = new child
 mà phải sử dụng đa hình trong đối tượng, parent p = new child
 
 1. Dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
 2. Hỗ trợ tạo danh sách(mảng) các phần tử trong phạm vi cha con
 3. Hỗ trợ tạo hàm có KDL cha, có thể truyền tham số KDL cha, con
 
 		void log(Shape shape){
 		sout(shape)
 		}
 		có thể truyển shape, rectangle, square,....
 4. Hỗ trợ factory pattern
 */

//cho danh sách các hình(vuông, chữ nhật, tròn,....)
Shape[] shapes = {shape, ractangle, square, s1, s2};
}

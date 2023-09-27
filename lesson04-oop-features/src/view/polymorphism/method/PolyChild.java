package view.polymorphism.method;

public class PolyChild extends PolyParent {
	
	@Override
	void log() {
		System.out.println("PolyChild --> log...");
	}
	
	/*
		shape     : calS 
		 
	 	rectangle : calS
	 	Square    : calSOfSquare
	 	Triangle  : tinhS
	 	Circle	  : claDienTich
	 	
	 	Câu hỏi: Vì sao phải tạo class cha rồi overriding lại trong class con?
	 	--> Tạo class cha là mình có code chung(tạo 1 function chung) để mình kế thừa
	 	--> Tạo class cha rồi overriding lại trong class con, giúp code sạch sẽ dùng chung 1 hàm
	 	VD: Cũng là hàm tính Diện tích mà mỗi hình đặt tên hàm khác nhau(TinhS, TinhDienTich..)
	 	--> Thay vào đó tạo 1 class cha rồi class con overriding lại --> sạch sẽ code, tái sử dụng
	 */
}

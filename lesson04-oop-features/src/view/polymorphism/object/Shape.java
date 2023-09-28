package view.polymorphism.object;

public class Shape {

	// lớp cha	: tạo hàm chung
	//  		: chưa biết phần thực thi như thế nào
	// --> tạo hàm không có phần thực thi (không cho phép trong class)
	
	// khai báo KDL_TV TenHam(tham số)
	// thực thi {}
	void paint() {
		// unknow implementation
		System.out.println("Shape --> paint...");
	}
	
	void calS() {
		System.out.println("Shape --> calS...");
	}
}

package view.polymorphism.object;

public class Shape {
	
	// Lớp cha: tạo hàm chung
	//        : chưa biết phần thực thi như thế nào
	// --> tạo hàm ko có phần thực thi 
	
	// khai báo KDL_TV TenHam(tham số)
	// thực thi {}
	
	void paint() {
		// unknown
	}
	
	void calS() {
		// unknown implementation
		System.out.println("Shape --> calS ...");
	}
	
}

package view.polymorphism.object;

public class Shape {

	// Lớp cha: tạo hàm chung
	//        : chưa biết phần thực thi như thế nào
	// --> tạo hàm ko có phần thực thi (ko cho phép trong class)
	
	// khai báo KDL_TV TenHam(tham so)
	// thực thi {}
	
	void paint() {
		// unknown implementation
		System.out.println("Shape --> paint ...");
	}
	
	void calS() {
		// unknown implementation
		System.out.println("Shape --> calS ...");
	}
}

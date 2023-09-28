package view.polymorphism.object;

public class Shape {

	// lớp cha: tạo hàm chung
	//		  : chưa biết phần thực thi như thế nào
	// --> tạo hàm không có phần thực thi(ko cho phép trong class)
	
	void paint() {
		//unknown implementation
		System.out.println("shape --> paint ...");
	}
		//unknown implementation
	void cals() {
		System.out.println("shape --> calS ...");
	}
}

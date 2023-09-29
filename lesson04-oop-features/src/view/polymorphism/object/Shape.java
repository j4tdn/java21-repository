package view.polymorphism.object;

public class Shape {
 
		// Lớp cha: tạo hàm chung
		//        : chưa biết phần thực thi như thế nào
		// --> tạo hàm không có phần thực thi (không cho phép trong class)
	void paint () {
		//unknown implemeantation
		System.out.println("Shape-- paint ..");
		
	}
	void calS() {
		//unknown implemeantation
		System.out.println("Shape -->calS...");
	}

	
}

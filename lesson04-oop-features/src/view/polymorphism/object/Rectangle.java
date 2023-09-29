package view.polymorphism.object;

public class Rectangle extends Shape {
	
	//Lớp con: khi thừa kế từ cha là class
	//       : không bắt buộc phải override
	// --> lớp con bắt buộc phải voeride các hàm trong KDL cha 
	
	@Override
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	
	@Override
	void calS() {
		System.out.println("Rectangle --> calS");
	}
}

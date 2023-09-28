package view.polymorphism.object;

public class Rectangle extends Shape {
	
	//lớp con: khi thừa kế từ cha là class
	//		 : không bắt buộc phải override
	// --> lớp con bắt buộc phải override các hàm trong KDL cha
	
	@Override
	void paint() {
		System.out.println("Retangle --> paint ...");
	}
	
	@Override
	void cals() {
		System.out.println("Retangle --> cals ...");
	}
}

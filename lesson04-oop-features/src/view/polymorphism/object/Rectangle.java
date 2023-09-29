package view.polymorphism.object;

public class Rectangle extends Shape {
	 @Override //bắt đầu ghi đè bấm ctrl + space chọn paint calS
	 
	 // lớp con: khi thừa kế từ cha là class
	 //	       : không bắt buộc phải overide
	 //--> lớp con bắt buộc phải override các hàm trong KDL cha
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	 @Override
	void calS() {
		// TODO Auto-generated method stub
		 System.out.println("Rectangle --> Cals");
	}
}

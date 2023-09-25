package view.polymorphism.object;

public class Rectangle extends Shape {
	 @Override //bắt đầu ghi đè bấm ctrl + space chọn paint calS
	void paint() {
		System.out.println("Rectangle --> paint");
	}
	 @Override
	void calS() {
		// TODO Auto-generated method stub
		 System.out.println("Rectangle --> Cals");
	}
}

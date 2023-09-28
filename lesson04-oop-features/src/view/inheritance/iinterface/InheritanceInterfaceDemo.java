package view.inheritance.iinterface;

public class InheritanceInterfaceDemo {

	public static void main(String[] args) {
		
		// Anonymous inner type
		// Anonymous class (lớp ẩn danh)
		Shape sh1 = new Shape() {
			@Override
			public void paint() {
				System.out.println("Circle --> paint...");
			}
			
			@Override
			public void calS() {
				System.out.println("Circle --> calS...");
			}
			
			@Override
			public void onload() {
				
			}
		};
		sh1.paint();
		sh1.calS();
		
		System.out.println("=============");
		
		// External class
		Shape sh2 = new Circle();
		sh2.paint();
		sh2.calS();
		
		// --> Anonymous function
		
		// để tạo 1 đối tượng cho biến KDL interface
		// Dùng :
		// 		+ External class
		//		+ Anonymous class
		//		--> có thể có 1 hoặc nhiều hàm trừu tượng 
		
	}
}

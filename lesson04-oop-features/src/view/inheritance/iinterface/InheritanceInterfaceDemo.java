package view.inheritance.iinterface;

public class InheritanceInterfaceDemo {
	public static void main(String[] args) {
		
		// Anonymous class
		Shape sh1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint ...");
				
			}
			
			@Override
			public void calS() {
				System.out.println("Circle --> calS");
			}
		};
		sh1.calS();
		
		// External class
		Shape sh2 = new Circle();
		sh2.calS();
		
		// Để tạo 1 đối tượng cho biến KDL interface
		// Dùng:
		//	+ External class
		//	+ Anonymous class
		//		--> có thể có 1 hàm, nhiều hàm trừu tượng
		
		//	+ Anonymous function
		//		--> có duy nhất 1 hàm trưu tượng
	}
}

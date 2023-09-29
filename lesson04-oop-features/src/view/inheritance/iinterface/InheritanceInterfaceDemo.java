package view.inheritance.iinterface;

public class InheritanceInterfaceDemo {
	
	public static void main(String[] args) {
		
		//Anonymous inner type: kiểu dữ liệu ẩn danh
		
		
		//Anonymous class
		Shape sh1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint");
			}
			
			@Override
			public void calS() {
				System.out.println("Circle --> calS");
			}
			
			@Override
			public void onload() {
				
			}
		};
		
		sh1.paint();
		sh1.calS();
		
		System.out.println("===================================");
		
		//External class
		Shape sh2 = new Circle();
		sh2.paint();
		sh2.calS();
		
		
		// --> Anonymous function
		
		
		//Để tạo 1 đối tượng cho biển KDL interface
		// Dùng
		// + External class
		// + Anonymous class
		//   --> Có thể có 1 hàm nhiều hàm trừu tượng
		
		// + Anonymous function (lamda)
		// --> có duy nhất 1 hàm trừu tượng
	}
}

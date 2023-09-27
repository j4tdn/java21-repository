package view.inheritance.iinterface;

public class InheritanceInterfaceDemo {
	
	public static void main(String[] args) {
		
		Shape sh1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint ");
			}
			
			@Override
			public void calS() {
				System.out.println("Circle --> calS ");				
			}
			
			@Override
			public void onload() {
				// TODO Auto-generated method stub
				
			}
		};
		
		sh1.paint();
		sh1.calS();
		
		// External class
		Shape sh2 = new Circle();
		sh2.paint();
		sh2.calS();
		
		// Anonymous function
		/*
		 	Để tạo 1 đối tượng cho biến KDL interface
		 	Dùng
		 	 + External class
		 	 + Anonymous function
		 	 --> Có thể có 1 hàm nhiều hàm trừu tượng
		 */
		
	}
}

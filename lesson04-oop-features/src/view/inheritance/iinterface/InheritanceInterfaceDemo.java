package view.inheritance.iinterface;

public class InheritanceInterfaceDemo {
	public static void main(String[] args) {
		//Anonymous  type
		Shape sh1 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint");
			}
			
			@Override
			public void cals() {
				System.out.println("Circle --> cals");
			}

			@Override
			public void onload() {
				// TODO Auto-generated method stub
				
			}
		};
		sh1.paint();
		sh1.cals();
		System.out.println("----------------");
	
	//External calss
	Shape sh2 = new Circle();
	sh2.cals();
	sh2.paint();
	// --> Annonymous function
	//Để tạo 1 đối tượng trong biến KDL interface
	// Dùng 
	//	+ External class
	//	+Annoynymous calss
}
}
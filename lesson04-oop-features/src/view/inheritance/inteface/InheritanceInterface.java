package view.inheritance.inteface;

public class InheritanceInterface {
	public static void main(String[] args) {
	
		// anonymous class
		Shape sh1 = new Shape() {

			@Override
			public void paint() {
				System.out.println("Circle --> paint  ");

			}

			@Override
			public void cals() {
				System.out.println("Circle --> cals  ");

			}

			@Override
			public void running() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void coding() {
				// TODO Auto-generated method stub
				
			}
		};

		sh1.paint();
		sh1.cals();
		
		
		//anonymous function
		Shape sh2 = new Circle();
		sh2.paint();
		sh2.cals();
		
		/*
		 Để tạo 1 đối tượng cho biến KDL interface
		 Dùng
		 	Extarnal class
		 	Anonymous class
		 	 	--> có thể dùng 1 hàm nhiều hàm trường tượng
		 */
		
		
		/*
		 Anonymous Function
		 	--> có duy nhất 1 hàm trường tượng
		 */
	}
}

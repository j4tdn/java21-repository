package view.inheritance.iinterface;

public class InheritanceInterfaceDemo {

	public static void main(String[] args) {
		
		// External class
		    Shape sh2 = new Circle();
		    sh2.calS();
		    sh2.paint();
		
		// --> Anonymous function
		
		// Để tạo ra 1 đối tượng cho biến KDL interface
		// Dùng:
		// + External class
		// + Anonymous class
		//    --> có thể có 1 hàm nhiều hàm trừu tượng
		
		// + Anonymous function(lamda)
		//    --> có duy nhất 1 hàm trừu tượng
	}
	
	
}

package view.inheritance.abstractclass;

public class InheritanceAbstractClassDemo {
	public static void main(String[] args) {
		// Anonymous class
		EmailService es = new EmailService() {
			
			@Override
			public void login() {
				System.out.println("login");
			}
		};
		es.login();
	}
	// Để tạo 1 đối tượng cho biến KDL abstract class
	// Dùng
	// +External class
	// +Anonymous class
	// --> có thể có 1 hàm nhief hàm trừu tượng
}

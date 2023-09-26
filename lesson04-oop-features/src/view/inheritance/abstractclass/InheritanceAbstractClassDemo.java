package view.inheritance.abstractclass;

public class InheritanceAbstractClassDemo {

	public static void main(String[] args) {
		
		// Anonymous class
		EmailService es = new EmailService() {
			
			@Override
			void login() {
				System.out.println("login");
			}
		};
		es.login();
		
		// Để tạo 1 đối tượng cho biến KDL interface
		// Dùng
		// + External class
		// + Anonymous class
		// --> có thể có 1 hàm nhiều hàm trừu tượng

		// + Anonymous function
		// --> có duy nhất 1 hàm trừu tượng
	}
}

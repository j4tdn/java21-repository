package view.inheritance.abstractclass;

public class InheritanceAbstractDemo {
	
	public static void main(String[] args) {
		EmailService es1 = new EmailService() {
			
			@Override
			void login() {
				System.out.println("login");
				
			}
		};
		es1.login();
		
		/*
		 	Để tạo 1 đối tượng cho biến KDL interface
		 	Dùng
		 	 + External class
		 	 + Anonymous function
		 	 --> Có thể có 1 hàm nhiều hàm trừu tượng
		 */
	}
}

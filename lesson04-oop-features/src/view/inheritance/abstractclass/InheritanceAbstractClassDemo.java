package view.inheritance.abstractclass;

public class InheritanceAbstractClassDemo {
	public static void main(String[] args) {
		
		// Anonymous class
		EmailService es =  new EmailService() {
			
			@Override
			void login() {
				System.out.println("Anonymous class");
			}

			@Override
			void logout() {
				// TODO Auto-generated method stub
				
			}
		};
		es.login();
		
		//
	}
}

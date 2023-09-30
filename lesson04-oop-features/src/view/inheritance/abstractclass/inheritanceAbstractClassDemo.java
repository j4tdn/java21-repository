package view.inheritance.abstractclass;

public class inheritanceAbstractClassDemo {
	public static void main(String[] args) {
		EmailService es = new EmailService() {

			// Anonymout class
			@Override
			void login() {
				System.out.println("login");
			}
		};
	}
}

package view.inhertance.astrastclass;

public class inheritanceAbstractclassDemo {
	public static void main(String[] args) {

		// Anorymous function
		EmailService es = new EmailService() {

			@Override
			void login() {
				System.out.println("login");

			}
		};
		es.login();
	}
}

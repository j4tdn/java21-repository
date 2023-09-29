package view.inheritance.abstractclass;

public abstract class EmailService {
	
	abstract void login();
	
	void login2Steps() {
		System.out.println("Email Service --> login2Steps");
	}
}

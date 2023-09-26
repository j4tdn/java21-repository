package view.inheritance.abstractclass;

public abstract class EmailService {
	
	// modifier : default
	abstract void login();
	
	void login2Steps() {
		System.out.println("EmailService --> login2Steps");
	}
}

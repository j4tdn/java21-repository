package view.inheritance.abstractclass;

public abstract class EmailService {

	abstract void login();
	
	void login2step() {
		System.out.println("EmailService --> login2Steps");
	}
	
}

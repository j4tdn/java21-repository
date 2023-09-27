package view.inheritance.abstractclass;

public abstract class EmailService {
	
	//phạm vi: package
	abstract void login();
	
	void login2Steps() {
		System.out.println("EmailService --> login2Steps");
	}
	
}

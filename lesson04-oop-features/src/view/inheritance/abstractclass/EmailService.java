package view.inheritance.abstractclass;

public abstract class EmailService {
	
	// Access modifier : default <=> abstract class như một cái class 
	abstract void login();
	
	void login2Steps() {
		System.out.println("EmailService --> login2Step");
	}
}

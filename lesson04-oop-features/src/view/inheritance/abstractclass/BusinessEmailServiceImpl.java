package view.inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService{

	@Override
	void login() {
		System.out.println("BusinessEmailService --> login");
	}
	
	@Override
	void login2Steps() {
		System.out.println("BusinessEmailServiceImpls --> login2Step");
	}

}

package view.inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl  --> login");
	}
	
	@Override
	void login2Steps() {
		System.out.println("BusinessEmailServiceImpl  --> login2Steps");
	}

	@Override
	void logout() {
		// TODO Auto-generated method stub
		
	}
}

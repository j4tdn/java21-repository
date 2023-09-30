package view.inheritance.abstractclass;

public class BusinessEmailVerviceImpl extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailVerviceImpl ---> login");
		
	}
	@Override
	void login2Step() {
		
		super.login2Step();
	}
	
	

}

package view.inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService{
	
	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl --> login");
	}
	
	@Override
	void login2Step() {
		System.out.println("BusinessEmailServiceImpl --> login2Step");
	}

}

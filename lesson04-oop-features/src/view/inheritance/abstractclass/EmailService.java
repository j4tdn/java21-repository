package view.inheritance.abstractclass;
 //hàm trừu tượng thêm từ khóa abstract, chỉ được sử dụng trong package khác với implent
public abstract class EmailService {
	
	 abstract void login();
	
	void login2Steps() {
		System.out.println("EmailService --> login2Steps");
	}
}

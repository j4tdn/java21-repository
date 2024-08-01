package view;

import service.CustomerService;
import service.CustomerServiceImpl;

public class Ex05CustomerView {
	
	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImpl();
	}
	
	public static void main(String[] args) {
		// Customer newCustomer = new Customer(null, 
		// 		"Đỗ Văn An", "dva@gmail.com", "Liên Chiểu", 
		// 		"0345148728", "dvnusn", "LTgt&*12^^");
		
		// customerService.save(newCustomer); // saveOrUpdate || merge
		
		System.out.println("Test Login 1 --> " + customerService.login("123abc", "hhuhuhuhu"));
		
		System.out.println("Test Login 2 --> " + customerService.login("dvnusn", "1215185484"));
		
		System.out.println("Test Login 3 --> " + customerService.login("dvnusn", "LTgt&*12^^"));
		
		System.out.println("======== DONE ========");
	}
	
}

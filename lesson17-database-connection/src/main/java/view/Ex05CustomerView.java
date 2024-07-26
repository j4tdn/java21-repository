package view;

import persistence.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class Ex05CustomerView {
	
	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImpl();
	}
	
	public static void main(String[] args) {
		Customer newCustomer = new Customer(null, 
				"Đỗ Văn An", "dva@gmail.com", "Liên Chiểu", 
				"0345148728", "dvnusn", "LTgt&*12^^");
		
		customerService.save(newCustomer);
		
		System.out.println("======== DONE ========");
	}
	
}

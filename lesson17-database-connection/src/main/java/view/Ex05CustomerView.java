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
		Customer customer = new Customer(null, "Đỗ Văn An",
				"dva@gmail.com", "Liên Chiểu",
				"0123456789", "dvausn", "123456");
		
//		customerService.save(customer); // saveOrUpdate || merge
		
		System.out.println("Test Login 1 --> " + customerService.login("maymay229", "thanhvuqt48"));
		System.out.println("Test Login 1 --> " + customerService.login("dvausn", "123456"));
		System.out.println("Test Login 1 --> " + customerService.login("dvausn", "123456"));
		
		System.out.println("================ DONE ==================");
	}
}

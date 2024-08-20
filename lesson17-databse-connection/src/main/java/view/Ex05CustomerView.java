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
				"Võ Văn Tâm", "tamoc@gmail.com", "Hải Châu", 
				"045493534", "vvtusn", "SIJH!@2YA");
		
		// customerService.save(newCustomer);
		
		System.out.println("Test login 1 --> " + customerService.login("safsdf", "sdfdsafdsafs"));
		System.out.println("Test login 2 --> " + customerService.login("vvtusn", "sdfdsafdsafs"));
		System.out.println("Test login 3 --> " + customerService.login("vvtusn", "SIJH!@2YA"));
		
		System.out.println("==================== DONE =========================");
	}
}

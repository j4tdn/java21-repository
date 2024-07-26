package service;

import persistence.Customer;

public interface CustomerService {
	
	/**
	 * Add new customer
	 * 
	 * @param customer {@link Customer}
	 */
	void save(Customer customer);
	
}

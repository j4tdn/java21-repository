package dao;

import persistence.Customer;

public interface CustomerDao {

	/**
	 * Add new customer
	 * 
	 * @param customer {@link Customer}
	 */
	void save(Customer customer);
	
}

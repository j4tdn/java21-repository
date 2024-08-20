package dao;

import persistence.Customer;

public interface CustomerDao {
	
	/**
	 * Add new customer
	 * 
	 * @param customer {@link Customer}
	 */
	void save(Customer customer);
	
	/*
	 * Test loin function
	 * 
	 * @param username username
	 * @param password password
	 * @return {@link Customer} if exists account
	 */
	Customer login(String username, String password);
}

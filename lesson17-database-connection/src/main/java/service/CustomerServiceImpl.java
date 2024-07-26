package service;

import java.util.Objects;

import dao.CustomerDao;
import dao.JdbcCustomerDao;
import persistence.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao = new JdbcCustomerDao();
	}
	
	@Override
	public void save(Customer customer) {
		Objects.requireNonNull(customer);
		customerDao.save(customer);
	}
	
}

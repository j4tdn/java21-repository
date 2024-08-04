package dao;

import java.sql.SQLException;

import persistence.Customer;
import utils.SqlUtils;

public class JdbcCustomerDao extends GenericDao implements CustomerDao{

	private static final String INSERT_CUSTOMER = ""
			+ "INSERT INTO t11_customer(\n"
			+ "	C11_CUSTOMER_NAME, C11_CUSTOMER_EMAIL, C11_CUSTOMER_ADDRESS, \n"
			+ "    C11_CUSTOMER_PHONE, C11_CUSTOMER_USERNAME, C11_CUSTOMER_PASSWORD)\n"
			+ "VALUES(?, ?, ?, ?, ?, ?)";
	
	
	@Override
	public void save(Customer customer) {
		
		// ~!@#WERT --> encode("~!@#WERT") --> qưertyuiiertyuirtyuio
		
		try {
			pst = connection.prepareStatement(INSERT_CUSTOMER);
			pst.setString(1, customer.getName());
			pst.setString(2, customer.getEmail());
			pst.setString(3, customer.getAddress());
			pst.setString(4, customer.getPhone());
			pst.setString(5, customer.getUsername());
			pst.setString(6, SqlUtils.md5(customer.getPassword()));
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("We found errors when save new customer: " + e.getMessage());
		} finally {
			SqlUtils.close(pst);
		}
	}
	@Override
	public Customer login(String username, String password) {
		// TODO Auto-generated method stub
		return getElement(password, null, null);
	}
	
	
}

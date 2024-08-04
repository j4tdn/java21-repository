package transformer;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistence.Customer;
import persistence.Item;

public class CustomerTransformer {
	
	private CustomerTransformer() {
	}
	
	public static Item transformItem(ResultSet rs) {
		Customer customer = Customer.of();
		try {
			return customer
					.withId(rs.getInt(Customer.PROP_ID))
					.withName(rs.getString(Customer.PROP_NAME))
					.withEmail(rs.getString(Customer.PROP_EMAIL))
					.withAddress(rs.getString(Customer.PROP_ADDRESS))
					.withBuyPhone(rs.getBigDecimal(Customer.PROP_PHONE));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	
}
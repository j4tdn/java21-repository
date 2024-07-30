package transformer;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistence.Customer;
import persistence.Item;
import persistence.ItemGroup;

public class CustomerTransformer {

	private CustomerTransformer() {
		
	}
	
	public static Customer transform(ResultSet rs) {
		Customer item = Customer.of();
		try {
			return item
					.withId(rs.getInt(Customer.PROP_ID))
					.withName(rs.getString(Customer.PROP_NAME))
					.withEmail(rs.getString(Customer.PROP_EMAIL))
					.withAddress(rs.getString(Customer.PROP_ADDRESS))
					.withPhone(rs.getString(Customer.PROP_PHONE));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}
	
}

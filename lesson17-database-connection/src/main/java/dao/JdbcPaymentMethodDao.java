package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.PaymentMethod;
import utils.SqlUtils;

public class JdbcPaymentMethodDao extends GenericDao implements PaymentMethodDao{
	
	
	private static final String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT C04_PMETHOD_ID " + PaymentMethod.PROP_ID + ", \n"
			       + "C04_PMETHOD_DESC " + PaymentMethod.PROP_DESCRIPTION + " \n"
			 + "FROM t04_payment_method";
	
	

	@Override
	public List<PaymentMethod> getAll() {
		return getElements(GET_ALL_ITEM_GROUPS, () -> {
			try {
				return new PaymentMethod(
						rs.getInt(PaymentMethod.PROP_ID),
						rs.getString(PaymentMethod.PROP_DESCRIPTION)
						);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		});
	}

}

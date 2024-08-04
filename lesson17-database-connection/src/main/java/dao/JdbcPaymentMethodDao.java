package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import persistence.PaymentMethod;

public class JdbcPaymentMethodDao extends GenericDao implements PaymentMethodDao {

	private static final String GET_ALL_PAYMENT_METHODS = "" 
			+ "SELECT C04_PMETHOD_ID "   + PaymentMethod.PROP_ID + " ,\n"
			+ "       C04_PMETHOD_DESC " + PaymentMethod.PROP_DESCRIPTION + "\n" 
			+ "  FROM t04_payment_method";

	@Override
	public List<PaymentMethod> getAll() {
		return getElements(GET_ALL_PAYMENT_METHODS, this::transform);
	}
	
	private PaymentMethod transform(ResultSet rs) {
		PaymentMethod pmethod = null;
		try {
			pmethod = new PaymentMethod(rs.getInt(PaymentMethod.PROP_ID), rs.getString(PaymentMethod.PROP_DESCRIPTION));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pmethod;
	}

}
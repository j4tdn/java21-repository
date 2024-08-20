package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.entities.PaymentMethod;

public class HibernatePaymentMethod extends GenericDao implements PaymentMethodDao {
	
	private static final String GET_ALL_PAYMENT_METHOD = ""
			+ "SELECT * FROM t04_payment_method";
	
	@Override
	public List<PaymentMethod> getAll() {
		return getElementsWithTransaction(GET_ALL_PAYMENT_METHOD, PaymentMethod.class);
	}

}

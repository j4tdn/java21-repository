package service;

import java.util.List;

import dao.JdbcPaymentMethodDao;
import dao.PaymentMethodDao;
import persistence.PaymentMethod;

public class PaymentMethodServiceImpl implements PaymentMethodService {
	
	private PaymentMethodDao paymentMethodDao;
	
	public PaymentMethodServiceImpl() {
		paymentMethodDao = new JdbcPaymentMethodDao();
	}

	@Override
	public List<PaymentMethod> getAll() {
		return paymentMethodDao.getAll();
	}
	
}
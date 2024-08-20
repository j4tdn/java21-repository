package service;

import java.util.List;

import dao.HibernatePaymentMethod;
import dao.PaymentMethodDao;
import persistence.entities.PaymentMethod;

public class PaymentMethodServiceImpl implements PaymentMethodService {
	
	private PaymentMethodDao paymentMethodDao;
	
	public PaymentMethodServiceImpl() {
		paymentMethodDao = new HibernatePaymentMethod();
	}

	@Override
	public List<PaymentMethod> getAll() {
		return paymentMethodDao.getAll();
	}

}

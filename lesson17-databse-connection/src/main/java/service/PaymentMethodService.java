package service;

import java.util.List;

import persistence.PaymentMethod;

public interface PaymentMethodService {
	
	/**
	 * Get all payment method
	 * 
	 * @return list of {@link PaymentMethod}
	 */
	List<PaymentMethod> getAll();
	
}

package service;

import java.util.List;

import persistence.PaymentMethod;

public interface PaymentMethodService {

	/**
	 * Get all item groups
	 * 
	 * @return list of {@link PaymentMethod}
	 */
	List<PaymentMethod> getAll();
}

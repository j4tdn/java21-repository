package dao;

import java.util.List;

import persistence.PaymentMethod;

public interface PaymentMethodDao {

	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link PaymentMethod}
	 */
	List<PaymentMethod> getAll();

}

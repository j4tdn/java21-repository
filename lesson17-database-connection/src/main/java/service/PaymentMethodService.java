package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.PaymentMethod;

public interface PaymentMethodService {
	
	/**
	 * Get all item groups.
	 * @return list {@link ItemGroup}
	 */
	List<PaymentMethod> getAll();
	
}

package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.PaymentMethod;

public interface PaymentMethodDao {
	
	/**
	 * Get all item groups.
	 * @return list {@link ItemGroup}
	 */
	List<PaymentMethod> getAll();
	
}

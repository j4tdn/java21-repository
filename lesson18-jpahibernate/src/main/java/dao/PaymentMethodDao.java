package dao;

import java.util.List;

import persistence.entities.PaymentMethod;

public interface PaymentMethodDao {

	List<PaymentMethod> getAll();
	
}

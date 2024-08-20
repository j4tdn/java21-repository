package service;

import java.util.List;

import persistence.entities.PaymentMethod;

public interface PaymentMethodService {
	
	List<PaymentMethod> getAll();
	
}

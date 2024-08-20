package service;

import java.util.List;

import persistence.entities.OrderDetail;

public interface OrderDetailService {
	
	List<OrderDetail> getAll();
	
}
package dao;

import java.util.List;

import persistence.entities.OrderDetail;

public interface OrderDetailDao {
	
	List<OrderDetail> getAll();
	
}
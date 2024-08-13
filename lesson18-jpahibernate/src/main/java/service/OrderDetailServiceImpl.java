package service;

import java.util.List;

import dao.HibernateOrderDetailDao;
import dao.OrderDetailDao;
import persistence.entities.OrderDetail;

public class OrderDetailServiceImpl implements OrderDetailService {
	
	private OrderDetailDao orderDetailDao;
	
	public OrderDetailServiceImpl() {
		orderDetailDao = new HibernateOrderDetailDao();
	}
	
	@Override
	public List<OrderDetail> getAll() {
		return orderDetailDao.getAll();
	}
	
}

package service;

import java.util.List;

import dao.HibernateOrderDetailDao;
import dao.OrderDetailDao;
import entity.OrderDetail;

public class OrderDetailServiceIplm implements OrderDetailService{
	
	private OrderDetailDao orderDetailDao;
	
	public OrderDetailServiceIplm() {
		orderDetailDao = new HibernateOrderDetailDao();
	}

	@Override
	public List<OrderDetail> getAll() {
		return orderDetailDao.getAll();
	}

}

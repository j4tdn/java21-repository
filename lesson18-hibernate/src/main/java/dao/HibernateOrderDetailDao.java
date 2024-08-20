package dao;

import java.util.List;

import dao.base.GenericDao;
import entity.OrderDetail;

public class HibernateOrderDetailDao extends GenericDao implements OrderDetailDao {
	
	private static final String GET_ALL_ORDER_DETAIL = ""
			+ "SELECT * FROM t14_order_detail";

	@Override
	public List<OrderDetail> getAll() {
		return getElementsWithTransaction(GET_ALL_ORDER_DETAIL, OrderDetail.class);
	}

}

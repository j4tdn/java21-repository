package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.entities.Item;

public class HibernateItemDao extends GenericDao implements ItemDao{

	private static final String Q_GET_ALL = ""
			+ "SELECT * FROM t01_item";
	
	@Override
	public List<Item> getAll() {
		return getElementsWithTransaction(Q_GET_ALL, Item.class);
	}
	
}

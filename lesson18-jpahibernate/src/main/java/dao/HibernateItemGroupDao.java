package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import dao.base.GenericDao;
import persistence.entities.ItemGroup;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao{

	private static final String GET_ALL_ITEM_GROUP = ""
			+ "SELECT * FROM t02_item_group";
	
	public List<ItemGroup> getAll() {
		return openSession()
		             .createNativeQuery(GET_ALL_ITEM_GROUP, getEntityClass())
		             .getResultList();
	}
	
	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
	
}

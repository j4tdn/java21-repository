package dao;

import java.util.List;

import dao.base.GenericDao;
import entity.Item;

public class HibernateItemDao extends GenericDao implements ItemDao{
	
	// native query: viết query ở ngôn ngữ 
	// jpql query: java persistence query language: viết query dưới dạng entity => jpahibernate tự mapping
	// name query
	
	private static final String Q_GET_ALL = ""
			+ "SELECT * FROM t01_item";
	
	@Override
	public List<Item> getAll() {
		 return openSession()
				 .createNativeQuery(Q_GET_ALL, Item.class)
				 .getResultList();
		
	}

}
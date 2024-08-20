package dao;

import java.time.LocalDate;
import java.util.List;

import dao.base.GenericDao;
import persistence.entities.Item;
import utils.DateUtils;

public class HibernateItemDao extends GenericDao implements ItemDao {

	private static final String GET_ITEMS_BY_CREATED_TIME = ""
			+ "SELECT * FROM t01_item\n"
			+ "WHERE cast(C01_ITEM_CREATED_TIME AS DATE) = :time"
			+ "ORDER BY C01_ITEM_ID ASC";
			
	
	@Override
	public List<Item> getItemByCreatedTime(LocalDate created_time) {
		return openSession().createNativeQuery(GET_ITEMS_BY_CREATED_TIME, Item.class)
				.setParameter("time", DateUtils.toSqlDate(created_time))
				.getResultList();
	}

}

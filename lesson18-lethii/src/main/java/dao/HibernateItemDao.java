package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateType;
import org.hibernate.type.StringType;

import dao.base.GenericDao;
import persistence.dto.ItemDto;
import persistence.entities.Item;

public class HibernateItemDao extends GenericDao implements ItemDao {
	private static final String GET_ITEMS = ""
			+ "SELECT *\n"
			+ "  FROM item it\n"
			+ "  JOIN item_group ig\n"
			+ "    ON it.ITEM_GROUP_ID = ig.ID\n"
			+ "  ORDER BY it.ITEM_GROUP_ID";
	
	private static final String GET_ITEMS_BY_CREATED_AT = ""
			 + "SELECT i.C01_ITEM_ID AS " + ItemDto.PROP_IT_ID + ", "
			    + "       i.C01_ITEM_NAME AS " + ItemDto.PROP_IT_NAME + ", "
			    + "       o.C03_ORDER_TIME AS " + ItemDto.PROP_DATE + "\n"
			    + "FROM t01_item i\n"
			    + "JOIN t03_order o ON i.C01_ITEM_ID = o.C03_ITEM_ID\n"
			    + "WHERE DATE(o.C03_ORDER_TIME) = :date \n"
			    + "ORDER BY o.C03_ORDER_TIME DESC, i.C01_ITEM_ID ASC;";

	@Override
	public List<Item> getItem() {
		return openSession()
				.createNativeQuery(GET_ITEMS, Item.class)
				.getResultList();
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemDto> getItemByCreateTime(String date) {
		return openSession().createNativeQuery(GET_ITEMS_BY_CREATED_AT)
	            .addScalar(ItemDto.PROP_IT_ID, IntegerType.INSTANCE)
	            .addScalar(ItemDto.PROP_IT_NAME, StringType.INSTANCE)
	            .addScalar(ItemDto.PROP_DATE, LocalDateType.INSTANCE)
	            .setResultTransformer(Transformers.aliasToBean(ItemDto.class))
	            .setParameter("date", date)
	            .getResultList();
	}

}
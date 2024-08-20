package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;

import org.hibernate.type.StringType;

import dao.template.AbstractHibernateDao;
import dto.ItemDto;
import persistence.item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {
	private static final String GET_ITEMS = "SELECT ig.ID id, ig.NAME `name`, sum(itd.AMOUNT) amount_of_items\r\n"
			+ "  FROM item it\r\n"
			+ "  JOIN item_group ig\r\n"
			+ "    ON ig.ID = it.ITEM_GROUP_ID\r\n"
			+ "  JOIN item_detail itd\r\n"
			+ "    ON it.ID = itd.ITEM_ID\r\n"
			+ " GROUP BY ig.ID;";
	private static final String GET_ALL_ITEMS = " SELECT *\r\n"
			+ "  FROM item it\r\n"
			+ "  JOIN item_group ig\r\n"
			+ "    ON it.ITEM_GROUP_ID = ig.ID\r\n"
			+ "  ORDER BY it.ITEM_GROUP_ID";
	private static final String GET_ALL_NAME_ITEMS = "  SELECT it.ID AS ITEM_ID, it.NAME AS ITEM_NAME, SUM(ordd.AMOUNT) AS AMOUNT\r\n"
			+ "FROM item it\r\n"
			+ "	JOIN  item_detail itd\r\n"
			+ "	ON itd.ITEM_ID = it.ID\r\n"
			+ "    JOIN order_detail ordd\r\n"
			+ "    ON ordd.ITEM_DETAIL_ID = itd.ID\r\n"
			+ "GROUP BY itd.ITEM_ID\r\n"
			+ "ORDER BY AMOUNT DESC\r\n"
			+ "LIMIT 3;";
	@SuppressWarnings("unchecked")
	public List<ItemDto> get() {
		NativeQuery<?> query =  openSession().createNativeQuery(GET_ITEMS);
		query.addScalar("id",IntegerType.INSTANCE)
				.addScalar("name",StringType.INSTANCE)
				.addScalar("amount_of_items",StringType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class));
		return (List<ItemDto>) query.getResultList();
	}
	@Override
	public List<item> getAllItem() {
		// TODO Auto-generated method stub
		return (List<item>)openSession().createNativeQuery(GET_ALL_ITEMS,item.class).getResultList();
	}
	@Override
	public List<String> getNameItems() {
		List<String> name = new ArrayList<>();
		openSession().doWork(connection->{
			PreparedStatement pst = connection.prepareStatement(GET_ALL_NAME_ITEMS);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				name.add(rs.getString(0));
			}	
			rs.close();
			pst.close();
		});
		return name;
	}
	
}
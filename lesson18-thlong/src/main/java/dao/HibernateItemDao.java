package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;

import persistance.dto.ItemDTO;
import persistance.dto.ItemOrderDTO;
import persistance.dto.ItemSoldAmountDTO;

public class HibernateItemDao extends GenericDao implements ItemDao {
	
	public static final String Q_GET_ITEM_SOLD_BY_DATE = "SELECT DISTINCT it.C01_ITEM_ID " + ItemOrderDTO.PROP_ID + " , \r\n"
			+ "		it.C01_ITEM_NAME "+ItemOrderDTO.PROP_ITEM_NAME+", \r\n"
			+ "        TIME(od.C03_ORDER_TIME) "+ItemOrderDTO.PROP_TIME+"\r\n"
			+ "FROM t03_order od \r\n"
			+ "JOIN t14_order_detail odd ON od.C03_ORDER_ID = odd.C14_ORDER_ID\r\n"
			+ "JOIN t12_item_detail itd ON itd.C12_ITEM_DETAIL_ID = odd.C14_ITEM_DETAIL_ID\r\n"
			+ "JOIN t06_size s ON itd.C12_SIZE_ID = s.C06_SIZE_ID\r\n"
			+ "JOIN t01_item it ON it.C01_ITEM_ID = itd.C12_ITEM_ID\r\n"
			+ "WHERE DATE(od.C03_ORDER_TIME) = :date \r\n"
			+ "ORDER BY " + ItemOrderDTO.PROP_ID + " ASC ,\r\n"
			+ "		" + ItemOrderDTO.PROP_TIME + " DESC,\r\n"
			+ "        " + ItemOrderDTO.PROP_ITEM_NAME + " ASC";
	
	private static final String Q_GET_ITEM_SALE_TOP_THREE_BY_YEAR = "SELECT it.C01_ITEM_NAME\r\n"
			+ "FROM t03_order od \r\n"
			+ "JOIN t14_order_detail odd ON od.C03_ORDER_ID = odd.C14_ORDER_ID\r\n"
			+ "JOIN t12_item_detail itd ON itd.C12_ITEM_DETAIL_ID = odd.C14_ITEM_DETAIL_ID\r\n"
			+ "JOIN t06_size s ON itd.C12_SIZE_ID = s.C06_SIZE_ID\r\n"
			+ "JOIN t01_item it ON it.C01_ITEM_ID = itd.C12_ITEM_ID\r\n"
			+ "WHERE YEAR(od.C03_ORDER_TIME) = :year\r\n"
			+ "GROUP BY it.C01_ITEM_ID \r\n"
			+ "ORDER BY SUM(odd.C14_AMOUNT) DESC, it.C01_ITEM_ID DESC\r\n"
			+ "LIMIT 3";
	
	private static final String Q_GET_ITEM = "SELECT it.C01_ITEM_ID,\r\n"
			+ "		it.C01_ITEM_NAME,\r\n"
			+ "        s.C06_SIZE_NAME,\r\n"
			+ "        mt.C16_NAME,\r\n"
			+ "        it.C01_IMAGE_01,\r\n"
			+ "        it.C01_IMAGE_02,\r\n"
			+ "        it.C01_LAST_UPDATED_AT,\r\n"
			+ "        itg.C02_ITEM_GROUP_ID,\r\n"
			+ "        pv.C17_PROVIDER_ID,\r\n"
			+ "        itg.C02_ITEM_GROUP_NAME\r\n"
			+ "FROM t01_item it \r\n"
			+ "JOIN t02_item_group itg ON it.C01_ITEM_ID = itg.C02_ITEM_GROUP_ID\r\n"
			+ "JOIN t12_item_detail itdt ON it.C01_ITEM_ID = itdt.C12_ITEM_ID\r\n"
			+ "JOIN t06_size s ON s.C06_SIZE_ID = itdt.C12_SIZE_ID\r\n"
			+ "JOIN t16_material mt ON it.C01_MATERIAL_ID = mt.C16_MATERIAL_ID\r\n"
			+ "JOIN t17_provider pv ON it.C01_PROVIDER_ID = pv.C17_PROVIDER_ID";
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemOrderDTO> getItemSoldByDate(String date) {
		return safeList(openSession().createNativeQuery(Q_GET_ITEM_SOLD_BY_DATE).setParameter("date", date)
				.addScalar(ItemOrderDTO.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemOrderDTO.PROP_ITEM_NAME, StringType.INSTANCE)
				.addScalar(ItemOrderDTO.PROP_TIME, LocalTimeType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemOrderDTO.class))
				.getResultList());
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getItemSaleTopThreeByYear(Integer year) {
		return openSession().createNativeQuery(Q_GET_ITEM_SALE_TOP_THREE_BY_YEAR).setParameter("year", year)
				.getResultList();
	}
	
	@Override
	public List<ItemDTO> getItem() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

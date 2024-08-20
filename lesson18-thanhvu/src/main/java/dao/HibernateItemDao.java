package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;

import dao.base.GenericDao;
import persistence.dto.ItemDto;
import persistence.dto.ItemGroupDto;
import persistence.dto.ItemStatisticDto;

public class HibernateItemDao extends GenericDao implements ItemDao{
	
	private static final String Q_GET_ITEMS_BY_SALES_DATE = ""
			+ "SELECT t1.C01_ITEM_ID " + ItemDto.PROP_ID +",\n"
			+ "       t1.C01_ITEM_NAME " + ItemDto.PROP_NAME + ",\n"
			+ "       time(t3.C03_ORDER_TIME) " + ItemDto.PROP_CREATED_AT + "\n"
			+ "  FROM t01_item t1\n"
			+ "  JOIN t12_item_detail t12\n"
			+ "    ON t1.C01_ITEM_ID = t12.C12_ITEM_ID\n"
			+ "	 JOIN t14_order_detail t14\n"
			+ "	   ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID\n"
			+ "  JOIN t03_order t3\n"
			+ "    ON t3.C03_ORDER_ID = t14.C14_ORDER_ID\n"
			+ " WHERE date(t3.C03_ORDER_TIME) = :salesDate\n"
			+ " ORDER BY t3.C03_ORDER_TIME desc, t1.C01_ITEM_ID asc";
	
	private static final String Q_STATISTIC_ITEM_IN_SHOPPING = ""
			+ "SELECT t1.C01_ITEM_ID " + ItemStatisticDto.PROP_IT_ID + ",\n"
			+ "	      t1.C01_ITEM_NAME " + ItemStatisticDto.PROP_IT_NAME +",\n"
			+ "	      sum(t12.C12_AMOUNT) " + ItemStatisticDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "  FROM t01_item t1\r\n"
			+ "  JOIN t12_item_detail t12 \n"
			+ "    ON t1.C01_ITEM_ID = t12.C12_ITEM_ID\n"
			+ " GROUP BY t1.C01_ITEM_ID, t1.C01_ITEM_NAME";
	
	private static final String Q_TOP_3_BEST_SELL_BY_YEAR = ""
			+ "SELECT t1.C01_ITEM_NAME\n"
			+ "  FROM t03_order t3\n"
			+ "  JOIN t14_order_detail t14\n"
			+ "	ON t3.C03_ORDER_ID = t14.C14_ORDER_ID\n"
			+ "  JOIN t12_item_detail t12\n"
			+ "    ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID\n"
			+ "  JOIN t01_item t1\n"
			+ "	ON t1.C01_ITEM_ID = t12.C12_ITEM_ID\n"
			+ " WHERE year(t3.C03_ORDER_TIME) = :year\n"
			+ " GROUP BY t1.C01_ITEM_ID, t1.C01_ITEM_NAME\n"
			+ " ORDER BY sum(t14.C14_AMOUNT) desc, t1.C01_ITEM_ID desc\n"
			+ " LIMIT 3";
	
	private static final String Q_GET_ITEMS_OF_ITEM_GROUP = ""
			+ "SELECT t1.C01_ITEM_ID " + ItemGroupDto.PROP_IT_ID + ",\n"
			+ "       t1.C01_ITEM_NAME " + ItemGroupDto.PROP_IT_NAME + ",\n"
			+ "	      t12.C12_COLOR " + ItemGroupDto.PROP_IT_COLOR + ",\n"
			+ "       t2.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_IG_ID + ",\n"
			+ "       t2.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_IG_NAME + "\n"
			+ "  FROM t02_item_group t2\n"
			+ "  JOIN t01_item t1\n"
			+ "    ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\n"
			+ "  JOIN t12_item_detail t12\n"
			+ "    ON t12.C12_ITEM_ID = t1.C01_ITEM_ID";
		    
			  
	@Override
	public List<ItemDto> getItemsBySalesDate(LocalDate salesDate) {
		return openSession().createNativeQuery(Q_GET_ITEMS_BY_SALES_DATE)
				.addScalar(ItemDto.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemDto.PROP_NAME, StringType.INSTANCE)
				.addScalar(ItemDto.PROP_CREATED_AT, LocalTimeType.INSTANCE)
				.setParameter("salesDate", salesDate, LocalDateType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class)).getResultList();
	}
	
	@Override
	public List<ItemStatisticDto> getItemsInWarehouse() {
		return openSession().createNativeQuery(Q_STATISTIC_ITEM_IN_SHOPPING)
				.addScalar(ItemStatisticDto.PROP_IT_ID, IntegerType.INSTANCE)
				.addScalar(ItemStatisticDto.PROP_IT_NAME, StringType.INSTANCE)
				.addScalar(ItemStatisticDto.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemStatisticDto.class)).getResultList();
	}
	
	@Override
	public List<String> getTop3ItemSaleByYear(int year) {
		return openSession()
		        .createNativeQuery(Q_TOP_3_BEST_SELL_BY_YEAR)
		        .setParameter("year", year)
		        .getResultList();
	}
	
	@Override
	public List<ItemGroupDto> getItemsOfItemGroup() {
		return openSession().createNativeQuery(Q_GET_ITEMS_OF_ITEM_GROUP)
				.addScalar(ItemGroupDto.PROP_IT_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IT_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IT_COLOR, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
				.getResultList();
	}

}
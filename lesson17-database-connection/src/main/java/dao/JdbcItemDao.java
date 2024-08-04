package dao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import transformer.ItemTransformer;
import utils.DateUtils;

public class JdbcItemDao extends GenericDao implements ItemDao{

	private static final String GET_ALL_ITEMS = ""
			+ "SELECT t1.C01_ITEM_ID         " + Item.PROP_ID         + ","
			+ "       t1.C01_ITEM_NAME       " + Item.PROP_NAME       + ","
			+ "       t1.C01_BUY_PRICE       " + Item.PROP_BUY_PRICE  + ","
			+ "       t2.C02_ITEM_GROUP_ID   " + Item.PROP_GROUP_ID   + ","
			+ "       t2.C02_ITEM_GROUP_NAME " + Item.PROP_GROUP_NAME
			+ "  FROM t01_item t1"
			+ "  JOIN t02_item_group t2"
			+ "    ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID";
	
	private static final String GET_ITEMS_BY_SALES_DATE = ""
			+ "WITH cte_sales_item_ids AS (\n"
			+ "	SELECT DISTINCT t12.C12_ITEM_ID ITEM_ID\n"
			+ "      FROM t12_item_detail t12\n"
			+ "	  JOIN t14_order_detail t14\n"
			+ "        ON t12.C12_ITEM_DETAIL_ID = t14.C14_ITEM_DETAIL_ID\n"
			+ "	  JOIN t03_order t03\n"
			+ "        ON t03.C03_ORDER_ID = t14.C14_ORDER_ID\n"
			+ "    WHERE cast(t03.C03_ORDER_TIME AS DATE) = ?\n"
			+ ")\n"
			+ "SELECT t01.C01_ITEM_ID         " + Item.PROP_ID         + ","
			+ "       t01.C01_ITEM_NAME       " + Item.PROP_NAME       + ","
			+ "       t01.C01_BUY_PRICE       " + Item.PROP_BUY_PRICE
			+ "  FROM t01_item t01\n"
			+ "  WHERE EXISTS (SELECT 1\n"
			+ "                  FROM cte_sales_item_ids cte\n"
			+ "                  WHERE t01.C01_ITEM_ID = cte.ITEM_ID)";
	
	@Override
	public List<Item> getAll() {
		return getElements(
			GET_ALL_ITEMS, 
			ItemTransformer::transformItemWithGroup
		);
	}
	
	@Override
	public List<Item> getItemsBySalesDate(LocalDate salesDate) {
		return getElements(
			GET_ITEMS_BY_SALES_DATE,
			ItemTransformer::transformItem,
			(pst) -> {
				try {
					pst.setDate(1, DateUtils.toSqlDate(salesDate));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		);
	}
	
	
}
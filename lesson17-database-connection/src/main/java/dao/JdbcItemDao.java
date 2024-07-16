package dao;

import java.sql.SQLException;
import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import transformer.ItemTransformer;

public class JdbcItemDao extends GenericDao implements ItemDao{

	private static final String GET_ALL_ITEMS = ""
			+ "SELECT t1.C01_ITEM_ID         " + Item.PROP_ID        + ","
			+ "       t1.C01_ITEM_NAME       " + Item.PROP_NAME      + ","
			+ "       t1.C01_BUY_PRICE       " + Item.PROP_BUY_PRICE + ","
			+ "       t2.C02_ITEM_GROUP_ID   " + Item.PROP_GROUP_ID  + ","
			+ "       t2.C02_ITEM_GROUP_NAME " + Item.PROP_GROUP_NAME 
 			+ "  FROM t01_item t1"
 			+ "  JOIN t02_item_group t2"
 			+ "    ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID";
	
	@Override
	public List<Item> getAll() {
		return getElements(GET_ALL_ITEMS, () -> ItemTransformer.transform(rs));
	}

}

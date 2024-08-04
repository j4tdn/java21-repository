package dao;

import java.sql.SQLException;
import java.util.List;

import persistence.ItemGroup;
import transformer.ItemGroupTransformer;

public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao {
	
	private static final String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT C02_ITEM_GROUP_ID " + ItemGroup.PROP_ID + ", \n"
			+ "       C02_ITEM_GROUP_NAME " + ItemGroup.PROP_NAME + "\n"
			+ "  FROM t02_item_group";
	
	private static final String GET_ITEM_GROUP_BY_ID = ""
			+ "SELECT C02_ITEM_GROUP_ID " + ItemGroup.PROP_ID + ", \n"
			+ "       C02_ITEM_GROUP_NAME " + ItemGroup.PROP_NAME + "\n"
			+ "  FROM t02_item_group\n"
			+ " WHERE C02_ITEM_GROUP_ID = ?";
	@Override
	public List<ItemGroup> getAll() {
		return getElements(GET_ALL_ITEM_GROUPS, ItemGroupTransformer::transformItemGroup);
	}
	
	@Override
	public ItemGroup get(int id) {
		return getElement(GET_ITEM_GROUP_BY_ID, ItemGroupTransformer::transformItemGroup, (pst)->{
			try {
				pst.setInt(1, id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}
	
	
}

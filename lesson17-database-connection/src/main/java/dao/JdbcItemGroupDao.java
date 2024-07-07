package dao;

import java.sql.SQLException;
import java.util.List;

import persistence.ItemGroup;

public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao {
	
	private static final String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT C02_ITEM_GROUP_ID " + ItemGroup.PROP_ID + ", \n"
			+ "       C02_ITEM_GROUP_NAME " + ItemGroup.PROP_NAME + "\n"
			+ "  FROM t02_item_group";
	
	@Override
	public List<ItemGroup> getAll() {
		return getElements(GET_ALL_ITEM_GROUPS, () -> transform());
	}
	
	private ItemGroup transform() {
		ItemGroup group = null;
		try {
			group = new ItemGroup(rs.getInt(ItemGroup.PROP_ID), rs.getString(ItemGroup.PROP_NAME));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return group;
	}

}

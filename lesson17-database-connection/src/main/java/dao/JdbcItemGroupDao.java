package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao{

	
	private static final String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT C02_ITEM_GROUP_ID " + ItemGroup.PROP_ID + ", \n"
			       + "C02_ITEM_GROUP_NAME " + ItemGroup.PROP_NAME + " \n"
			 + "FROM t02_item_group";
	

	@Override
	public List<ItemGroup> getAll() {
		return getElements(GET_ALL_ITEM_GROUPS, () -> {
				try {
					return new ItemGroup(
							rs.getInt(ItemGroup.PROP_ID),
							rs.getString(ItemGroup.PROP_NAME)
							);
				} catch (SQLException e) {
					e.printStackTrace();
					return null;
				}
		});
	}
	
	
}

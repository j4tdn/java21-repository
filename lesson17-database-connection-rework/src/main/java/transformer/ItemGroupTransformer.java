package transformer;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistence.ItemGroup;

public class ItemGroupTransformer {
	
	private ItemGroupTransformer() {
	}
	
	public static ItemGroup transformItemGroup(ResultSet rs) {
		ItemGroup group = null;
		try {
			group = new ItemGroup(rs.getInt(ItemGroup.PROP_ID), rs.getString(ItemGroup.PROP_NAME));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return group;
	}
}

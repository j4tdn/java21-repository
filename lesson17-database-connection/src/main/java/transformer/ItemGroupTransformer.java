package transformer;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

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
	
	public static ItemGroupDto transformItemGroupDto(ResultSet rs) {
		ItemGroupDto group = null;
		try {
			group = new ItemGroupDto(
					rs.getInt(ItemGroupDto.PROP_ID), 
					rs.getString(ItemGroupDto.PROP_NAME),
					rs.getInt(ItemGroupDto.PROP_AMOUNT_OF_ITEMS),
					rs.getString(ItemGroupDto.PROP_ITEM_DETAILS));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return group;
	}
}
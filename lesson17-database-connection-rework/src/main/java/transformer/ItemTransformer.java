package transformer;

import java.sql.ResultSet;
import java.sql.SQLException;

import persistence.Item;
import persistence.ItemGroup;

public class ItemTransformer {
	private ItemTransformer() {
	}
	
	public static Item transformItem(ResultSet rs) {
		Item item = Item.of();
		try {
			return item
					.withId(rs.getInt(Item.PROP_ID))
					.withName(rs.getString(Item.PROP_NAME))
					.withBuyPrice(rs.getBigDecimal(Item.PROP_BUY_PRICE));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	public static Item transformItemWithGroup(ResultSet rs) {
		Item item = Item.of();
		try {
			return item
					.withId(rs.getInt(Item.PROP_ID))
					.withName(rs.getString(Item.PROP_NAME))
					.withBuyPrice(rs.getBigDecimal(Item.PROP_BUY_PRICE))
					.withGroup(ItemGroup.of()
							.withId(rs.getInt(Item.PROP_GROUP_ID))
							.withName(rs.getString(Item.PROP_GROUP_NAME)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}
}

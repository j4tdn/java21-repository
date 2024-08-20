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
			return Item.of()
					.withId(rs.getInt(Item.PROP_ID))
					.withBuyPrice(rs.getBigDecimal(Item.PROP_BUY_PRICE))
					.withName(rs.getString(Item.PROP_NAME));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	public static Item transformItemWithGroup(ResultSet rs) {
		Item item = Item.of();
		try {
			return Item.of()
					.withId(rs.getInt(Item.PROP_ID))
					.withBuyPrice(rs.getBigDecimal(Item.PROP_BUY_PRICE))
					.withName(rs.getString(Item.PROP_NAME))
					.withItemGroup(ItemGroup.of()
							.withId(rs.getInt(Item.PROP_GROUP_ID))
							.withName(rs.getString(Item.PROP_GROUP_NAME)));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}
}

package persistence;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_BUY_PRICE = "buyPrice";
	
	public static final String PROP_GROUP = "group";
	
	public static final String PROP_GROUP_ID = PROP_GROUP + "_" + ItemGroup.PROP_ID;
	public static final String PROP_GROUP_NAME =  PROP_GROUP + "_" + ItemGroup.PROP_NAME;
	
	private Integer id;
	private String name;
	private BigDecimal buyPrice;
	private ItemGroup group;

	public Item() {
	}

	public Item(Integer id, String name, BigDecimal buyPrice, ItemGroup group) {
		this.id = id;
		this.name = name;
		this.buyPrice = buyPrice;
		this.group = group;
	}

	public Item(Integer id, String name, BigDecimal buyPrice) {
		this.id = id;
		this.name = name;
		this.buyPrice = buyPrice;
	}
	
	public static Item of() {
		return new Item();
	}

	public Integer getId() {
		return id;
	}

	public Item withId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Item withName(String name) {
		this.name = name;
		return this;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public Item withBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
		return this;
	}

	public ItemGroup getGroup() {
		return group;
	}

	public Item withGroup(ItemGroup group) {
		this.group = group;
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item)) {
			return false;
		}

		Item that = (Item) obj;
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", buyPrice=" + buyPrice + "]";
	}

}

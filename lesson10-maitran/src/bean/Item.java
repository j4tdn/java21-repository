package bean;

import java.math.BigDecimal;

public class Item implements Comparable<Item> {

	private Integer itemId;
	private String name;
	private BigDecimal salesPrice;
	private Integer storeId;

	public Item() {
	}

	public Item(Integer itemId, String name, BigDecimal salesPrice, Integer storeId) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeId = storeId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId
				+ "]";
	}

	@Override
	public int compareTo(Item o) {
		Item i1 = this;
		Item i2 = o;

		return i1.getSalesPrice().compareTo(i2.getSalesPrice());
	}

}

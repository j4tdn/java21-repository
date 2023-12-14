package homework;

import java.math.BigDecimal;

public class Item {
	private int itemId;
	private String name;
	private BigDecimal salePrice;
	private String storeId;
	public Item() {
		
	}
	public Item(int itemId, String name, BigDecimal salePrice, String storeId) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.salePrice = salePrice;
		this.storeId = storeId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salePrice=" + salePrice + ", storeId=" + storeId + "]";
	}
	
}

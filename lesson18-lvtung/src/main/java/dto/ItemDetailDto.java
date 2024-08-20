package dto;

import java.math.BigDecimal;

public class ItemDetailDto {
	
	public static final String PROP_ITEM_ID = "itemId";
	public static final String PROP_ITEM_NAME = "itemName";
	public static final String PROP_BY_PRICE = "buyPrice";
	public static final String PROP_COLOR = "color";
	public static final String PROP_SALES_PRICE = "salesPrice";
	public static final String PROP_ITEM_GROUP_ID = "itemGroupId";
	public static final String PROP_ITEM_GROUP_NAME = "itemGroupName";
	
		
	private Integer itemId;
	private String itemName;
	private BigDecimal buyPrice;
	private String color;
	private BigDecimal salesPrice;
	private Integer itemGroupId;
	private String itemGroupName;
	
	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getItemGroupId() {
		return itemGroupId;
	}

	public void setItemGroupId(Integer itemGroupId) {
		this.itemGroupId = itemGroupId;
	}

	public String getItemGroupName() {
		return itemGroupName;
	}

	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}

	@Override
	public String toString() {
		return "ItemDetailDto [itemId=" + itemId + ", itemName=" + itemName + ", buyPrice=" + buyPrice + ", color="
				+ color + ", salesPrice=" + salesPrice + ", itemGroupId=" + itemGroupId + ", itemGroupName="
				+ itemGroupName + "]";
	}

}

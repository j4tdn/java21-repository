package dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
	
	@Override
	public String toString() {
		return "ItemDetailDto [itemId=" + itemId + ", itemName=" + itemName + ", buyPrice=" + buyPrice + ", color="
				+ color + ", salesPrice=" + salesPrice + ", itemGroupId=" + itemGroupId + ", itemGroupName="
				+ itemGroupName + "]";
	}	
}
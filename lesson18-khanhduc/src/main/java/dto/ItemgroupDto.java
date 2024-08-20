package dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemgroupDto {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	
	private Integer id;
	private String name;
	private BigDecimal amountOfItems;
	
	@Override
	public String toString() {
		return "ItemgroupDto [id=" + id + ", name=" + name + ", amountOfItems=" + amountOfItems + "]";
	}
}
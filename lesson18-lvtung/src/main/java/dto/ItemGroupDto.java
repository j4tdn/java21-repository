package dto;

import java.math.BigDecimal;

public class ItemGroupDto {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	
	private Integer id;
	private String name;
	private BigDecimal amountOfItems;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAmountOfItems() {
		return amountOfItems;
	}

	public void setAmountOfItems(BigDecimal amountOfItems) {
		this.amountOfItems = amountOfItems;
	}

	@Override
	public String toString() {
		return "ItemgroupDto [id=" + id + ", name=" + name + ", amountOfItems=" + amountOfItems + "]";
	}

}

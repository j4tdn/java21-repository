package persistence.dto;

public class ItemGroupDto {
	
	public static final String PROP_IG_ID = "igId";
	public static final String PROP_IG_NAME = "igName";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	
	private Integer igId;
	private String igName;
	private Long amountOfItems;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer igId, String igName, Long amountOfItems) {
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
	}
	
	public static ItemGroupDto of() {
		return new ItemGroupDto();
	}

	public Integer getIgId() {
		return igId;
	}

	public ItemGroupDto withIgId(Integer igId) {
		this.igId = igId;
		return this;
	}

	public String getIgName() {
		return igName;
	}

	public ItemGroupDto withIgName(String igName) {
		this.igName = igName;
		return this;
	}

	public Long getAmountOfItems() {
		return amountOfItems;
	}

	public ItemGroupDto withAmountOfItems(Long amountOfItems) {
		this.amountOfItems = amountOfItems;
		return this;
	}


	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", amountOfItems=" + amountOfItems;
	}
	
	
}
package persistence.dto;

public class ItemGroupDto {
	
	public static String PROP_IT_ID = "id";
	public static String PROP_IT_NAME = "itemName";
	public static String PROP_IT_COLOR = "color";
	public static String PROP_IG_ID = "itemGroupId";
	public static String PROP_IG_NAME = "itemGroupName";
	
	private Integer id;
	private String itemName;
	private String color;
	private Integer itemGroupId;
	private String itemGroupName;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer id, String itemName, String color, Integer itemGroupId, String itemGroupName) {
		this.id = id;
		this.itemName = itemName;
		this.color = color;
		this.itemGroupId = itemGroupId;
		this.itemGroupName = itemGroupName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
		return "ItemGroupDto [id=" + id + ", itemName=" + itemName + ", color=" + color + ", itemGroupId=" + itemGroupId
				+ ", itemGroupName=" + itemGroupName + "]";
	}

	
}

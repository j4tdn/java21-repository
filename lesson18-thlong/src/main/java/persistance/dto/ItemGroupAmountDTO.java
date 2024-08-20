package persistance.dto;

public class ItemGroupAmountDTO {
	public static final String PROP_ID = "id";
	public static final String PROP_ITEM_GROUP_NAME = "itemGroupName";
	public static final String PROP_AMOUNT = "amount";
	
	private Integer id;
	
	private String itemGroupName;
	
	private Integer amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemGroupName() {
		return itemGroupName;
	}

	public void setItemGroupName(String itemGroupName) {
		this.itemGroupName = itemGroupName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemGroupAmountDTO [id=" + id + ", itemGroupName=" + itemGroupName + ", amount=" + amount + "]";
	}
	
	
}

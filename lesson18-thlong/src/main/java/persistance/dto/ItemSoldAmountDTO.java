package persistance.dto;

public class ItemSoldAmountDTO {
public static final String PROP_ID = "id";
	
	public static final String PROP_NAME_ITEM = "itemName";
	
	public static final String PROP_AMOUNT = "amount";
	
	private Integer id;
	
	private String itemName;
	
	private Integer amount;

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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemSoldAmountDTO [id=" + id + ", itemName=" + itemName + ", amount=" + amount + "]";
	}
	
	
}

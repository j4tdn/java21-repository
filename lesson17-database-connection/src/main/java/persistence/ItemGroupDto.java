package persistence;

import java.util.Objects;

public class ItemGroupDto {

	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	public static final String PROP_ITEM_DETAILS = "itemDetails";
	
	private Integer id;
	private String name;
	private Integer amountOfItems;
	private String itemDetails;

	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer id, String name, Integer amountOfItems, String itemDetails) {
		this.id = id;
		this.name = name;
		this.amountOfItems = amountOfItems;
		this.itemDetails = itemDetails;
	}

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

	public Integer getAmountOfItems() {
		return amountOfItems;
	}

	public void setAmountOfItems(Integer amountOfItems) {
		this.amountOfItems = amountOfItems;
	}

	public String getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroupDto)) {
			return false;
		}

		ItemGroupDto that = (ItemGroupDto) o;
		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", amountOfItems=" + amountOfItems + ", itemDetails="
				+ itemDetails + "]";
	}

}

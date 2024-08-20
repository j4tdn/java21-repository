package dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class ItemGroupDto {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	public static final String PROP_ITEM_DETAILS = "itemDetails";
	
	Integer id;
	String name;
	Integer amountOfItems;
	String itemDetails;
	
	
	
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
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", amountOfItems=" + amountOfItems + ", itemDetails="
				+ itemDetails + "]";
	}
}

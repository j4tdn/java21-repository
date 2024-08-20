package persistence.dto;

import java.util.Objects;

public class ItemGroupDto {

	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	
	private Integer id;
	private String name;
	private Integer amountOfItems;

	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer id, String name, Integer amountOfItems) {
		this.id = id;
		this.name = name;
		this.amountOfItems = amountOfItems;
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
		return "ItemGroupDto [id=" + id + ", name=" + name + ", amountOfItems=" + amountOfItems + "]";
	}

}
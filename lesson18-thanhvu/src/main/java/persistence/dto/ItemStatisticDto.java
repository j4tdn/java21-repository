package persistence.dto;

public class ItemStatisticDto {

	public static String PROP_IT_ID = "id";
	public static String PROP_IT_NAME = "name";
	public static String PROP_AMOUNT_OF_ITEMS = "amount_of_items";

	private Integer id;

	private String name;

	private Integer amount_of_items;

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

	public Integer getAmount_of_items() {
		return amount_of_items;
	}

	public void setAmount_of_items(Integer amount_of_items) {
		this.amount_of_items = amount_of_items;
	}

	public ItemStatisticDto() {
	}

	public ItemStatisticDto(Integer id, String name, Integer amount_of_items) {
		this.id = id;
		this.name = name;
		this.amount_of_items = amount_of_items;
	}

	@Override
	public String toString() {
		return "ItemStatisticDto [id=" + id + ", name=" + name + ", amount_of_items=" + amount_of_items + "]";
	}
}

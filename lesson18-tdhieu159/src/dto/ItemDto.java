package dto;

public class ItemDto {
	private Integer id;
	private String name;
	private String amount_of_items;
	public ItemDto() {
		// TODO Auto-generated constructor stub
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
	
	public String getAmount_of_items() {
		return amount_of_items;
	}
	public void setAmount_of_items(String amount_of_items) {
		this.amount_of_items = amount_of_items;
	}
	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", amount_of_items=" + amount_of_items + "]";
	}
	
	
}	
package bean;

public class Item {
	private int ItemId;
	private String name;
	private double price;
	
	public Item() {
	}

	public Item(int itemId, String name, double price) {
		ItemId = itemId;
		this.name = name;
		this.price = price;
	}

	public int getItemId() {
		return ItemId;
	}

	public void setItemId(int itemId) {
		ItemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [ItemId=" + ItemId + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
}
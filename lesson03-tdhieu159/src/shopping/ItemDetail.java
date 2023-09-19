package shopping;

public class ItemDetail {

	private Item item;
	private int quantity;
	
	// khởi tạo rỗng
	public ItemDetail() {
	}

	public Item getItem() {
		return item;
	}

	
	// khởi tạo full tham số
	public ItemDetail(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	// getter setter
	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	// toString
	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", quantity=" + quantity + "]";
	}
	
	
	
	
}

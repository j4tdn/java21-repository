package lesson03_OOP;

public class ItemDetail {
	private Item id;
	private int soLuong;

	public ItemDetail() {

	}

	public ItemDetail(Item id, int soLuong) {
		super();
		this.id = id;
		this.soLuong = soLuong;
	}

	public Item getId() {
		return id;
	}

	public void setId(Item id) {
		this.id = id;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", soLuong=" + soLuong + "]";
	}

}

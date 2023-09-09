package datastructure.object.custom;

/**
 * Tạo ra KDL đối tượng
 * KDL tên là Item
 * 
 * Bao gồm 3 thông tin: Item(id, name, price)
 */
public class Item {
	// attribute: thuộc tính
	// Khi khởi tạo/ gán giá trị cho một biến kiểu item
	// thì ô nhớ mà biến đó tr�? đến phải luon có 3 thông tin của thuộc tính
	public int id;
	
	public char name;
	
	public double price;

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int id, char name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}

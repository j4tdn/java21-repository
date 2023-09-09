package datastructure.object.custom;

/**
 * Tạo ra 1 kdl đối tượng
 * KDL tên là: Item
 * 
 *  Bao gồm 3 thông tin: Item(id, nam, price)
 *  
 */
public class Item {
	// khi mình khởi tạo hay mình gán giá trị cho 1 biến kiểu Item
	// Thì ô nhớ mà biến đó trỏ đến phải luôn có 3 thông tin của thuộc tính
	
	public int id;
	public char name;
	public double price;
	
	public Item() {
		
	}

	public Item(int id, char name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	// định nghĩa lại toString() từ class object
	// Item i1, i2 --> KDL item
	// item1.toString() H1 --> this = item1
	// trong class sẽ có biến this --> để biết biến/ đối tượng nào đang gọi hàm của class đó
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}
	
	
	
}

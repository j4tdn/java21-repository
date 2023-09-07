package datastructure.object.custom;

/**
 * Tạo ra KDL đối tượng 
 * KDL tên là: Item
 * 
 * bao gồm 3 thông tin:   Item(id, name, price)
 *
 */
public class Item {
	
	// attributes: thuộc tính
	// khi khởi tạo/gán giá trị cho 1 biến kiểu Item 
	// thì ô nhớ mà biến đó trỏ đến phải luôn luôn có 3 thông tin của thuộc tin của thuộc tính 
	public int id;
	public char name;
	public double price;
	
	
	// constructor
	// constructor name = class name
	// no return type 
	public Item() {
		
	}
	
	
	//Item i4 = new Item(4, 'E', 44d);
	public Item(int id, char name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	//định nghĩa lại hàm toString từ class Object
	//i1.toString() H1 --> this = i1
	//i2.toString() H2 --> this = i2
	
	//torng class nó sẽ có biến this --> để biến/đối tượng nào đang gọi hàm của class đó 
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}
}

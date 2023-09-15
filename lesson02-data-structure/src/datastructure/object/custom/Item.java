package datastructure.object.custom;

/**
 * Tạo ra KDL đối tượng
 * KDL tên là: Item
 * 
 * Bao gồm 3 thông tin: id, name, price
 */

public class Item {
	
	// attribute: thuộc tính
	// Khi declare cho 1 biến item -> ô nhớ mà biến đó trỏ đến có 3 thông tin của thuộc tính
	public int id;
	public char name;
	public double price;
	
	// constructor
	// constructor name = class name
	// no return type --> default return current class type
	public Item() {
		
	}
	
	public Item(int id, char name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	// Toán tử bằng --> gán giá trị ở STACK

	// định nghĩa lại toString từ class Object
	// Item i1, i2 --> KDL item
	// i1.toString() // H1 --> this = i1
	// i2.toString() // H2 --> this = i2
	
	// trong class có biến this --> để biết biến/ đối tg nào đang gọi hàm của class đó
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price; 
	}
}

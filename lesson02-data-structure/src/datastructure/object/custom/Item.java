package datastructure.object.custom;

/**
 * Tạo ra KDL đối tượng
 * KDL tên là: Item
 * 
 * Bao gồm 3 thông tin: Item(id, name, price)
 * 
 */
public class Item {
	
	// attributes: thuộc tính
	// Khi khởi tạo/gán giá trị cho một biến kiểu Item
	// Thì ô nhớ mà biến đó trỏ đến phải luôn có 3 thông tin của thuộc tính
	public int id;
	public char name;
	public double price;
	
	// method: [access modifier] [static] return_type method_name(parameters) {...}
	
	// constructor
	// constructor name = class name
	// no return type --> default return current class type
	public Item() {
		
	}
	
	// Item i4 = new Item(4, 'E', 44d);
	// int pId = 4;
	// char pName = 'E'
	// double pPrice = 44d;
	public Item(int id, char name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	// Toán tử = --> gán giá trị ở STACK
	
	// định nghĩa lại toString từ class Object
	// Item i1, i2 --> KDL item
	// i1.toString() // H1 --> this = i1
	// i2.toString() // H2 --> this = i2
	
	// trong class nó sẽ có biến this --> để biết biến/đối tượng nào đang gọi hàm của class đó
	@Override
	public String toString() {
		return "[" + this.id + ", " + this.name + ", " + this.price + "]";
	}
	
}

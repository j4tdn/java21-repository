package datastructure.object;
/**
 * Mục đích tạo ra class Item: Tạo ra KDL đối tượng 
 * KDL tên là: Item
 * Bao gồm 3 thông tin: Item(id, name, price)
 * 
 */
public class Item {
	// attributes: thuộc tính
	// Khi khởi tạo/gán giá trị cho 1 biến kiểu Item
	// Thì ô nhớ mà biến đó trỏ đến luôn có 3 thông tin của thuộc tính
	//
	public int id;
	public char name;
	public double price; 
	
	//constructor
	//constructor name = class name
	//no return type ==> default return current class type
	public Item() {}
	
	public Item(int pId, char pName, double pPrice) {
		id = pId;
		name = pName;
		price = pPrice;
	}
	
	// Toán tử = --> gán giá trị ở STACK
	
	// Định nghĩa lại hàm toString từ class Object
	//Item i1, i2 --> KDL item
	// i1.toString() // H1 --> this = i1
	// i2.toString() // H2 --> this = i2
	
	@Override
	public String toString() {
		return "[" + this.id + ", " + this.name + " ," + this.price + "]"; 
	}
}

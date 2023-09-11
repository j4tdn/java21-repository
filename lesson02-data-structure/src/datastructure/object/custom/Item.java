package datastructure.object.custom;
/**
 * 
 * Tạo ra KLD đối tượng (class)
 * KDL có tên là: Item 
 * 
 * Bao gồm 3 thông tin: Item(id, name, price)
 * 
 * 
 *
 */
public class Item {
 // attributes: Thuộc tính
 // Khi mình gán giá trị cho 1 biến kiểu Item
 // Thì ô nhớ mà biến đó trỏ đến phải luôn có 3 thông tin của thuộc tính
	public int id;
	public char name;
	public double price;
	
	//method: [access modifier] [static] [return type] [method_name](parameter) {}
	// constructor:
	// constructor name = class name
	// no return type --> default return current class type
	public Item() {
	}
	 //Item i4 = new Item(4,'E', 44d);
		public Item(int id, char name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
			
		}
		

	// định nghĩa lại  toString từ class Object
	// bấm to + ctrl + space
	// i1.toString() //H1 -- this = i1
	// i2.toString() //H2 --> this =i2
	// Trong class nó sẽ có biến this để biết biến/ đối tượng nào đang gọi hàm của class đó
	@Override
			public String toString() {
		return "[" + this.id + "," + this.name + "," + this.price + "]";
			}
}

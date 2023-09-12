package datastructor.object;

/**
 * Tạo ra KDL đối tượng
 * KDL tên là: Item
 * 
 * Bao gồm 3 thông tin: Item(id, name, price) 
 */

public class Item {
	
	// attributes: thuộc tính
	// Khi mình khởi tạo/gán giá trị cho 1 biến kiểu Item
	// Thì ô nhớ mà biến đó trỏ đến phải luôn có 3 thông tin của thuộc tính
	public int id;
	public char name;
	public double price;
	
	// constructor
	// constructor name = class name
	public Item(){
		
	}
	
	//Item i4 = new Item(4, 'E', 44d);
	public Item(int id, char Name, double Price) {
		this.id = id;
		this.name = Name;
		this.price = Price;
	}
	
	// Toán tử --> gán giá trị ở STACK
	
	
	// định nghĩa lại toString từ class object
	// i1.toString
	// i2.toString
	
	// trong class sẽ có biến this --> để biết đối tượng nào đang gọi hàm của class đó
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}		
}

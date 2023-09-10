package datastructure.object.custom;
	/*
	 * Tạo ra kiểu dữ liệu đối tượng
	 * KDL tên là : Item
	 * 
	 * Bao gôm 3 thông tin: Item(id, name, price)
	 */
public class Item {
	// attributes: Thuộc tính
	// Khi khởi tạo/gán giá trị cho 1 biến kiểu dữ liệu Item
	// Thì ô nhớ của biến đó luôn có 3 thông tin của thuộc tính
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
		this.price =  price;
	}
	// Định nghĩa lại toString từ Object
	@Override
	public String toString() {
		
		return this.id + ", " + this.name + ", " + this.price;
	}
	
}

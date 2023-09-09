package datastructure.object;
/**
 * create object Datatype
 * datatype is : item
 * include 3 info :Item( id, name, price )
 */
public class Item {
	// attributes : thuộc tính
	// Khi khởi tạo / gán giá trị cho một biến kiểu Item
	// Thì ô nhớ mà biến đó trỏ đến phải có 3 thông tin của thuộc tính
	private int id;
	private String name;
	private double price;
	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	// constructor
	// constructor name = class name
	// no return type --> default return current class type
	public Item() {
		
	}
	
}

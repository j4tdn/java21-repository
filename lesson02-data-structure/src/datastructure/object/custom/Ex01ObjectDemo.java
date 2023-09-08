package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// khai báo & khởi tạo giá trị cho biến thuộc KDL nguyên thủy
		int a = 10;
		char b = 'm';
		
		/**
		 *  khai báo & khởi tạo giá trị cho biến thuộc KDL đối tượng
		 *  new Item() --> gọi hàm khởi tạo mặc định của class(KDL) Item
		 *  default constructor:
		 *  	Tạo ra 1 ô nhớ trên vùng nhớ heap
		 *  	có đầy đủ thông tin tất cả các thuộc tính của class chứa nó
		 */
		 
		Item item = new Item(); // H1
		item.id = 1;
		item.name = 'a';
		item.price = 11d;
				
		
		System.out.println("item " + System.identityHashCode(item));
		
		Item item2 = new Item(2, 'b', 22d); // H2 tạo ô nhớ mới và gán địa chỉ ô nhớ mới cho item2
		
		
		
		// in biến KDL đối tượng thì mặc định sẽ gọi hàm toString() có sẵn trong KDL của biến đó
		// in item --> item.toString()
		// Java có class gọi là cha của tất cả các KDL đối tượng --> object
		// object class sẽ có 1 số hàm
		
		// Mặc định Item con của object --> sử dụng các hàm được phép bên class object
		
		System.out.println("item 1st --> " + item);
		System.out.println("item 2nd --> " + item2);
	}
}

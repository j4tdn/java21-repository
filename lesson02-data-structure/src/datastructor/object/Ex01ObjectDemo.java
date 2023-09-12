package datastructor.object;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Khai báo và khởi tạo cho biến thuộc KDL nguyên thủy
		int a = 12;
		char b = '^';
		/*
		Khai báo và khởi tạo giá trị cho biến thuộc KDL đối tượng 
		new Item()
			--> gọi hàm khởi tạo mặc định của class(KDL Item class)
			--> mặc định 1 class nó sẽ tự có hàm khởi tạo mặc định
			--> default constructor
				+ Tạo ra 1 ô nhớ trên vùng nhờ HEAP
				+ Có đầy đủ thông tin tất cả các thuộc tính class chứa nó
			*/
		
		Item i1 = new Item();
		// set/ gán lại giá trị cho các thuộc tính của ô nhớ hiện tại mà i1 đang trỏ đến
		i1.id = 1;
		i1.name = 'A';
		i1.price = 11d;
		
		System.out.println("i1 address 1st -->" + System.identityHashCode(i1));
		
		// tạo ô nhớ mới và gán lại địa chỉ của ô nhớ mới cho i1
		i1 = new Item(); // H2 --> i1 trỏ đến H2
		i1.name = 'B';
		
		System.out.println("i1 address 2nd -->" + System.identityHashCode(i1));
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'C';
		i2.price = 22d;
		
		// Khởi tạo ô nhớ và gán giá trị cho ô nhớ đó
		// Hàm khởi tạo có tham số
		Item i4 = new Item(4, 'E', 44d);
		
		// Java có class gọi là cha của tất cả các KDL đối tượng(class) --> Object
		// Object class sẽ có 1 số hàm
		// toString, hashcode, equals ...
		
		// Mặc định Item con của Object --> sử dụng các hàm (được phép) bên class Object
		
		// in biến KDL đối tượng
		// mặc định gọi hàm toString() có sẵn trong KDL của biến đó
		// in i1 --> i1.toString()
		// thực tế cần:
		// Khi in ra biến KDL đối tượng --> in ra giá trị tất cả thuộc tính của ô nhớ
		// mà biến đó đang trỏ đến
		
		
		System.out.println("i1 1st -->" + i1);
		System.out.println("i1 2nd -->" + i2);
		//System.out.println("i1 2nd -->" + i1.toString());
		//System.out.println("i1 3rd --> (" + i1.id + "," + i1.name + ", " + i1.price + ")");
		System.out.println("i1 4th -->" + i4);
	}
}

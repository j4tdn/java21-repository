package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// khai báo và khởi tạo giá trị cho biến thuộc KDL nguyên thủy
	/*
	 khai báo và khởi tạo giá trị cho biến thuộc KDL nguyên thủy
	 new Item() 
	 --> gọi hàm khởi tạo mặc định của class item
	 --> mặc định 1 class nó sẽ tự có hàm khởi tạo mặc định
	 --> default constructor
	 	+ tạo ra 1 ô nhớ trên vùng nhớ heap
	 	+ có đầy đủ thông tin tất cả các thuộc tính của class chứa nó
	 /*
	  * 
	  */
	Item i1 = new Item(); //H1
	// set/gán lại giá trị cho các thuộc tính của ô nhớ hiện tại mà i1 đang trỏ đến
	i1.id = 1;
	i1.name = 'A';
	i1.price = 11d;
	
	System.out.println("i1 address --> " + System.identityHashCode(i1));
	
	// tạo ô nhớ mới và gán địa chỉ ô nhớ mới cho i1
	i1 = new Item(); // H2 --> i1 trỏ đến H2
	i1.name = 'B';
	
	System.out.println("i1 address 2nd --> " + System.identityHashCode(i1));
	
	Item i2 = new Item();
	i2.id = 2;
	i2.name = 'C';
	i2.price = 22d;
	
	// B1: Gọi hàm khởi tạo rỗng để khởi tạo ô nhớ ở HEAP
	Item i3 = new Item();
	// B2: Gán giá trị cho các thuộc tính của ô nhớ
	i3.id = 3;
	i3.name = 'D';
	i2.price = 33d;
	
	// Khởi tạo ô nhớ và gán giá trị trực tiếp cho ô nhớ đó
	// Hàm khởi tạo có tham số
	
	
	// Hàm khởi tạo có tham số
	// Java có class gọi là cha của tất cả các KDL đối tượng(class) --> Object
	// Object class sẽ có 1 số hàm
	// toString, hashcode, equals ...
	
	// mặc định Item con của Object --> sử dụng các hàm được phép bên class object
	
	// in 1 biến KDL đối tượng 
	// thì mặc định gọi hàm toString() có sẵn trong KDL của biến đó
	// in i1 --> i1.toString()
	// thực tế cần:
	// khi in ra biến KDL đối tượng --> in ra giá trị tất cả các thuộc tính của ô nhớ
	// mà biến đó đang trỏ đến
	System.out.println("i1 1st --> " + i1);
	System.out.println("i1 2nd --> " + i1.toString());
	System.out.println("i1 3rd --> " + i1.id + "," + i1.name + "," + i1.price + ")");
	
	// Item i5 = null;
	// System.out.println("i5 id --> " + i5.id);
	}
}

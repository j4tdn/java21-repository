package datastructure.object.custom;

public class Ex01ObjectDemo {
	
	// running
	// debugging
	public static void main(String[] args) {
		//Khai báo và khởi tạo giá trị cho biến thuộc KDL nguyên thủy
		int a = 12; 
		char b = '^';
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		
		//Khai báo và khởi tạo giá trị cho biến thuộc KDL đối tượng
		// new Item() 
		//--> gọi hàm khởi tạo mặc định của class(KDL) Item
		//--> Mặc định 1 class nó sẽ tự có hàm khởi tạo mặc định
		//--> default constructor
		//    + tạo ra 1 ô nhớ trên vùng nhớ heap
		//    + có đầy đủ thông tin tất cả các thuộc tính của class chứa nó
		//    +
		
		Item i1 =  new Item(); //i1 đang trỏ đến ô nhớ H1
		// set/gán lại giá trị cho các thuộc tính của ô nhớ hiện tại mà i1 đang trỏ đến
		i1.id = 1;
		i1.name = 'm';
		i1.price = 11d;
		
		System.out.println("i1 address 1st ==> " + System.identityHashCode(i1));
		
		// Tạo ô nhớ mới và gán địa chỉ của ô nhớ mới cho i1
     	 i1 =  new Item(); // i1 đang trỏ đến ô nhớ H2
     	 i1.name = 'B';
		System.out.println("i1 address 2nd ==> " + System.identityHashCode(i1));
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'C';
		i2.price = 22d;
		
		
		//Khởi tạo ô nhớ và gán giá trị trực tiếp cho ô nhớ đó
		Item i3 = new Item(3, 'D', 33); 
		
		
		
		// Java có class gọi là cha của tất cả các KDL đối tượng(class) --> Object 
		// Object class sẽ có 1 số hàm 
		// toString, hashcode, equals
		
		// Mặc định Item con của Object --> sử dụng các hàm (được phép) bên class Object 
		
		// Khi in 1 biến KDL đối tượng thì mặc định nó sẽ gọi hàm toString()
		// có sẵn trong KDL của biến đó
		// in i1 --> i1.toString() --> get class().getName() @ ...
		// Thực tế mình cần khi in ra biến KDL đối tượng là nó sẽ in ra giá trị tất cả các thuộc tính 
		// của ô nhớ mà biến đó đang trỏ đến
		System.out.println("i1 1st --> "+ i1);
		System.out.println("i2 1st --> "+ i2);
		System.out.println("i3 1st --> "+ i3);
		//System.out.println("i1 2st --> "+ i1.toString());
		//System.out.println("i1 3st --> "+ i1.id + ", " + i1.name + ", " + i1.price);
		
	}
}

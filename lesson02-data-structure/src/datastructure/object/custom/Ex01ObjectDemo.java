package datastructure.object.custom;

import demomain.Ex01TestMainMethod;

public class Ex01ObjectDemo {

	// running
	// debugging: break point
	public static void main(String[] args) {
		// Khai báo và khởi tạo giá trị cho biến thuộc KDL nguyên thủy
		int a = 12;
		char b = '^';
		/*
		 * Khai báo và khởi tạo giá trị cho biến thuộc KDL đối tượng // new Item() //-->
		 * gọi hàm khởi tạo mặc định của class (KDL) Item //--> mặc định 1 class nó sẽ
		 * có hàm khởi tạo mặc định --> default constructor +Tạo ra 1 ô nhớ trên vùng
		 * nhớ HEAP +Có đầy đủ thông tin tất cả các thuộc tính của class chứa nó
		 */
		Item i1 = new Item(); // H1
		// set/gán lại giá trị cho các thuộc tính của ô nhớ hiện tại mà i1 đang trỏ đến
		i1.id = 1;
		i1.name = 'A';
		i1.price = 11d;
		System.out.println("i1 address 1st --> " + System.identityHashCode(i1));
		// tạo ô nhớ mới và gán địa chỉ của ô nhớ mới cho i1
		i1 = new Item(); // H2 -- i1 sẽ trỏ đến H2
		i1.name = 'B';
		System.out.println("i1 address 2nd --> " + System.identityHashCode(i1));

		// B1: gọi hàm khởi tạo rỗng để khởi tạo ô nhớ ở HEAP
		// B2: Gán giá trị cho các thuộc tính của ô nhớ
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'c';
		i2.price = 22d;
		Item i3 = new Item();
		i3.id = 4;
		i3.name = 'f';
		i3.price = 53d;
		
		// Khởi tạo ô nhớ và gán giá trị trực tiếp cho ô nhớ đó
		// Hàm khởi tạo có tham số
		Item i4 = new Item(4, 'E', 44d);
		



		// Java có class gọi là cha của tất cả các KDL đối tượng (class) --> Object
		// Object class sẽ có 1 số hàm
		// toString, hashcode, equals, ...
		// Mặc định Item con của Object --> sử dung các hàm ( được phép) bên class
		// Object

		// in biến KDL đói tượng
		// mặc định gọi hàm toString() có sẵn trong KDL của biến đó
		// in i1 --> i1.toString(); --> getClass().getName() @....
		// Khi in ra biến KDL đối tượng --> in ra giá trị tất cả các thuộc tính của ô
		// nhớ mà biến đó đang trỏ đến
		/*
		 * 
		 */
		System.out.println("i1 1st -->" + i1);
		// System.out.println("i2 2nd -->" + i1.toString());
		// System.out.println("i1 3rd --> (" +i1.id + "," +i1.name + "," +i1.price +")"
		// );
		System.out.println("i2 --> " + i2);
		System.out.println("i3 --> " + i3);
		System.out.println("i4 --> " + i4);
	}
}

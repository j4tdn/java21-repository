package datastructure.object;

public class Ex01ObjectDemo {
	
	// running
	// debugging: break point
	public static void main(String[] args) {
		// declare and create variable value 
		
		// declare and create value of variable object datatype
		// new Item() --> gọi hàm khởi tạo mặc định của class(KDL) Item
		// --> mặc định 1 class nó sẽ tự động có hàm mặc định
		// default constructor 
		// + tạo ra 1 ô nhớ trên vùng nhớ heap
		// + có đầy đủ thông tin 
		Item i1 = new Item();
		System.out.println("i1 address H1" + System.identityHashCode(i1));
		i1 = new Item();
		System.out.println("i2 address H2" + System.identityHashCode(i1));
		Item i2 = new Item();
		i2.setId(2);
		i2.setName("C");
		i2.setPrice(33d);
		
		// Java có class gọi là cha của tất cả các kiểu dự liệu đối tượng(class) --> object
		// object class sẽ có 1 số hàm
		// toString, hashcode, equals
		
		// Mặc định item là con của Object --> sử dụng các hàm được phép bên class object
		
		// print var object datatype
		// mặc định gọi hàm toString() có sẵn trong KDL của biến đó 
		// in i1 --> i1.toString()
		System.out.println("i1 1st -->" + i1);
		System.out.println("i1 2st -->" + i1.toString());
		System.out.println("i1 3rd -->" + i1.toString());
	}
}

package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		/*
		 * Khởi tạo giá trị biến KDL nguyên thủy
		 */
		int a = 12;
		char b = '^';
		
		System.out.println("a--> " + a);
		System.out.println("b--> " + b);
		/*
		 * Khởi tạo giá trị cho biến KDL đối tượng
		 * new Item():
		 * --> Gọi hàm khởi tạo mặc định của class(KDL) Item
		 * --> Mặc định một class nó sẽ tự động có hàm khởi tạo mặc định
		 * --> Default constructor:
		 *    +) Tạo ra một ô nhớ trên vùng nhớ Heap
		 *    +) Có đầy đủ thông tin tất cả các thuộc tính của Class chứa nó
		 */
		
		Item i1 = new Item();
		// Gán lại giá trị cho các thuộc tính của ô nhớ hiện tại i1 đang trỏ đến
		i1.id = 1;
		i1.name = 'A';
		i1.price = 10d;
		System.out.println("Add i1 1st: " + System.identityHashCode(i1));
		
		// Tạo ô nhớ mới và gán địa chỉ mới cho i1
		//i1 = new Item();
		//System.out.println("Add i1 2st: " + System.identityHashCode(i1));
		
		Item i4 =  new Item(4,'B',20d);
		/*
		 * Java có class gọi là cha của tất cả các class --> Object
		 * Object class sẽ có một số hàm...
		 * .toString(), hashcode(), equals,..
		 * 
		 * Mặc định Item là con của Object => có thể sử dụng tất cả các hà trong Object
		 * 
		 * In biến KLD đối tượng
		 * 
		 */
		System.out.println("i1 1st--> " + i1);
		System.out.println("i4 1st--> " + i4);
		System.out.println("i1 2nd--> " + i1.toString());
		//System.out.println("i1 3rd--> (" + i1.id + ", " + i1.name + ", " + i1.price + ")");
		
	}
}

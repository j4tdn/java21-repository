package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//primitive type
		int a =5;
		System.out.println("a -->"+a);
		
		//object type : custom
		//Item item = new Item();
		//Item item1 = new Item(1, 'A', 10);
		
		
		
		//object type : available
		// Integer  : int value
		//Character : char value
		
		//immutable : ko thể cập nhật giá trị của thuộc tính
		//mutable : 
		
		Integer o1 = new Integer(12);
		Integer o2 = new Integer(28);
		
		System.out.println("o1 --> " + o1);
		System.out.println("o2 --> " + o2);
		
		Integer o3 = 77;
		Integer o4 = 88;
		
		// để khởi tạo giá trị cho KDL đối tượng 
		//hầu hết sử dụng từ khóa 'new' --> dùng cho KDL đối tượng có sẵn của Java hoặc Custom
		
		//đặc biệt: với những KDL có sẵn của Java (Integer, Long, Double, String, Float...)
		//có thể khởi tạo giá trị ko cần dùng từ khóa 'new'
		
	} 
 
}

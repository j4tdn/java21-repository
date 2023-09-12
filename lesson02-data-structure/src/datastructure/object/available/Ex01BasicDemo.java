package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		
		//primitive type
		int a =5;
		System.out.println("a --> " + a);
		
		//object type [custom]
		//Item item = new Item();
		//Item item1 = new Item(1, 'A', 10);
		
		System.out.println("\n===========\n " );
		
		//object type [available]
		// Integer: int value
		// Character: char value
		
		// immutable: ko thể cập nhật giá trị của thuộc tính trên ô nhớ heap
		// mutable: cập nhattj giá trị của tt trên ô nhớ heap bình thường
		
		Integer o1 = new Integer(12);
		Integer o2 = new Integer(28);
		
		System.out.println("o1 --> " + o1.toString());
		System.out.println("o2 --> " + o2);

		Integer o3 = 77;
		Integer o4 = 88;
		
		Character c1 = new Character('@');
		Character c2 = '^';
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		
		// Để khởi tạo giá trị cho KDL đối tượng
		// Hầu hết sử dụng từ khoá 'new' --> dùng cho KDL  đối tượng có sẵn của Java hoặc Custom
		
		
		// Đặc biệt: với những KDL có sẵn của Java(Integer, Long, Double, String, Float,...)
		// Có thể khởi tạo giá trị không cầm dùng từ khoá 'new'
		
		
	}

}
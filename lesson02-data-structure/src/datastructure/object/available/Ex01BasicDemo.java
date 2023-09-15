package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		
		// primitive type
		int a = 5;
		System.out.println("a --> " + a);
		
		// object type: custom
//		Item item = new Item();
//		Item item1 = new Item(1, 'A', 10);
		
		// object type: available
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

		
		// Để khởi tạo cho KDL đối tg, hầu hết sẽ sử dụng từ khóa 'new'
		// --> dùng cho KDL đối tg có sẵn của Java hoặc Custom
		
		// Đặc biệt: với những KDL có sẵn của Java, có thể khởi tạo giá trị không cần dùng từ khóa 'new'


	}
}

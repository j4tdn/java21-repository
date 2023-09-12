package datastructor.object.available;

import datastructor.object.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// primitive
		
		int a = 5;
		
		// object type: custom
		
		//Item item = new Item();	
		//Item item1 = new Item(1. 'A', 10);
		
		//Item item2 = 2, 'B', 20;
		
		//object type: available
		//Integer: int value
		//Character: char value
		//Khai báo 1 chuỗi sử dụng String varName = '' --> ít tốn vùng nhớ
		
		//immutable: k thể cập nhật giá trị của thuộc tính trên ô nhớ heap
		//mutable: cập nhật đc
		
		Integer o1 = new Integer(12);
		Integer o2 = new Integer(28);
		
		System.out.println("o1 --> " + o1.toString());
		System.out.println("o2 --> " + o2);
		
		Integer o3 =77;
		Integer o4 = 88;
		
		// Để khởi tạo giá trị cho KDL đối tượng
		// Hầu hết sử dụng từ khóa 'new' --> dùng cho KDL đối tượng có sẵn của Java hoặc Custom
		
		//Đặc biệt: với những KDL có sẵn của Java(Integer, Long, Double, String, Float, ...)
		// có thể khởi tạo giá trị k cần dùng từ khóa new
		
		
	}
}

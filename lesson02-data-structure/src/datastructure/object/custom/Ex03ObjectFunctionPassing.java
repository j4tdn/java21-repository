package datastructure.object.custom;

public class Ex03ObjectFunctionPassing {
	
	/*
	Primitive Data Type:
		+ Dùng KDL có sẵn của Java: int, double, char
		
	Object Data Type:
		+ Dùng KDL có sẵn của JAVA: Integer, String, LocalDate
		+ Tự tạo ra KDL đối tg: Item, Employee
		
		1. Khai báo 1 số nguyên dùng int hay Integer? why?
		=>  + int: thông tin cần lưu trữ là bắt buộc, luôn luôn có giá trị
			+ Integer: thông tin cần lưu trữ chỉ là optional, có thể có hoặc không
			
		2. Khai báo chuỗi sử dụng  String varName = "..." 
							hay là String varName = new String ("...")
		=> luôn dùng cách ở trên:
			+ đỡ tốn bộ nhớ nếu như các giá trị trùng nhau, chỉ tốn 1 ô nhớ trên HEAP
			+ không thay đổi đc
	 */
	
	
	public static void main(String[] args) {
		Item i3 = new Item(3, 'C', 33d);
		System.out.println("i3 1st --> " + i3);
		
		modify(i3);
		
		System.out.println("i3 2nd -->" + i3);
	}
	
	private static void modify(Item item) {
		item.price = 99;
		Item i4 = new Item(4, 'D', 44d);
		i4 = item;
		i4.price = 88;
		i4 = new Item();
		item.price = 77;
		item = i4;
	}
}

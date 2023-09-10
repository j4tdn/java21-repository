package datastructure.object.custom;

public class Ex03ObjectFunctionPassing {
	/*
	 Primitive data type:
	 + Dùng KDL có sẵn của Java: int, double, char
	 
	 Object data type:
	 + Dùng KDL có sẵn của Java: Integer, String, Localdate
	 + Tự tạo ra KDL đối tượng: Item, Employee
	1. Khai báo 1 số nguyên thì sử dụng int hay Integer, vì sao?
		+ dùng int khi thông tin lưu trữ là bắt buộc, luôn luôn có giá trị
		+ nếu thông tin là optional lựa chọn không bắt buộc, lúc có lúc không thì dùng Integer
	2. Khai báo 1 chuỗi sử dụng String varName = "..." hay là String varName = new String("...")
		+ Luôn luôn sử dụng cách 1 						
	*/
	
	// 1. Khai báo 1 số nguyên thì sử dụng int hay Integer, vì sao?
	// 2. Khai báo 1 chuỗi sử dụng String varName = "..." hay là String varName = new String("...")
								
	public static void main(String[] args) {
		
		Item i3 = new Item(3, 'C', 33d);
		
		System.out.println("i3 1st --> " + i3); // id=?, name=?, price=?
		
		modify(i3);
		
		System.out.println("i3 2nd --> " + i3); // id=?, name=?, price=?
		
	}

	// Item item = i3
	private static void modify(Item item) {
		item.price=99;
		Item i4 = new Item(4, 'D', 44d);
		i4 = item;
		i4.price = 88;
		i4 = new Item();
		item.price= 77;
		item = i4;		
	}
}

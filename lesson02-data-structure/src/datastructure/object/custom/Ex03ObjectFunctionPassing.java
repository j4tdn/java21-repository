package datastructure.object.custom;

public class Ex03ObjectFunctionPassing {
	
	/*
	 
	 Primitive Data Type:
	 	+ Dùng KDL có sẵn của JAVA: int, double, char
	 
	 Object Data Type
	    + Dùng KDL có sẵn của JAVA: Integer, String, LocalDate
	    + Tự tạo ra KDL đối tượng: Item, Employee
	    
	    
	 1. Khai báo 1 số nguyên --> dùng int hay Integer, vì sao ?
	    + int: thông tin luôn có giá trị
	    + Integer: thông tin ko bắt buộc, có thể có hoặc ko
	 
	 2. Khai báo 1 chuỗi     --> sử dụng String varName = "..."
	                  hay là -->         String varName = new String("...")
	    
	 */
	
	public static void main(String[] args) {
		
		Item i3 = new Item(3, 'C', 33d); // H3(3, C, 77)
		
		System.out.println("i3 1st --> " + i3); // id=3, name=C, price=33
		
		modify(i3);
		
		System.out.println("i3 2nd --> " + i3); // id=?43, name=?DC, price=?778844
	}
	
	// Item item = i3
	private static void modify(Item item) {
		item.price = 99;
		Item i4 = new Item(4, 'D', 44d); // H4
		i4 = item; // item, i4 --> H3
		i4.price = 88; // 
		i4 = new Item(); // H5(i4)
		item.price = 77; // 
		item = i4; // item(H5)
	}
	
}

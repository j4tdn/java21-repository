package datastructure.object.custom;



public class Ex03ObjectFunctionPassing {
	//1.Khai báo 1 số nguyên --> nên dùng int hay Integer, vì sao?

	//Integer: hỗ trợ hàm, thông tin không bắt buộc, có thể có hoặc không
	//int: thông tin luôn có giá trị
	//2. Khai báo 1 chuỗi --> sử dụng String varName = "..|."
						// hay là --> String varName = new String ("..")
		//+ Dùng cách 1, đỡ tốn bộ nhớ.
	public static void main(String[] args) {
		Item i3 = new Item(3,'C',33d);
		System.out.println("i3-->" +i3);
		modify(i3);
		System.out.println("i3 2nd -->" +i3 );

		
			
		
	}
	private static void modify(Item item) {
		item.price = 99;
		Item i4 = new Item(4,'D',44d);
		i4 = item;
		i4.price = 88;
		i4 = new Item();
		item.price = 77;
		item = i4;
		
		
	}
}

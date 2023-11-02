package view.string.mutable;

public class Ex01StringMutableDemo {
	
	public static void main(String[] args) {
		
		//1. Phân biệt String Literal va String Object
		//2. Phân biệt StringBuider và StringBuffer
		//3. Khái niêmh immutable là gì , ví dụ
		//4. Phân biệt Immutable và Multable
		
		
		// String Immutable: String.

		// String Mutable : StringBuider, StringBuffer.
		StringBuilder sb1= new StringBuilder("todo-app-2.4");
		
		//cộng chuỗi
		sb1.append("-snapshop")
			.append("-test");
		System.out.println("sb --> " + sb1);
		
		// deletaCharAt xóa 1 kí tự tại vị trí đó
		// setCharAt thay đổi tại vị trí đã cho thành kí tự khác.
		sb1.deleteCharAt(0)
		.setCharAt(0, 'a');
		System.out.println("\nsb delated--> " + sb1);
	}
}

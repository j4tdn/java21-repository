package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	
	public static void main(String[] args) {
		
		// Ngày trong tuần
		
		// Thứ 2 --> Chủ Nhật
		// Thứ hai(2), Thứ ba(3) .... Chủ nhật(8)
		
		// In ra thứ ? tương ứng với số random
		
		int weekday = new Random().nextInt(2, 10);
		
		System.out.println("weekday --> " + weekday);
		
		String s = switch(weekday) {
			case 2,3,4,5,6 -> "Ngày Trong Tuần";
			case 7, 8 -> "Cuối Tuần";
			default -> "Không hợp lệ";
		};
		
		System.out.println("s --> " + s);
		
		System.out.println("Exit");
		
		
	}
}

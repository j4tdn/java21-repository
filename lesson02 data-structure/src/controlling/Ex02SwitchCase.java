package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	
	public static void main(String[] args) {
		
		// ngày trong tuần
		
		// từ thứ 2 --> chủ nhật
		// thứ hai (2), thứ ba (3),..., chủ nhật (8)
		
		// in ra thứ tương ứng với số random
		
		int weekday = new Random().nextInt(2, 10);
		
		System.out.println("weekday --> " + weekday);
		
		String s = switch(weekday) {
		case 2, 3, 4, 5, 6 -> "Ngày trong tuần";
		case 7, 8 -> "Ngày cuối tuần";
		default -> "không hợp lệ";
		};
		
		System.out.println("s --> " + s);
		
		System.out.println("Exit");
	}	
}

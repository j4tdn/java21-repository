package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {

		// Ngày trong tuần

		// Thứ 2 --> Chủ nhật
		// Thứ 2(2), Thứ 3(3) .. chủ nhật(8)

		int weekday = new Random().nextInt(2, 9);

		switch (weekday) {

		case 2:
			System.out.println("Thứ hai");
			break;

		case 3:	
			System.out.println("Thứ 3");
			break;

		case 4:
			System.out.println("Thứ 4");
			break;

		case 5:
			System.out.println("Thứ 5");
			break;

		case 6:
			System.out.println("Thứ 6");
			break;

		case 7:
			System.out.println("Thứ 7");
			break;

		case 8:
			System.out.println("Chủ nhật");
			break;

		default:
			System.out.println("Không hợp lệ");
		}
		
		
		System.out.println("Exit");
		
//		
//		String s = switch(weekday) {
//		case 1,3,4  -> "abc";
//		case 5,6 -> "đef";
//		default -> throw new IllegalArgumentException("Unexpected value: " + weekday);
//		};
//		
		

	}
}

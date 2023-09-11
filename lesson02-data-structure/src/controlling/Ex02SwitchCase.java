package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {

		// Ngày trong tuần
		// Thứ 2 -- Chủ nhật
		// Thứ 2(2), Thứ ba (3), .. Chủ nhật (8).
		int weekday = new Random().nextInt(2,15);
		System.out.println("Weekday -->" +weekday);
		
		String s = switch (weekday) {
		case 2,3,4,5,6 -> "Ngày trong tuần";
		case 7,8 -> "Ngày cuối tuần";
		default -> "Không hợp lệ";
		};
		System.out.println("s-->"+s);
		System.out.println("Exit");
	}
}
	



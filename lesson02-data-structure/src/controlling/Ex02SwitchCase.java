package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		// Ngày trong tuần
		// Thứ 2 ---> Chủ nhật

		int weekday = new Random().nextInt(2, 9);
		String s = switch (weekday) {
		case 2, 3, 4, 5 -> "Đức Đẹp Trai";
		case 6, 7, 8 -> "Cuối Tuần";
		default -> "Lỗi";
		};
		System.out.println("s---->" + s);
	}
}

package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		int weekDay = new Random().nextInt(2, 10);
		
		System.out.println("Week day: " + weekDay);
		
		switch (weekDay) {
		default:
			System.out.println("!!! KHÔNG HỢP LỆ !!!");
			break;
		case 2,3,4,5,6:
			System.out.println("Ngày trong tuần");
			break;
		case 7,8:
			System.out.println("Ngày trong cuối tuần");
			break;
		}
	}
}

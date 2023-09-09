package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		
		// ngày trong tuần 
		int weekday = new Random().nextInt(7) + 2;
		
		switch (weekday) {
		case 2: {
			System.out.println("Thứ 2");
			//break;
		}
		case 3: {
			System.out.println("Thứ 3");
			break;
		}
		case 4: {
			System.out.println("4");
			break;
		}
		case 5: {
			System.out.println("5");
			break;
		}
		case 6: {
			System.out.println("6");
			break;
		}
		case 7: {
			System.out.println("7");
			break;
		}
		case 8: {
			System.out.println("8");
			break;
		}
		default:
			System.out.println("tào lao");
		}
	}
}

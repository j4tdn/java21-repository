package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		
		// Ngày trong tuần
		
		int weekday = new Random().nextInt(2,10);
		switch(weekday) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("ngày trong tuần");
			break;
//		case 3:
//			System.out.println("Thứ 3");
//			break;
//		case 4:
//			System.out.println("Thứ 4");
//			break;
//		case 5:
//			System.out.println("Thứ 5");
//			break;
//		case 6:
//			System.out.println("Thứ 6");
//			break;
		case 7:
		case 8:

			System.out.println("cuối tuần");
			break;
//		case 8:
//			System.out.println("Thứ 8");
//			break;
		default:
			System.out.println("Giá trị không hợp lệ");
		}
	}
}

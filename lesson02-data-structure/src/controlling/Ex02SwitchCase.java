package controlling;

import java.util.Random;

public class Ex02SwitchCase {

	public static void main(String[] args) {
		// Ngày trong tuần
		
		// Thứ 2 --> Chủ Nhật
		// Thứ 2,...CN
		
		int weekday = new Random().nextInt(10);
		
		System.out.println("weekday --> " + weekday);
		
		switch (weekday) {
		case 2:
			System.out.println("T2");
			break;
		case 3:
			System.out.println("T3");
			break;
		case 4:
			System.out.println("T4");
			break;
		case 5:
			System.out.println("T5");
			break;
		case 6:
			System.out.println("T6");
			break;
		case 7:
			System.out.println("T7");
			break;
		case 8:
			System.out.println("CN");
			break;

		default:
			System.out.println(" Không hợp lệ");
		}
		
//		String s = switch(weekday) {
//		case 2,3,4,5,6 -> "Ngày trong tuần";
//		case 7,8 -> "cuối tuần";
//		default -> "không hợp lệ";
//		};
				
	}

}

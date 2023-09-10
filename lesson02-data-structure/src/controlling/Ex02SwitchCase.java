package controlling;

import java.util.Random;

public class Ex02SwitchCase {

	public static void main(String[] args) {
		
		// ngày trong tuần
		
		
		int weekday = new Random().nextInt(2, 10);
		System.out.println("weekday --> "+weekday);
		
		switch(weekday) {
		case 2:
			System.out.println("Thứ hai");
			//break;
		case 3:
			System.out.println("Thứ ba");
			//break;
		case 4:
			System.out.println("Thứ tư");
			//break;
		case 5:
			System.out.println("Thứ năm");
			break;
		case 6:
			System.out.println("Thứ sáu");
			break;
		case 7:
			System.out.println("Thứ bảy");
			break;
		case 8:
			System.out.println("Chủ Nhật");
			break;
		default:
			System.out.println("Ko hợp lệ");
		}
		
	}
}

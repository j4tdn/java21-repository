package Ex01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		Date startDate = null;
		Date endDate = null;
		
		DateFormat df  = new SimpleDateFormat("dd/MM/yyyy");
		
		do {
			System.out.println("Ngày tháng hẹn hò: ");
			String dateStartText  = ip.nextLine();
			
			try {
				startDate = df.parse(dateStartText);
				break;
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		} while (true);
		
		int status;
		
		do {
			System.out.println("Đã chia tay chưa Rồi(1) hoặc Chưa(0): ");
			try {
				status = Integer.parseInt(ip.nextLine());
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
		
		if (status == 1) {
			do {
				System.out.println("Ngày tháng chia tay: ");
				String dateEndText  = ip.nextLine();
				
				try {
					endDate = df.parse(dateEndText);
					break;
				} catch (ParseException e) {
					e.printStackTrace();
				}
			} while (true);
		} else {
			endDate = new Date();
		}
		
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow " + dow);
		String[] dayofWeeks = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy", "Chủ nhật"};
		String dowAsString = dayofWeeks[dow-1];
		
		System.out.println("Ngày hẹn hò là thứ: " + dowAsString);

		
	}
}

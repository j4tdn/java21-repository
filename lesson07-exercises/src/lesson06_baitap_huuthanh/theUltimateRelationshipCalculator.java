package lesson06_baitap_huuthanh;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class theUltimateRelationshipCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance();
//		c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		c.set(Calendar.YEAR, 2022);
		c.set(Calendar.MONTH, Calendar.OCTOBER);
		c.set(Calendar.DAY_OF_MONTH, 24);
		
		Calendar checkRelationship = Calendar.getInstance();
		
		int check = 0;
		boolean check01=true;
		
		System.out.println("Nhập vào tình trạng đã chia tay hay chưa nếu đã chia tay nhập 1 còn chưa chia tay thì nhập 0. ");
		check =sc.nextInt();
		while(check01) {
			if(check ==0 || check ==1) check01 = false;
			else {
				System.out.println("Nhập 0 hoặc 1.");
				check =sc.nextInt();
			}
		}
		if (check ==1 ) {
			checkRelationship.set(Calendar.YEAR, 2023);
			checkRelationship.set(Calendar.MONTH, Calendar.DECEMBER);
			checkRelationship.set(Calendar.DAY_OF_MONTH, 10);
		}
		
//		System.out.println("ngu");
		LocalDate cLocalDate = c.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate checkRelationshipLocalDate = checkRelationship.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		DayOfWeek dow = cLocalDate.getDayOfWeek();
		System.out.println("Thứ của ngày đầu quen nhau là: " + dow);
		long dayRelationship = ChronoUnit.DAYS.between(cLocalDate, checkRelationshipLocalDate);
		System.out.println("Đã quen được " + dayRelationship + " ngày.");
	}
}

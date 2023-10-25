package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static utils.DateUtils.*;

public class Ex06TimeDuration {
	public static void main(String[] args) {
		// Năm, tháng, [ngày, giờ, phút, giây, ms]
		
		Date start = toDate("15/10/2023 15:00:00", "dd/MM/yyyy HH:mm:ss", false);
		Date end = Calendar.getInstance().getTime();	
		System.out.println("Day start: " + start);
		System.out.println("End start: " + end);
		
		if(start.after(end)) {
			throw new IllegalArgumentException("Date range is valid!");
		}

		long startTime = start.getTime(); // ms
		long endTime = end.getTime();	  // ms	
		long duration = endTime - startTime;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration); // convert from ms to days
		System.out.println("days: " + days);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		System.out.println("hours: " + hours);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		System.out.println("minutes: " + minutes);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		System.out.println("seconds: " + seconds);
		
		/*
		 * Hạn chế của Date Time trước JAVA 1.8
			+ Date, Calendar luôn lưu trữ dMy Hms
			--> ko hỗ trợ riêng lẽ
			--> khó khăn khi lưu trữ cũng như chuyển đổi qua về với date(dMy) time(Hms) trong database
			+ ít hỗ trợ hàm tìm hiệu giữa 2 mốc thời gian
		 */
	}
}
	
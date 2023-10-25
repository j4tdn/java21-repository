package view.datetime;

import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import date.utils.DateUtils;

public class Ex06TimeDuration {
	public static void main(String[] args) {
		Date start = DateUtils.toDate("15/10/2023 15:00:00", "dd/MM/YYYY HH:mm:ss", false);
		Date end = Calendar.getInstance().getTime();
		
		if(start.after(end)) {
			throw new IllegalArgumentException("Date range is invalid");
		}
		
		long startTime = start.getTime();
		long endTime   = end.getTime();
		long duration  = endTime - startTime;
		long days = TimeUnit.MILLISECONDS.toDays(duration); //convert from ms to days
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.println("days "+days);
		System.out.println("hours "+hours);
		System.out.println("minutes "+minutes);
		System.out.println("seconds "+seconds);

		/*
		 Hạn chế của Date Time trước JAVA 1..8
		 
		 + Date, Calendar luôn lưu trữ dMy Hms 
		 	--> ko hỗ trợ riêng lẻ
		 	--> Khó khăn khi lưu trữ cũng như chuyển đổi qua về với Date(dMy) time(Hms) trong database
		 + Chưa hỗ trợ hàm tìm hiệu giữa 2 mốc thời gian
		 */
	
	}
}

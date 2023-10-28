package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06TimeDuration {

	public static void main(String[] args) {

		// Năm, Tháng, [Ngày, Giờ, Phút, Giây] ms

		Date start = DateUtils.toDate("15/10/2023 15:00:00", "dd/MM/yyyy HH:mm:ss", false);
		Date end = Calendar.getInstance().getTime();
		if (start.after(end)) {
			throw new IllegalArgumentException("Date range is invalid");
		}

		long startTime = start.getTime();
		long endTime = end.getTime();
		long duration = endTime - startTime;

		long days = TimeUnit.MILLISECONDS.toDays(duration);

		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);

		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);

		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);

		System.out.println("Days: " + days);
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		
		/*
		  Hạn chế của Date Time trước Java 1.8
		  
		  + Date và Calendar luôn lưu trữ dMy Hms 
		    --> Không hỗ trợ riêng lẻ
		    --> khó khăn khi lưu trữ cũng như chuyển đổi qua về với date(dMy) và time (Hms) trong database
		  + Ít hỗ trợ hàm tìm hiệu giữa 2 mốc thời gian	
		
		 */
	}
}

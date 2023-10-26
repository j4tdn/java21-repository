package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06Duration {

	public static void main(String[] args) {
		
		Date start = DateUtils.toDate("15/10/2023 15:00:00", "dd/MM/yyyy HH:mm:ss", false);
		Date end = Calendar.getInstance().getTime();
		
		// Năm, thnasg, ngày, giờ, phút, giây
		
		if (start.after(end)) {
			throw new IllegalArgumentException("Date range is valid");
		}
		
		long startTime = start.getTime();
		long endTime = end.getTime();
		
		long duration = endTime - startTime;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration); // convert from ms to day
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration = duration - TimeUnit.HOURS.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		
		System.out.println("days :" + days);
		System.out.println("hours :" + hours);
		System.out.println("minutes :" + minutes);
		System.out.println("seconds :" + seconds);
		
		/*
		 Hạn chế của Date time trc Jv 1.8
		 + Date, Calendar luôn lưu trữ dMy Hms
		 	--> k hỗ trợ riêng lẻ
		 	--> khó khăn khi lưu trữ cũng như chuyển đổi qua về với date(dMy) time(Hms) trong database
		 + Ít hỗ trợ hàm khi tìm hiệu giữa 2 mốc thời gian
		 */
	}
}

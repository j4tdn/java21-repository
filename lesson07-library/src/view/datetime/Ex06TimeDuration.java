package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06TimeDuration {
	public static void main(String[] args) {
		
		Date start = DateUtils.toDate("15/10/2023 15:00:00", "dd/MM/yyyy HH:mm:ss", false);
		Date end = Calendar.getInstance().getTime();
		
		System.out.println("start: " + start);
		System.out.println("end: " +end); 
		
		// 1575 mm
		// 2891 mm
		// --> m 
		
		// Năm, tháng, [Ngày, Giờ, Phút, Giây] ms
		
		if (start.after(end)) {  //hàm after  là so sánh =
			throw new IllegalArgumentException("Date range is invalid");
		}
		
		long startTime = start.getTime();
		long endTime = end.getTime();
		long duration = endTime - startTime; //ms
		
		long days = TimeUnit.MILLISECONDS.toDays(duration); //convert from ms to days
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		
		System.out.println("Days:" +days);
		System.out.println("hours:" +hours);
		System.out.println("minutes:" +minutes);
		System.out.println("seconds:" +seconds);
		
		/*
		 * hạn chế của date time trước Java 1.8
		 * Date, Calendar luôn lưu trữ dMY Hms --> không hỗ trợ riêng lẻ
		 * Khó khăn khi lưu trữ cũng như biến đổi qua về với date(dMY) time(Hms) trong data base
		 * Ít hỗ trợ hàm tìm hiệu giữa 2 mốc thời gian
		 */
	}
}

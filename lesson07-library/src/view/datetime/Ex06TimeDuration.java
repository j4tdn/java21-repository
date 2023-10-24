package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06TimeDuration {
//	private static final String DEFAULT_PATTERN = "dd/MM/yyyy";
	public static void main(String[] args)  {
		Date start =  DateUtils.toDate("15/10/2023 15:00:00", "dd/MM/yyyy HH:mm:ss", false);
		Date end =  Calendar.getInstance().getTime();

		//Năm, Tháng , Ngày , Giờ ,Phút, Giây , ms
		
//		if(start.after(end)) {
//			throw new IllegalAccessException("Date range is incalid");
//		}
		long startTime = start.getTime();
		long endTime   = end.getTime();
		long duration = endTime-startTime;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);  // converter from ms to days
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		System.out.println("Day: "+ days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		System.out.println("HOURS "+hours);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long mitutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		System.out.println("MITUTES: "+ mitutes);
		
		duration = duration - TimeUnit.MINUTES.toMillis(mitutes);
		
		System.out.println("Duration: "+duration);
		/*
		 * Hạn chế ciat Date Time trước JAVA 1.8
		 * 
		 * + Date Calendar luôn lưu trữ dMy Hms
		 * --> Không hỗ trợ riêng lẽ
		 * --> Khó khăn khi lưu trữ cũng như chuyển đổi qua về với date(dMy) time(Hms) trog database
		 * + Ít hỗ trợ hàm tìm hiệu giữa 2 mốc thời gian
		 * 
		 */
	}
}

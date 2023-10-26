package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex06TimeDuration {
    public static void main(String[] args) {
        Date start = DateUtils.toDate("15/10/2023 15:00:00", "dd/MM/yyyy HH:mm:ss", false);
        Date end = Calendar.getInstance().getTime();

        if(start.after(end)) {
        	throw new IllegalArgumentException("Date range is invalid");
        }
        
        // Calculate the time duration
        long durationInMillis = end.getTime() - start.getTime();

        
        long days = TimeUnit.MILLISECONDS.toDays(durationInMillis); //convert from ms to days
        durationInMillis = durationInMillis - TimeUnit.DAYS.toMillis(days);
        
        long hours = TimeUnit.MILLISECONDS.toHours(durationInMillis); 
        durationInMillis = durationInMillis - TimeUnit.HOURS.toMillis(hours);
        
        long minutes = TimeUnit.MILLISECONDS.toMinutes(durationInMillis); 
        durationInMillis = durationInMillis - TimeUnit.MINUTES.toMillis(minutes);
        
        long seconds = TimeUnit.MILLISECONDS.toSeconds(durationInMillis); 
        durationInMillis = durationInMillis - TimeUnit.SECONDS.toMillis(seconds);

        System.out.println("days: " + days);
        System.out.println("hours: " + hours);
        System.out.println("minutes: " + minutes);
        System.out.println("seconds: " + seconds);
        
        /*
         Hạn chế của datetime trước java 1.8
          + Date, Calendar luôn lưu dMy Hms -> không hỗ trợ riêng lẽ
          + Khó khăn khi lưu trữ cũng như chuyển đối qua về với date(dMy) time(Hms) trong databse
          + Ít hỗ trợ hàm tìm hiệu giữa 2 mốc thời gian 
         */
    }
}

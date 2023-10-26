package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Nhập thời gian bắt đầu hẹn hò của 2 người (dd/MM/yyyy HH:mm:ss): ");
        String startDateString = ip.nextLine();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date startDate = null;
        try {
            startDate = sdf.parse(startDateString);
        } catch (ParseException e) {
            System.out.println("Định dạng ngày nhập vào không hợp lệ!!!");
            ip.close();
            return;
        }
        
        Calendar c = Calendar.getInstance();
        c.setTime(startDate);
        
        String[] daysOfWeek = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekString = daysOfWeek[dayOfWeek - 1];

        System.out.println("Ngày bắt đầu hẹn hò là: " + dayOfWeekString);

        
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());
        
        long diffMillis = currentDate.getTimeInMillis() - startDate.getTime();
        long diffSeconds = diffMillis / 1000;
        long diffMinutes = diffSeconds / 60;
        long diffHours = diffMinutes / 60;
        long diffDays = diffHours / 24;
        long diffMonths = calculateMonths(startDate, currentDate);
        long diffYears = diffMonths / 12;
        
        System.out.print("Mối tình đã bắt đầu được: ");
        
        int daysInStartMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int daysInCurrentMonth = currentDate.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        System.out.println(diffYears + " năm, " + (diffMonths % 12) + " tháng, " + 
                           (diffDays % daysInCurrentMonth) + " ngày, " +
                           (diffHours % 24) + " giờ, " + 
                           (diffMinutes % 60) + " phút, " + 
                           (diffSeconds % 60) + " giây");

        ip.close();
    }

    private static long calculateMonths(Date startDate, Calendar currentDate) {
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(startDate);
        
        long diffMonths = 0;
        while (startCalendar.before(currentDate)) {
            startCalendar.add(Calendar.MONTH, 1);
            diffMonths++;
        }
        return diffMonths;
    }
}

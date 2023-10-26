package lesson07_baitap;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class CountingLoveDays {
	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);

	         System.out.println("Chào mừng đến với The Ultimate Relationship Calculator!");
	         
	         Calendar startDate = null;
	         Calendar breakupDate = null;

	         do {
	             System.out.print("Nhập ngày bắt đầu hẹn hò (YYYY-MM-DD): ");
	             String startDateStr = scanner.nextLine();
	             String[] startDateArr = startDateStr.split("-");
	             int startYear, startMonth, startDay;

	             try {
	                 startYear = Integer.parseInt(startDateArr[0]);
	                 startMonth = Integer.parseInt(startDateArr[1]) - 1; // Calendar.MONTH bắt đầu từ 0
	                 startDay = Integer.parseInt(startDateArr[2]);

	                 startDate = new GregorianCalendar(startYear, startMonth, startDay);
	             } catch (Exception e) {
	                 System.out.println("Ngày không hợp lệ. Vui lòng nhập lại.");
	             }
	         } while (startDate == null);

	         do {
	             System.out.print("Nhập ngày chia tay (nếu có) hoặc nhấn Enter để sử dụng thời gian hiện tại (YYYY-MM-DD): ");
	             String breakupDateStr = scanner.nextLine();
	             String[] breakupDateArr = breakupDateStr.split("-");
	             int breakupYear, breakupMonth, breakupDay;

	             if (breakupDateStr.isEmpty()) {
	                 breakupDate = new GregorianCalendar();
	                 break;
	             } else {
	                 try {
	                     breakupYear = Integer.parseInt(breakupDateArr[0]);
	                     breakupMonth = Integer.parseInt(breakupDateArr[1]) - 1;
	                     breakupDay = Integer.parseInt(breakupDateArr[2]);

	                     breakupDate = new GregorianCalendar(breakupYear, breakupMonth, breakupDay);
	                 } catch (Exception e) {
	                     System.out.println("Ngày không hợp lệ. Vui lòng nhập lại.");
	                 }
	             }
	         } while (breakupDate == null);

	         // Tính toán ngày bắt đầu hẹn hò là ngày thứ mấy
	         int dayOfWeek = startDate.get(Calendar.DAY_OF_WEEK);
	         System.out.println("Ngày bắt đầu hẹn hò là ngày thứ " + dayOfWeek);

	         // Tính toán thời gian đã hẹn hò
	         long diffInMillis = breakupDate.getTimeInMillis() - startDate.getTimeInMillis();
	         long years = diffInMillis / (1000L * 60 * 60 * 24 * 365);
	         long days = (diffInMillis / (1000L * 60 * 60 * 24)) % 365;
	         long hours = (diffInMillis / (1000L * 60 * 60)) % 24;
	         long minutes = (diffInMillis / (1000L * 60)) % 60;
	         long seconds = (diffInMillis / 1000L) % 60;

	         System.out.println("Mối tình đã bắt đầu được " + years + " năm, " + days + " ngày, " + hours + " giờ, " +
	                 minutes + " phút, " + seconds + " giây.");

	         scanner.close();
	     }
	 }
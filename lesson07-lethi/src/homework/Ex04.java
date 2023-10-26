package homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {

	public static void main(String[] args) {
		
		Calendar startDate = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		startDate.set(2022, Calendar.JUNE, 07);
		int workingDays = 110;
		
		Calendar endDate = calculateWorkingDays(startDate, workingDays);
		checkVietnameseHolidays(startDate, endDate);
		
		System.out.println("Ngày bàn giao: " + sdf.format(endDate.getTime()));
		
	}
	
	private static boolean isVietNameseHoliday(Calendar date) {
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DAY_OF_MONTH);
		
		if ((month == Calendar.JANUARY && day == 1) ||
	        (month == Calendar.APRIL && day == 30) ||
	        (month == Calendar.MAY && day == 1) ||
	        (month == Calendar.SEPTEMBER && day == 2)) {
	            return true;
	        }
		return false;
	}
	
	private static void checkVietnameseHolidays(Calendar startDate, Calendar endDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar currentDate = (Calendar) startDate.clone();
        while (currentDate.before(endDate)) {
            if (isVietNameseHoliday(currentDate)) {
                System.out.println("Ngày nghỉ lễ: " + sdf.format(currentDate.getTime()));
            }
            currentDate.add(Calendar.DAY_OF_MONTH, 1);

            if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY && isVietNameseHoliday(currentDate)) {
                System.out.println("Ngày nghỉ bù: " + sdf.format(currentDate.getTime()));
                currentDate.add(Calendar.DAY_OF_MONTH, 1);
            }
        }
    }
	
	private static Calendar calculateWorkingDays(Calendar startDate, int workingDays) {
        Calendar currentDate = (Calendar) startDate.clone();
        while (workingDays > 0) {
            currentDate.add(Calendar.DAY_OF_MONTH, 1);

            if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                    || currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                continue;
            }

            workingDays--;
        }
        return currentDate;
    }
	
}

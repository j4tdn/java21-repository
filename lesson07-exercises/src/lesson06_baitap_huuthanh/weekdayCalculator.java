package lesson06_baitap_huuthanh;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class weekdayCalculator {
	
	
	public static  long countDay(Calendar c, Calendar check) {
		LocalDate cLocalDate = c.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate checkday = check.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		long day1 = ChronoUnit.DAYS.between(checkday, cLocalDate);
		return day1;
	}
		
	
    public static void main(String[] args) {
        Locale.setDefault(new Locale("vn", "VN"));
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1995);
        c.set(Calendar.MONTH, Calendar.SEPTEMBER);
        c.set(Calendar.DAY_OF_MONTH, 25);

        Calendar check = Calendar.getInstance();
        check.set(Calendar.YEAR, 1995);
        check.set(Calendar.MONTH, Calendar.JANUARY);
        check.set(Calendar.DAY_OF_MONTH, 1);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", new Locale("vn", "VN"));

        String formattedDate = dateFormat.format(c.getTime());
        System.out.print("Ngày tháng năm: " + formattedDate);
        int dow = c.get(Calendar.DAY_OF_WEEK);
        String[] dayofWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    	String dowAsString = dayofWeek[dow-1];
    	System.out.println( " is " +dowAsString);
    	
		System.out.print("It is day number " + countDay(c, check) + " off the year, ");
		
		check.set(Calendar.YEAR, 1996);
		System.out.println(countDay(check,c) + " day lelf. ");
		
		check.set(Calendar.YEAR, 1995);
		
		Calendar cloned = Calendar.getInstance();
		cloned.setTimeInMillis(c.getTimeInMillis());

		int duration = cloned.getFirstDayOfWeek() - dow;

			cloned.add(Calendar.DAY_OF_MONTH, dow == Calendar.SUNDAY ? duration -7 : duration);
			int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
			int fmonth = cloned.get(Calendar.MONTH);
//			System.out.println("fdowAsNumber " + fdowAsNumber );
//			System.out.println("fdowAsNumber " + fmonth );
			cloned.set(Calendar.DAY_OF_WEEK, fdowAsNumber);
			cloned.set(Calendar.MONTH, fmonth);
			System.out.println(Math.ceil(countDay(cloned, check)/7) );
			
			Calendar cloned2 = Calendar.getInstance();
			cloned2.setTimeInMillis(check.getTimeInMillis());
			cloned2.set(Calendar.YEAR, 1996);
			
			System.out.println(Math.ceil(countDay(cloned2, check)/7));
		
    	
    }
}
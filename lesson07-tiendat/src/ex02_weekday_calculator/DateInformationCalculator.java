package ex02_weekday_calculator;

import java.util.Calendar;
import java.util.Date;

public class DateInformationCalculator {

	public void calculateDateInformation(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		int daysLeftInYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR) - dayOfYear + 1;

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);

		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int monthDaysTotal = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		int year = calendar.get(Calendar.YEAR);
		int yearDays = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);

		int month = calendar.get(Calendar.MONTH) + 1;

		System.out.println("1. Ngày thứ " + dayOfYear + " trong năm, còn " + daysLeftInYear + " ngày nữa đến hết năm.");
		System.out.println("2. Ngày thứ " + dayOfWeek + " và thuộc tuần thứ " + weekOfYear + " trong năm.");
		System.out.println("3. Ngày thứ " + dayOfWeek + " và thứ " + dayOfMonth + " trong tháng.");
		System.out.println("4. Năm " + year + " có " + yearDays + " ngày.");
		System.out.println("5. Tháng " + month + " có " + monthDaysTotal + " ngày.");
	}

}

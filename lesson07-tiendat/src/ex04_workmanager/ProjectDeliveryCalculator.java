package ex04_workmanager;

import java.util.Calendar;
import java.util.Date;

public class ProjectDeliveryCalculator {

	public Date calculateDeliveryDate(Date startDate, int workingDays, HolidayManager holidayManager) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);

		while (workingDays > 0) {
			calendar.add(Calendar.DATE, 1);
			if (!holidayManager.isWeekend(calendar) && !holidayManager.isPublicHoliday(calendar)) {
				workingDays--;
			}
		}

		return calendar.getTime();
	}

}

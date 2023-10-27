package leson07hthanh;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class Job {

	public static Calendar clone(Calendar c) {
		Calendar cloned = Calendar.getInstance();
		cloned.setTime(c.getTime());
		return cloned;
	}

	public static boolean checkDayOff(Calendar c) {
		Calendar check = Calendar.getInstance();
		check.set(Calendar.MONTH, 1);
		check.set(Calendar.DAY_OF_MONTH, 1);
		int month = c.get(Calendar.MONTH);
		int days = c.get(Calendar.DAY_OF_MONTH);
		check.set(Calendar.MONTH, 0);
		check.set(Calendar.DAY_OF_MONTH, 1);
		if (check.get(Calendar.MONTH) == month && check.get(Calendar.DAY_OF_MONTH) == days) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance();
//		c.set(Calendar.YEAR, 2022);
//		c.set(Calendar.MONTH, Calendar.JUNE);
//		c.set(Calendar.DAY_OF_MONTH, 7);
		c.set(2022, Calendar.JUNE, 7);
		Calendar clone = clone(c);
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(c.getTime()));
		int n = 110;

		while (n != 0) {
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
					|| checkDayOff(c)) {
				n = n + 1;
			}
			n = n - 1;
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(c.getTime()));
		
		Date cDate = c.getTime();
		System.out.println("Ngày hoàn thành dự án: " + df.format(cDate));
		LocalDate cloneLocalDate = clone.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate check = cDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		long dayJob = ChronoUnit.DAYS.between(cloneLocalDate, check);
		System.out.println("Số ngày từ khi giao nhiệm vụ: " + dayJob);
	}

	public static Date calenderDate(Calendar c) {
		Date convertedDate = c.getTime();
		// System.out.println("calendar -> date " + convertedDate);
		return convertedDate;
	}
}

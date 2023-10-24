package view.datetime;

import java.util.Calendar;

import static utils.DateUtils.*;

public class Ex05WeekdayCount {
	private static final String DEFAULT_PATTERN = "dd/MM/yyyy";

	public static void main(String[] args) {
		// đếm xem tháng hiện tại có bao nhiêu ngày chủ nhật
		Calendar c = Calendar.getInstance();

		// Ngày đầu tháng
		Calendar start = Calendar.getInstance();
		start.setTime(c.getTime());
		start.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("Đàua tháng: " + format(start, DEFAULT_PATTERN));

		// ngay cuoi thang
		Calendar end = clone(c);
		end.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Cuối tháng: " + format(end, DEFAULT_PATTERN));
	//	end.set(Calendar.YEAR,2024);
		
		// Đếm số ngày chủ nhật
		Calendar startOfMonth = clone(end);
		startOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		for (Calendar cal = start; cal.before(end);) {
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(format(cal, "dd/MM/yyyy EEEE"));
				cal.add(Calendar.DAY_OF_MONTH, 7);
			} else
				cal.add(Calendar.DAY_OF_MONTH, 1);
		}
	}

	public static Calendar clone(Calendar c) {
		Calendar cloned = Calendar.getInstance();
		cloned.setTime(c.getTime());
		return cloned;
	}
}

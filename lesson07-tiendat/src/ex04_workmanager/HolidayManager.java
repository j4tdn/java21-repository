package ex04_workmanager;

import java.util.*;
import java.util.Calendar;

public class HolidayManager {

	private List<Calendar> holidays = new ArrayList<>();

    public HolidayManager() {
        // Thêm các ngày nghỉ vào danh sách
    	holidays.add(createDate(1, 1, 2023));  
        holidays.add(createDate(2, 9, 2022)); 
        holidays.add(createDate(24, 12, 2022)); 
        holidays.add(createDate(25, 12, 2022)); 

        // Thêm các ngày nghỉ khác tại đây
    }

    public boolean isWeekend(Calendar date) {
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }

    public boolean isPublicHoliday(Calendar date) {
        for (Calendar holiday : holidays) {
            if (date.get(Calendar.YEAR) == holiday.get(Calendar.YEAR) &&
                date.get(Calendar.MONTH) == holiday.get(Calendar.MONTH) &&
                date.get(Calendar.DAY_OF_MONTH) == holiday.get(Calendar.DAY_OF_MONTH)) {
                return true;
            }
        }
        return false;
    }

    private Calendar createDate(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Tháng trong Calendar bắt đầu từ 0
        return calendar;
    }

}

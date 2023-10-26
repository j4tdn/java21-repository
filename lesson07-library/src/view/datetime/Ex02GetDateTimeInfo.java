package view.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02GetDateTimeInfo {
	public static void main(String[] args) {
		//Lấy thông tin thời điểm hiện tại với Timezone
		
		Calendar c = Calendar.getInstance();
		
		//+1. Ngày tháng năm
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) +1; //moth [0 -11]
		int year = c.get(Calendar.YEAR);
		String dmy = +day + "/" + month + "/" + year;
		System.out.println("1. Ngày tháng năm :" +dmy);
		
		
		//+2. Giờ 12-24, Phút giây
		int hour12 = c.get(Calendar.HOUR);
		int ap = c.get(Calendar.AM_PM);
		System.out.println("2. Giờ 12-24, Phút giây:" +hour12 + (ap ==1 ? "PM" :"AM"));
		
		
		//+3. Ngày trong tuần (thứ mấy) 1(sunday) 2, 3, 4, 5, 6 ,7 (saturday)
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("3. Ngày trong tuần (thứ mấy) 1(sunday) 2, 3, 4, 5, 6 ,7 (saturday) " +dow);  //in ra số 7 --> phải chuyển thành thứ 7
		String [] dayOfWeeks = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ 4", "Thứ Năm", "Thứ sáu", "Thứ bảy"};
		String dowAsString = dayOfWeeks[dow -1];
		
		System.out.println("dowAsString: ==>" + dowAsString);
		
		//+4. Đếm số ngày trong tháng, năm hiện tại >>Calendar
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH); //Hàm lấy giá trị tối đa của biến đang gọi
		System.out.println("daysInMoth: " + daysInMonth);
		
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("daysInYear:" +daysInYear);
		
		
		//+5 . Kiểm tra năm hiện tại có phải năm nhuận hay không
		
		GregorianCalendar gc = new GregorianCalendar();
		boolean isLeapYear = gc.isLeapYear(year);
		System.out.println("isLeapYear: " +isLeapYear);
		
		//+6 . Ngày đầu tiên trong tuần hiện tại là thứ mấy
		
		String fdow = dayOfWeeks[c.getFirstDayOfWeek() -1];
		System.out.println("fdow: " +fdow);  //thứ 2
		
		
		//+7 . Ngày đầu tiên trong tuần  hiện tại là thứ mấy
		
		int  fdowAsNumber = day + c.getFirstDayOfWeek() -dow ;
		System.out.println("fdowAsNumber: " +fdowAsNumber);
	}
}

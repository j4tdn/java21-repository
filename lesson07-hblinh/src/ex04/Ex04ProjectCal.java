package ex04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04ProjectCal {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		int workDay = 110;
		date.set(2022,5,7);
		// số ngày làm vc trên tuần: 5 ngày
		// thời gian làm xong dự án nếu tính cả thứ 7 và CN: 110/5 = 22 => 22*2 =154 days => addTime tiến (154-1)=153
		int cal = (workDay/5)*2+workDay;
		date.add(Calendar.DAY_OF_MONTH, cal-1);
		System.out.println(" Nhóm A phải bàn giao sản phẩm vào ngày: "+SimpleDate(date.getTime()));
	}
	public static String SimpleDate(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String timeNow = df.format(date);
		return timeNow;
	}
}

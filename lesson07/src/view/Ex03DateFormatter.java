package view;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormatter {
	public static void main(String[] args) {

		// java 7; DateFormat, SimpleDateFormat
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Date date = new Date();
		System.out.println("date" + df.format(date));
		
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
		//hàm format chỉ sử dụng với tham số kiểu Date --> phải convert c sang Date
		System.out.println("Calendar "+df.format(cDate));

	}
}

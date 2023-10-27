package leson07hthanh;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class tesst {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(new  Locale("vi", "VN"));
		c.set(2022, Calendar.JUNE, 7);
		solve(c);
	}

	public static void solve(Calendar c) {
		int count = 0;
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(c.getTime()));
		while (count < 110) {
			if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				count++;

			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(c.getTime()));
	}
}

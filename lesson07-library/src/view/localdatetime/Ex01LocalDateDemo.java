package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static utils.DateUtils.*;

public class Ex01LocalDateDemo {

	// LocalDate -->d/M/y --> weekday, dayOfMonth...
	//			 --> builder(advance)
	
		public static void main(String[] args) {
			
			LocalDate lDate = LocalDate.now()   // ngày hiện tại
					.withDayOfMonth(30)        // with tiếp sẽ set lại ngày tháng cần nhập
					.withMonth(3)
					.withYear(2020);	//28/06/2020
			LocalDate eDate = LocalDate.parse("24/10/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								.plusDays(1);  // hàm plusDay: cộng thêm ngày
			
			System.out.println("ldate: " + format(lDate, "dd/MM/yyyy EEEE"));
			System.out.println("edate: " + format(eDate, "dd/MM/yyyy EEEE"));
			
			//Hiệu giữa 2 localdate --> Dùng class Period
			
			Period period = Period.between(lDate, eDate);
			System.out.println("Period :" +period);  //P 3Y 3M 27D
			
			int years = period.getYears();
			int months = period.getMonths();
			int days = period.getDays();
			
			System.out.println("\nperiod toString -->"
					+ optional(years, "year")
					+ optional(months, "month")
					+ optional(days, "day"));
					
		}
		
	
		
		private static String format(LocalDate ldate, String pattern) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
			return dtf.format(ldate);
		}
}

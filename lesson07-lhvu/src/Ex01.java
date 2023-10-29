import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ngày bắt đầu hẹn hò:\nNgày/tháng/năm giờ:phút:giây");
		String sday = sc.nextLine();
		LocalDateTime startday = LocalDateTime.parse(sday, df);
		System.out.print("Bạn đã chia tay hay chưa? \nNhập:" + " Y " + "or" + " N " );
		String bday = sc.nextLine();
		
		
		if (bday.equalsIgnoreCase("Y")) {
			System.out.println("Nhập ngày chia tay" + "\nNgày/tháng/năm giờ:phút:giây ");
				String breakDayAsString = sc.nextLine();
				LocalDateTime breakDay = LocalDateTime.parse(breakDayAsString, df);
			Period period = Period.between(startday.toLocalDate(), breakDay.toLocalDate());
			Duration duration = Duration.between(startday.toLocalTime(), breakDay.toLocalTime());
			
			int years = period.getYears();
			int months = period.getMonths();
			int days = period.getDays();
			long hours = duration.toHours();
			long minutes = duration.toMinutesPart();
			long seconds = duration.toSecondsPart();
			
			System.out.println("\nTổng thời gian quen nhau: "
					+ optional(years, "year")
					+ optional(months, "month")
					+ optional(days, "day")
					+ optional(hours, "hour")
					+ optional(minutes, "minute")
					+ optional(seconds, "second"));
			
		}else {

			Period period = Period.between(startday.toLocalDate(), LocalDate.now());
		    Duration duration = Duration.between(startday.toLocalTime(), LocalDate.now());
		    
		    int years = period.getYears();
			int months = period.getMonths();
			int days = period.getDays();
			long hours = duration.toHours();
			long minutes = duration.toMinutesPart();
			long seconds = duration.toSecondsPart();
			
			System.out.println("\nTổng thời gian quen nhau: "
					+ optional(years, "year")
					+ optional(months, "month")
					+ optional(days, "day")
					+ optional(hours, "hour")
					+ optional(minutes, "minute")
					+ optional(seconds, "second"));
		}
	}
	public static String optional(long value, String unit) {
		if (value == 0 ) {
			return  "";
		}
		return value + " " + unit + (value > 1 ? "s" : "") + " ";
	}
}

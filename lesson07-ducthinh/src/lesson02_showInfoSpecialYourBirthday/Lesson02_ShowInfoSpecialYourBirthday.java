package lesson02_showInfoSpecialYourBirthday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeParseException;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Lesson02_ShowInfoSpecialYourBirthday {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		LocalDate birthday = null;
		while(true) {
			try {
				System.out.println("Input your birthday(YYYY-MM-DD): ");
				String birthdayStr = ip.nextLine();
				birthday = LocalDate.parse(birthdayStr);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Error " + e.getMessage());
			}
		}
		
		
		
		int day = birthday.getDayOfYear();		
		int dayLeft = birthday.lengthOfYear() - birthday.getDayOfYear();
		DayOfWeek dow = birthday.getDayOfWeek();
		WeekFields weekFields = WeekFields.of(Locale.US);
		int woy = birthday.get(weekFields.weekOfWeekBasedYear());
		int wom = birthday.get(weekFields.weekOfMonth());
		YearMonth yearmonth = YearMonth.of(birthday.getYear(), birthday.getMonth());
		int maxDayInMonth = yearmonth.lengthOfMonth();		
		int doy = 365;
		if(Year.of(birthday.getYear()).isLeap()) {
			doy = 366;
		}
		
				
		System.out.println("It is day number " + day + " of the year, " + dayLeft + " days left.");
		System.out.println("It is " + dow + " number " + woy + " of 52 in " + birthday.getYear());
		System.out.println("It is " + dow + " number " + wom + " out of " + wom + " in " + birthday.getMonth() +" "+ birthday.getYear());
		System.out.println("Year " + birthday.getYear() + " has " + doy + " day");
		System.out.println(birthday.getMonth() + " " + birthday.getYear() + " has " + maxDayInMonth + " days");
		
		
		
	}
}

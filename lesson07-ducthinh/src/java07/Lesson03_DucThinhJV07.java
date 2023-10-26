package java07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

import dateutils.DateUtils;

public class Lesson03_DucThinhJV07 {
	static Scanner ip = new Scanner(System.in);
	static Date date = new Date();
	static Calendar c = Calendar.getInstance();
	public static void main(String[] args) {		
		while(true) {
			displayMenu();
			int choice = getChoice();
			switch(choice) {
			case 1:
				currentTime();
				break;
			case 2:
				displayLastdayOfCurrentMonth();
				break;
			case 3:
				displayFirstdayAndLastdayOfCurrentWeek();
				break;
			case 4:
				displayDayOfWeekOfYear();
				break;
			case 5:
				displayDayThatAfter20days();
				break;
			case 6:
				displayNumberOfDaysYouLived();
				break;
			case 7:
				System.out.println("Program are exiting....");
				System.exit(1);
			}
		}
	}
	
	public static void displayMenu() {
		System.out.println("================MENU==================");
		System.out.println("1.Show current time of anyarea.");
		System.out.println("2.Show last day of current month.");
		System.out.println("3.Show first day and last day of current week.");
		System.out.println("4.Show day of week of year.");
		System.out.println("5.Show day after 20 days.");
		System.out.println("6.Show days number you lived.");
		System.out.println("7.exit.");


	}
	
	public static int getChoice() {
		System.out.println("Input your choice: ");
		int num;
		while(true) {
			try {
				num = Integer.parseInt(ip.nextLine());
				if(num < 1 || num > 7) {
					System.out.println("Your choice must be in range[1;7]");
				}else {
					return num;
				}
			} catch (NumberFormatException e) {
				System.out.println("error: "+e.getMessage());
			}
		}
	}
	
	//currenttime function
	public static void currentTime() {		
		System.out.println("Input id area: ");
		String idTimeZone = ip.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone(idTimeZone));
		String formatedDate = sdf.format(date);
		System.out.println("Current Time in " + idTimeZone + " is " + formatedDate);
	}
	
	//displayLastdayOfCurrentMonth function
	public static void displayLastdayOfCurrentMonth() {		
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		Date lastDate = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String formatedDate = sdf.format(lastDate);
		System.out.println("Last day of month is " + formatedDate);
	}
	
	//displayFirstdayAndLastdayOfCurrentWeek function
	public static void displayFirstdayAndLastdayOfCurrentWeek() {
		int firstDOW = c.getActualMinimum(Calendar.DAY_OF_WEEK);
		int lastDOW = c.getActualMaximum(Calendar.DAY_OF_WEEK);
		String[] daysOfWeek = {" ", "Monday", "TUESDAY", "WEDNESDAY", "Thursday", "FRIDAY", "SATURDAY", "SUNDAY"};
		System.out.println("fisrt day of week is " + daysOfWeek[firstDOW]);
		System.out.println("last  day of week is " + daysOfWeek[lastDOW]);
	}
	// displayDayOfWeekOfYear function
	public static void displayDayOfWeekOfYear() {
		c.setTime(date);
		int woy = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Current day is being weeks " + woy + " in year");
	}
	
	// displayDayThatAfter20days function
	public static void displayDayThatAfter20days() {
		c.add(Calendar.DAY_OF_MONTH, 20);
		int dayAfter20Days = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("Number of days after 20 days is " + dayAfter20Days);
	}
	
	// displayNumberOfDaysYouLived();
	public static void displayNumberOfDaysYouLived() {
	    Scanner ip = new Scanner(System.in);

	    System.out.println("Your birthday: (dd/MM/yyyy)");
	    String birthday = ip.nextLine();

	    // Chuyển đổi chuỗi ngày tháng năm sinh thành đối tượng Date
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date birthdayDate = null;
	    try {
	        birthdayDate = dateFormat.parse(birthday);
	    } catch (ParseException e) {
	        System.out.println("Lỗi: Ngày không hợp lệ.");
	        return;
	    }

	    Calendar cBirthday = Calendar.getInstance();
	    cBirthday.setTime(birthdayDate);
	    Calendar cCurrent = Calendar.getInstance();

	    // Lấy thời gian hiện tại
	    Date currentDate = new Date();
	    cCurrent.setTime(currentDate);

	    // Tính số ngày đã sống
	    long diffMillis = cCurrent.getTimeInMillis() - cBirthday.getTimeInMillis();
	    long daysAlive = diffMillis / (1000 * 60 * 60 * 24);

	    System.out.println("Số ngày bạn đã sống là " + daysAlive + " ngày");
	}

}

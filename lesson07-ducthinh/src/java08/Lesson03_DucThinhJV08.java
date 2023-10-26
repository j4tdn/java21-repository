package java08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lesson03_DucThinhJV08 {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getChoice();
            switch (choice) {
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
        System.out.println("1.Show current time of any area.");
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
        while (true) {
            try {
                num = Integer.parseInt(ip.nextLine());
                if (num < 1 || num > 7) {
                    System.out.println("Your choice must be in range[1;7]");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("error: " + e.getMessage());
            }
        }
    }

    // currentTime function
    public static void currentTime() {
        System.out.println("Input id area: ");
        String idTimeZone = ip.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = LocalDate.now().format(dtf);
        System.out.println("Current Time in " + idTimeZone + " is " + formattedDate);
    }

    // displayLastdayOfCurrentMonth function
    public static void displayLastdayOfCurrentMonth() {
        LocalDate currentDate = LocalDate.now();
        LocalDate lastDayOfMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = lastDayOfMonth.format(dtf);
        System.out.println("Last day of month is " + formattedDate);
    }

    // displayFirstdayAndLastdayOfCurrentWeek function
    public static void displayFirstdayAndLastdayOfCurrentWeek() {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek firstDayOfWeek = DayOfWeek.MONDAY; // Chọn ngày đầu tiên của tuần
        DayOfWeek lastDayOfWeek = DayOfWeek.SUNDAY; // Chọn ngày cuối cùng của tuần
        LocalDate firstDayOfWeekDate = currentDate.with(DayOfWeek.MONDAY);
        LocalDate lastDayOfWeekDate = currentDate.with(DayOfWeek.SUNDAY);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedFirstDay = firstDayOfWeekDate.format(dtf);
        String formattedLastDay = lastDayOfWeekDate.format(dtf);
        System.out.println("First day of the week is " + formattedFirstDay);
        System.out.println("Last day of the week is " + formattedLastDay);
    }

    // displayDayOfWeekOfYear function
    public static void displayDayOfWeekOfYear() {
        LocalDate currentDate = LocalDate.now();
        int dayOfYear = currentDate.getDayOfYear();
        System.out.println("Current day is being day " + dayOfYear + " of the year");
    }

    // displayDayThatAfter20days function
    public static void displayDayThatAfter20days() {
        LocalDate currentDate = LocalDate.now();
        LocalDate after20Days = currentDate.plusDays(20);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = after20Days.format(dtf);
        System.out.println("Number of days after 20 days is " + formattedDate);
    }

    // displayNumberOfDaysYouLived();
    public static void displayNumberOfDaysYouLived() {
        System.out.println("Your birthday: (dd/MM/yyyy)");
        String birthday = ip.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthdayDate = LocalDate.parse(birthday, dtf);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthdayDate, currentDate);
        int daysAlive = period.getDays();
        int monthsAlive = period.getMonths();
        int yearsAlive = period.getYears();
        System.out.println("Số ngày bạn đã sống là " + daysAlive + " ngày, " + monthsAlive + " tháng, " + yearsAlive + " năm.");
    }
}


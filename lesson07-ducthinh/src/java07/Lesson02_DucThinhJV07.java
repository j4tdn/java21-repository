package java07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Lesson02_DucThinhJV07 {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        Date current = new Date();
        int count = 0;

        boolean check = false;
        Date birthday = null;
        while (!check) {
            System.out.println("Input Date (YYYY-MM-DD): ");
            String birthdayStr = ip.nextLine();

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                birthday = dateFormat.parse(birthdayStr);
                check = true;
            } catch (ParseException e) {
                System.out.println("error: " + e.getMessage());
            }
        }

        Calendar birthdayCalendar = new GregorianCalendar();
        birthdayCalendar.setTime(birthday);

        int doy = birthdayCalendar.get(Calendar.DAY_OF_YEAR);
        int lday = birthdayCalendar.getActualMaximum(Calendar.DAY_OF_YEAR) - doy;
        int woy = birthdayCalendar.get(Calendar.WEEK_OF_YEAR);
        int wom = birthdayCalendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int wim = birthdayCalendar.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
        int mDoy = birthdayCalendar.getActualMaximum(Calendar.DAY_OF_YEAR);

        int month = birthdayCalendar.get(Calendar.MONTH) + 1;
        int year = birthdayCalendar.get(Calendar.YEAR);

        String[] daysOfWeek = new String[] {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        String dow = daysOfWeek[birthdayCalendar.get(Calendar.DAY_OF_WEEK) - 1];

        System.out.println("It is number " + doy + " of the year " + lday + " days left");
        System.out.println("It is " + dow + " number " + woy + " out of 52 in " + year);
        System.out.println("It is " + dow + " number " + wom + " out of " + wim +
                " in " + month + " " + year);
        System.out.println("Year " + year + " has " + mDoy + " days");
        System.out.println(month + " " + year + " has " + birthdayCalendar.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
    }
}


package java07;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Lesson01_DucThinh {
    static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        LocalDate startDate = null;
        LocalDate breakupDate = null;
        boolean check = false;
        
        while (!check) {
            System.out.println("Input time to start dating (YYYY-MM-DD): ");
            String startDatingDateStr = ip.nextLine();
            System.out.println("Input time to breakup (YYYY-MM-DD)(if applicable) or space to continue: ");
            String breakupDateStr = ip.nextLine();

            try {
                startDate = LocalDate.parse(startDatingDateStr);
                breakupDate = breakupDateStr.isEmpty() ? LocalDate.now() : LocalDate.parse(breakupDateStr);
                if(breakupDate.isBefore(startDate)) {
                	System.out.println("Error: breakupDate before startDate, please input again!");
                }else {
                	check = true;
                }              
            } catch (DateTimeParseException e) {
                System.out.println("error: " + e.getMessage());
            }
        }

        Period relationshipPeriod = Period.between(startDate, breakupDate);
        System.out.println("Mối tình đã bắt đầu được: " );
        System.out.print(relationshipPeriod.getYears() + " năm ");
        System.out.print(relationshipPeriod.getMonths() + " tháng ");
        System.out.println(relationshipPeriod.getDays() + " ngày");
        
    }
}



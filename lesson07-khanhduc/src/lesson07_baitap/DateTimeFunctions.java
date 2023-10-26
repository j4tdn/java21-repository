package lesson07_baitap;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class DateTimeFunctions {
	public static void main(String[] args) {
        // Chức năng 1: Xem thời gian hiện tại ở khu vực bất kỳ
        getCurrentDateTime();

        // Chức năng 2: In ngày cuối cùng của tháng hiện tại
        printLastDayOfMonth();

        // Chức năng 3: Xem ngày đầu tiên và cuối cùng của tuần hiện tại
        printFirstAndLastDayOfWeek();

        // Chức năng 4: Xem ngày hiện tại đang ở tuần thứ mấy trong năm
        printCurrentWeekNumber();

        // Chức năng 5: Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy
        printDateAfter20Days();

        // Chức năng 6: Nhập vào ngày tháng năm sinh và kiểm tra số ngày đã sống
        calculateDaysSinceBirth();
    }

    // Phương thức cho chức năng 1
    public static void getCurrentDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String currentDateTime = sdf.format(date);
        System.out.println("Thời gian hiện tại: " + currentDateTime);
    }

    // Phương thức cho chức năng 2
    public static void printLastDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Ngày cuối cùng của tháng hiện tại: " + lastDay + "/" + month + "/" + year);
    }

    // Phương thức cho chức năng 3
    public static void printFirstAndLastDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String firstDay = sdf.format(calendar.getTime());

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        String lastDay = sdf.format(calendar.getTime());

        System.out.println("Ngày đầu tiên của tuần: " + firstDay);
        System.out.println("Ngày cuối cùng của tuần: " + lastDay);
    }

    // Phương thức cho chức năng 4
    public static void printCurrentWeekNumber() {
        Calendar calendar = Calendar.getInstance();
        int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Tuần hiện tại trong năm: Tuần " + weekNumber);
    }

    // Phương thức cho chức năng 5
    public static void printDateAfter20Days() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 20);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy, E");
        String dateAfter20Days = sdf.format(calendar.getTime());
        System.out.println("Sau 20 ngày là ngày: " + dateAfter20Days);
    }

    // Phương thức cho chức năng 6
    public static void calculateDaysSinceBirth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
        String input = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date birthDate = sdf.parse(input);
            Date currentDate = new Date();
            long diffInMilliseconds = currentDate.getTime() - birthDate.getTime();
            long days = diffInMilliseconds / (24 * 60 * 60 * 1000);
            System.out.println("Bạn đã sống được " + days + " ngày.");
        } catch (Exception e) {
            System.out.println("Ngày tháng năm sinh không hợp lệ.");
        }
    }
}

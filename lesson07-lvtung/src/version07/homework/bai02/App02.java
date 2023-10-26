package version07.homework.bai02;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import static utils.DateUtils.*;

public class App02 {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.print("Nhập ngày tháng năm (dd/MM/yyyy): ");
		
        String inputDate = scanner.nextLine();
		
	}
}

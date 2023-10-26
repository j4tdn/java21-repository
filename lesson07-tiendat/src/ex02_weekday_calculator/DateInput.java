package ex02_weekday_calculator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateInput {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public Date getDateFromUser() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nhập ngày tháng năm (dd/MM/yyyy): ");
			String dateStr = scanner.nextLine();
			return dateFormat.parse(dateStr);
		} catch (Exception e) {
			System.out.println("Ngày tháng không hợp lệ. Hãy nhập lại.");
			return getDateFromUser();
		}
	}

}

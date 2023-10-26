package ex04_workmanager;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		HolidayManager holidayManager = new HolidayManager();
		ProjectDeliveryCalculator calculator = new ProjectDeliveryCalculator();

		try {
			Date startDate = dateFormat.parse("07/06/2022");
			int workingDays = 110;

			Date deliveryDate = calculator.calculateDeliveryDate(startDate, workingDays, holidayManager);
			System.out.println("Delivery date: " + dateFormat.format(deliveryDate));
		} catch (Exception e) {
			System.out.println("Invalid date format.");
		}
	}

}

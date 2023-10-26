package ex03_datefunctions;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateFunctions dateFunctions = new DateFunctions();

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Get current time in any time zone.");
			System.out.println("2. Get the last day of the current month.");
			System.out.println("3. Get the first and last day of the current week.");
			System.out.println("4. Get the current week number.");
			System.out.println("5. Calculate a date in the future.");
			System.out.println("6. Calculate days since your birthday.");
			System.out.println("0. Exit");

			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				System.out.println("Current time: " + dateFunctions.getCurrentTime());
				break;
			case 2:
				System.out.println("Last day of the month: " + dateFunctions.getLastDayOfMonth());
				break;
			case 3:
				System.out.println(dateFunctions.getFirstAndLastDayOfWeek());
				break;
			case 4:
				System.out.println("Current week number: " + dateFunctions.getCurrentWeekNumber());
				break;
			case 5:
				System.out.print("Enter the number of days in the future: ");
				int days = scanner.nextInt();
				scanner.nextLine();
				System.out.println(dateFunctions.getDateInFuture(days));
				break;
			case 6:
				System.out.print("Enter your birthday (dd/MM/yyyy): ");
				String birthdayStr = scanner.nextLine();
				try {
					Date birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthdayStr);
					int daysSinceBirthday = dateFunctions.calculateDaysSinceBirthday(birthday);
					System.out.println("You have lived for " + daysSinceBirthday + " days.");
				} catch (Exception e) {
					System.out.println("Invalid date format. Please use dd/MM/yyyy.");
				}
				break;
			case 0:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
	}
}

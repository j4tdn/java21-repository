package ex02_weekday_calculator;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateInformationCalculator calculator = new DateInformationCalculator();
        DateInput dateInput = new DateInput();
        Menu menu = new Menu();

        int choice;

        do {
            menu.displayMenu();
            choice = menu.getUserChoice();

            switch (choice) {
                case 1:
                    Date date1 = dateInput.getDateFromUser();
                    calculator.calculateDateInformation(date1);
                    break;
                case 2:
                    Date date2 = dateInput.getDateFromUser();
                    calculator.calculateDateInformation(date2);
                    break;
                case 3:
                    Date date3 = dateInput.getDateFromUser();
                    calculator.calculateDateInformation(date3);
                    break;
                case 4:
                    Date date4 = dateInput.getDateFromUser();
                    calculator.calculateDateInformation(date4);
                    break;
                case 5:
                    Date date5 = dateInput.getDateFromUser();
                    calculator.calculateDateInformation(date5);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy nhập lại.");
            }

        } while (choice != 6);
    }
}

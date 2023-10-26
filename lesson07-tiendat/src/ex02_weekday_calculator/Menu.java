package ex02_weekday_calculator;

import java.util.Scanner;

public class Menu {

	public void displayMenu() {
        System.out.println("Chọn chức năng:");
        System.out.println("1. Tính ngày trong năm và ngày còn lại.");
        System.out.println("2. Tính ngày thuộc tuần và tuần trong năm.");
        System.out.println("3. Tính ngày trong tháng.");
        System.out.println("4. Tính số ngày trong năm.");
        System.out.println("5. Tính số ngày trong tháng.");
        System.out.println("6. Thoát.");
    }

    public int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lựa chọn: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lựa chọn không hợp lệ. Hãy nhập lại.");
            return getUserChoice();
        }
    }
}

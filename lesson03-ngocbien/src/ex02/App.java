package ex02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int a;
		int n = 0;
		Vehicle[] vhc = null;
		Boolean exit = true;

		do {
			System.out.println("1. Nhập thông tin và tạo N đối tượng xe");
			System.out.println("2. Xuất bản kê khai trước bạ của các xe");
			System.out.println("3. Thoát chương trình");

			System.out.print("Lựa chọn (1-3): ");

			a = Integer.parseInt(ip.nextLine());

			switch (a) {
			case 1:
				System.out.print("Nhập số lượng xe: ");
				n = Integer.parseInt(ip.nextLine());
				vhc = new Vehicle[n];

				for (int i = 0; i < n; i++) {
					vhc[i] = new Vehicle();
					System.out.println("Nhập thông tin");
					System.out.print("Tên chủ xe: ");
					vhc[i].setName(ip.nextLine());
					System.out.print("Loại xe: ");
					vhc[i].setVehicle(ip.nextLine());
					System.out.print("Dung tich: ");
					vhc[i].setCapacity(Integer.parseInt(ip.nextLine()));
					System.out.print("trị giá: ");
					vhc[i].setCost(Double.parseDouble(ip.nextLine()));
					System.out.println("\n===\n");
				}
				break;
			case 2:
				System.out.printf("%-20s %-15s %-15s %-20s %-20s %n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
						"Thuế phải nộp");
				System.out.println("===========================================================================");
				for (Vehicle vhcVehicle : vhc) {
					DecimalFormat df = new DecimalFormat("####.00");
					System.out.printf("%-20s %-15s %-15s %-20s %-20s %n", vhcVehicle.getName(), vhcVehicle.getVehicle(),
							vhcVehicle.getCapacity(), df.format(vhcVehicle.getCost()),
							df.format(VehicleUtils.tax(vhcVehicle)));
					break;
				}
			case 3:
				exit = false;
				break;
			}
		} while (exit);

	}

}

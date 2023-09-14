package ex02;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int n;
		System.out.print("Nhập số lượng xe: ");
		n = Integer.parseInt(ip.nextLine());

		Vehicle[] vehicle = new Vehicle[n];
		for (int i = 0; i < vehicle.length; i++) {
			System.out.println("Xe thứ " + (i + 1));
			ip.nextLine();
			System.out.println("Tên chủ xe: ");
			String tenChuXe = ip.nextLine();
			System.out.println("Loại xe: ");
			String loaiXe = ip.nextLine();
			System.out.println("Dung tích: " + "cc");
			int dungTich = ip.nextInt();
			System.out.println("Trị giá: ");
			double triGia = ip.nextDouble();

			vehicle[i] = new Vehicle(tenChuXe, loaiXe, dungTich, triGia);

		}
		System.out.printf("%-20s%-10s%20s%20s%20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("=================================================================================================");
		for (Vehicle vhc : vehicle) {
			System.out.printf("%-20s%-10s%20d%20.2f%20.2f\n", vhc.getTenChuXe(), vhc.getLoaiXe(), vhc.getDungTich(), vhc.getTriGia(), CalcTax.tax(vhc));
		}
	}

}

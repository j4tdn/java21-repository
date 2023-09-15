package ex02vehicle;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng xe n: ");
		int n = Integer.parseInt(ip.nextLine());

		Vehicle[] vehicle = new Vehicle[n];
		for (int i = 0; i < vehicle.length; i++) {
			System.out.println("Thông tin xe thứ " + (i + 1) + ":");
			ip.nextLine();
			System.out.print(" Nhập tên chủ xe: ");
			String name = ip.nextLine();
			System.out.print("Nhập Loại xe: ");
			String type = ip.nextLine();
			System.out.print("Nhập Dung tích xe:");
			int cc = ip.nextInt();
			System.out.print("Nhập giá xe: ");
			double cost = ip.nextDouble();

			vehicle[i] = new Vehicle(name, type, cc, cost);

		}
		for (Vehicle vhc : vehicle) {

			double tax = 0;
			if (vhc.getCc() < 100) {
				tax = vhc.getCost() * 0.01;
			} else if (vhc.getCc() <= 200) {
				tax = vhc.getCost() * 0.03;
			} else {
				tax = vhc.getCost() * 0.05;
			}
			System.out.println("Tên chủ xe"+ "\t"+ "Loại Xe" + "\t" + "Dung tích" + "\t" + "Trị giá" + "\t\t" + "Thuế phải nộp");
			System.out.print(vhc.getName() + "\t");
			System.out.print(vhc.getType() + "\t");
			System.out.print(vhc.getCc() + "\t\t");
			System.out.print(vhc.getCost() + "\t\t");
			System.out.println(tax + "\n");
			System.out.println("-----------------------------------------------------------------");
		}

	}
}

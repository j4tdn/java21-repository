package ex2;

import java.util.Scanner;

public class Utils {

	public static Vehicle[] inputData() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n = ");
		int n = Integer.parseInt(ip.nextLine());
		Vehicle[] vehicles = new Vehicle[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin xe thứ " + (i + 1) + ": ");
			System.out.print("Nhập tên chủ xe:");
			
			String ownerName = ip.nextLine();
			
			System.out.print("Nhập loại xe:");
			String typeOfVehicle = ip.nextLine();
			
			System.out.print("Nhập dung tích xe:");
			int cc = Integer.parseInt(ip.nextLine());
			
			System.out.print("Nhập giá trị xe:");
			double cost = Double.parseDouble(ip.nextLine());
			
			vehicles[i] = new Vehicle(ownerName, typeOfVehicle, cc, cost);
		}
		ip.close();
		return vehicles;
	}

	public static void outputData(Vehicle[] vehicles) {
		System.out.println("Tên chủ xe\t Loại xe\tDung tích \tTrị giá \t\tThuế phải nộp");
		for (Vehicle vehicle : vehicles) {
			double tax = 0;
			if(vehicle.getCc() < 100) {
				tax = vehicle.getCost() * 0.01;
			} else if(vehicle.getCc() <= 200) {
				tax = vehicle.getCost() * 0.03;
			} else {
				tax = vehicle.getCost() * 0.05;
			}
			
			System.out.print(vehicle.getOwnerName() + "\t\t");
			System.out.print(vehicle.getTypeOfVehicle() + "\t\t");
			System.out.print(vehicle.getCc() + "\t\t");
			System.out.print(vehicle.getCost() + "\t\t");
			System.out.println(tax + "\n");
		}
		
	}
}

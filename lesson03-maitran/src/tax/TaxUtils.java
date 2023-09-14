package tax;

import java.util.Scanner;

public class TaxUtils {

	private static Scanner ip = new Scanner(System.in);
	private static Vehicle[] vehicles;

	public static Vehicle[] input() {
		System.out.println("Enter amount of vehicles: ");
		int n = ip.nextInt();
		vehicles = new Vehicle[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Vehicle " + (i + 1) + ":");
			ip.nextLine();
			System.out.println("Enter vehicle's owner: ");
			String name = ip.nextLine().trim();
			System.out.println("Enter type of vehicle: ");
			String type = ip.nextLine().trim();
			System.out.println("Enter capacity of your vehicle: ");
			double capacity = ip.nextDouble();
			System.out.println("Enter the price of your vehicle: ");
			double price = ip.nextDouble();

			Owner owner = new Owner(name);
			vehicles[i] = new Vehicle(owner, type, price, capacity);
		}
		return vehicles;
	}

	public static void display() {
		System.out.printf("\n%-15s%-20s%-15s%-15s%-15s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
				"Thuế phải nộp");
		System.out.println("-----------------------------------------------------------------------------------");

		for (Vehicle vehicle : vehicles) {
			double tax = calculateTax(vehicle.getPrice(), vehicle.getCapacity());
			System.out.printf("%-15s%-20s%-15.2f%-15.2f%-15.2f\n", vehicle.getOwner().getName(), vehicle.getType(),
					vehicle.getCapacity(), vehicle.getPrice(), tax);
		}
	}

	private static double calculateTax(double price, double capacity) {
		double taxRate;
		if (capacity < 100) {
			taxRate = 0.01;
		} else if (capacity <= 200) {
			taxRate = 0.03;
		} else {
			taxRate = 0.05;
		}

		return price * taxRate;
	}
}

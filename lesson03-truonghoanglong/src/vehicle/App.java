package vehicle;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Nhập số lượng xe: ");
		Scanner ip = new Scanner(System.in);
		int n = Integer.parseInt(ip.nextLine());
		
		Vehicle[] vehicle = new Vehicle[n];
		for (int i = 0; i < vehicle.length; i++) {
			
			System.out.println("Tên chủ xe");
			String name = ip.nextLine();
			
			System.out.println("Tên loại xe");
			String type = ip.nextLine();
			
			System.out.println("Dung tích");
			double capacity= ip.nextDouble();
			
			System.out.println("Trị giá");
			double price = ip.nextDouble();
			
			vehicle[i] = new Vehicle(name, type, capacity, price);		
		}
		System.out.println("Tên chủ xe" +"		"+ "Tên loại xe" +"		"+ "Dung tích" +"		"+ "Giá trị xe" +"		"+ "Thuế");
		for (Vehicle vhc : vehicle) {
			System.out.println(vhc.getName() +"			"+ vhc.getType() +"			"+ vhc.getCapacity() +"			"+ vhc.getPrice() +"		"+ getTax(vhc));
		}
		
	}
	
	public static double getTax (Vehicle vehicle) {
		if (vehicle.getCapacity() < 100) {
			return vehicle.getPrice() * 0.01;
		} else if (vehicle.getCapacity() >= 100 & vehicle.getCapacity() <= 200) {
			return vehicle.getPrice() * 0.03;
		} else {
			return vehicle.getPrice() * 0.05;
		}	
	}
	
}

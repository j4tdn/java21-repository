package ex02dangkimuaxe;

import java.util.List;

public class VehicleManager {
		
	public static void addVeHicle(List<Vehicle> arr) {
		
		String host = Validate.inputString("Enter host: ");	
		
		String model = Validate.inputString("Enter model: ");
		
		double capicity = Validate.inputDouble("Enter capicity: ");
		
		double price = Validate.inputDouble("Enter price: ");
		
		Vehicle vehicle = new Vehicle(host, model, capicity, price);
		
		arr.add(vehicle);	
		
		System.out.println("Succesfull!!!");
	}
	
	public static void printVehicle(List<Vehicle> arr) {
		for (Vehicle v : arr) {
			System.out.println(v);
		}
	}
	
}

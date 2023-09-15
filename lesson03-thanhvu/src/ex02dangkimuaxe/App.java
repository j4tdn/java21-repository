package ex02dangkimuaxe;

import java.util.ArrayList;
import java.util.List;

public class App {

	private static List<Vehicle> arr = new ArrayList<>();
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1. Enter information");
			System.out.println("2. Export registration tax declaration of vehicles");
			System.out.println("3. Exit");
			choice = Validate.inputIntMinMax("Enter choice: ", 1, 3);
			
			switch (choice) {
			case 1: {
				VehicleManager.addVeHicle(arr);
				break;
			}
			case 2: {
				VehicleManager.printVehicle(arr);
				break;
			}
			case 3: {
				System.out.println("Thank you for using service!");
				break;
			}
			}
		} while (choice > 0 && choice < 3);
		
	}
}

package ex02;

import java.util.Scanner;

public class VehicleUtils {

	private VehicleUtils() {

	}

	public static double tax(Vehicle vehicle) {
		double tax = 0;
		if (vehicle.getCapacity() < 100) {
			tax = vehicle.getCost() * 0.01;
		} else if (vehicle.getCapacity() <= 200) {
			tax = vehicle.getCost() * 0.03;
		} else {
			tax = vehicle.getCost() * 0.05;
		}
		return tax;
	}
	
	
		
	}


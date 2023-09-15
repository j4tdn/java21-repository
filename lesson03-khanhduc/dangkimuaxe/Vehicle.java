package dangkimuaxe;

import java.util.Scanner;

class Vehicle {
	private String name;
	private String brand;
	private int engineDisplacement;
	private double price;

	public Vehicle( String name,String brand, int engineDisplacement, double price) {
		this.name = name;
		this.brand = brand;
		this.engineDisplacement = engineDisplacement;
		this.price = price;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getEngineDisplacement() {
		return engineDisplacement;
	}


	public void setEngineDisplacement(int engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double calculateTax() {
		if (engineDisplacement < 100) {
			return price * 0.01;
		} else if (engineDisplacement >= 100 && engineDisplacement <= 200) {
			return price * 0.03;
		} else {
			return price * 0.05;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số lượng xe: ");
		int numberOfVehicles = scanner.nextInt();

		Vehicle[] vehicles = new Vehicle[numberOfVehicles];

		for (int i = 0; i < numberOfVehicles; i++) {
			System.out.println("Nhập thông tin cho xe thứ " + (i + 1) + ":");
			scanner.nextLine();
			System.out.println("Tên Chủ Xe: ");
			String name = scanner.nextLine();
			System.out.print("Hãng sản xuất: ");
			String brand = scanner.next();
			System.out.print("Dung tích xylanh (cc): ");
			int engineDisplacement = scanner.nextInt();
			System.out.print("Trị giá xe: ");
			double price = scanner.nextDouble();

			vehicles[i] = new Vehicle(name, brand, engineDisplacement, price);
		}

		
		System.out.println("Tên Chủ Xe | Hãng sản xuất | Dung tích xylanh | Giá Trị Xe | Thuế trước bạ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------");

		for (Vehicle vehicle : vehicles) {
			double tax = vehicle.calculateTax(); 
			System.out.printf("%-12s  %-14s  %-18d  %-12.2f  %.2f\n", vehicle.name,vehicle.getBrand(), vehicle.getEngineDisplacement(),vehicle.price, tax);
		}

		scanner.close();
	}	
}

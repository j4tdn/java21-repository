package carmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    ArrayList<Vehicle> vehicles = new ArrayList<>(); 
    Scanner scanner = new Scanner(System.in);

    while (true) {
      
      System.out.println("\nENTER VEHICLE INFORMATION");
      
      System.out.print("Owner name: ");
      String ownerName = scanner.nextLine();

      System.out.print("Vehicle type: ");
      String type = scanner.nextLine();

      System.out.print("Engine capacity (cc): ");
      int capacity = scanner.nextInt();

      System.out.print("Price: ");
      double price = scanner.nextDouble();

      // Khởi tạo giá trị cho các đối tượng
      Vehicle vehicle = new Vehicle(ownerName, type, capacity, price, 0);

      // Thêm các đối tượng vào list đã khởi tạo trước đó
      vehicles.add(vehicle);

      // -------------------------
      System.out.print("Continue (y/n)? ");
      String choice = scanner.next();
      if (choice.equalsIgnoreCase("n")) {
        break;
      }

    }

    // In thông tin ra cửa sổ console
    System.out.println("\nVEHICLE INFORMATION");
    for (Vehicle v : vehicles) {
      v.printInfo(); 
    }

    scanner.close();

  }

}
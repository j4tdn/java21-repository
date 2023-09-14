package view;

import bean.Vehicle;
import java.util.Scanner;
import utils.OrderUtils;

public class App2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng xe: ");
        int n = Integer.parseInt(sc.nextLine());
        
        Vehicle[] vehicles = new Vehicle[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho xe thứ: " + (i+1));
            System.out.print("Tên chủ xe: ");
            String ownerName = sc.nextLine();
            System.out.print("Hãng xe: ");
            String branch = sc.nextLine();
            System.out.print("Dung tích xylanh: ");
            int engineCapacity = Integer.parseInt(sc.nextLine());
            System.out.print("Trị giá: ");
            long vehiclePrice = Long.parseLong(sc.nextLine());
            
            vehicles[i] = new Vehicle(ownerName, branch, engineCapacity, vehiclePrice);
        }
        
        System.out.println("Tên khách hàng\t Loại xe \tDung tích \tTrị giá \t\tThuế phải nộp");
        System.out.println("===============================================================================");
        for (int i = 0; i < n; i++) {
            OrderUtils.displayTax(vehicles[i]);
        }
        sc.close();
    }
}

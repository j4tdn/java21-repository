package utils;

import java.time.LocalDate;
import java.time.Month;
import bean.Item;
import bean.ItemDetail;
import bean.Order;
import bean.Vehicle;
import bean.Matrix;
import java.util.Scanner;
import javax.sound.sampled.DataLine;

public class OrderUtils {

    private OrderUtils() {
    }

    public static double export(Order order) {
        System.out.println("\t=====HÓA ĐƠN======");

        System.out.print("Tên KH: " + order.getCustomer().getName());
        System.out.println("\tĐịa chỉ: " + order.getCustomer().getAddress());

        double totalOfMoney = 0;
        ItemDetail[] ids = order.getItemDetails();

        for (ItemDetail id : ids) {
            Item item = id.getItem();
            int quatity = id.getQuantity();
            System.out.print("Tên sản phẩm: " + item.getId());
            System.out.println("\tSố lượng: " + quatity);
            System.out.println("Giá: " + item.getCost());
        }

        for (ItemDetail id : ids) {
            Item item = id.getItem();
            int quatity = id.getQuantity();
            double idCost = item.getCost() * quatity;
            if (item.getCost() > 590 && LocalDate.of(2023, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
                idCost *= 0.9;
            }
            totalOfMoney += idCost;
        }
        return totalOfMoney;
    }

    // hàm tính thuế phải trả
    public static double calculateTax(Vehicle vehicle) {
        if (vehicle.getEngineCapacity() < 100) {
            return vehicle.getVehiclePrice() * 0.01;
        } else if (vehicle.getEngineCapacity() >= 100 && vehicle.getEngineCapacity() <= 200) {
            return vehicle.getVehiclePrice() * 0.03;
        } else {
            return vehicle.getVehiclePrice() * 0.05;
        }
    }

    // hàm xuất thông tin xe
    public static void displayTax(Vehicle vehicle) {
        System.out.print(vehicle.getOwnerName() + "\t\t");
        System.out.print(vehicle.getBranch() + "\t\t");
        System.out.print(vehicle.getEngineCapacity() + "\t\t");
        System.out.print(vehicle.getVehiclePrice() + "\t\t");
        System.out.print(calculateTax(vehicle) + "\n");
    }

//    public static void enterData(Matrix matrix) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < matrix.getRows(); i++) {
//            for (int j = 0; j < matrix.getColumns(); j++) {
//                System.out.print("Nhập phần tử tại [" + (i + 1) + "][" + (j + 1) + "]: ");
//                int[][] data = null;
//                matrix.setData(data);
//            }
//        }
//        sc.close();
//    }
//
//    public static void displayMatrix(Matrix matrix) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < matrix.getRows(); i++) {
//            for (int j = 0; j < matrix.getColumns(); j++) {
//                System.out.print(matrix.getData() + "\t");
//            }
//            System.out.println();
//        }
//        sc.close();
//    }
}

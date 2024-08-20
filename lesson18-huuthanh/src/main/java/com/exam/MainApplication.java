package com.exam;

import service.InventoryService;
import service.InventoryServiceInterface;
import model.Item;
import model.Employee;
import model.Order;

import java.util.Date;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
        InventoryServiceInterface service = new InventoryService();

       
        List<Item> items = service.getItemsSoldOnDate(new Date());
        for (Item item : items) {
            System.out.println(item);  
        }

        
        double totalRevenue = service.getTotalRevenueOnDate(new Date());
        System.out.println("Total Revenue: " + totalRevenue);

        
        List<Employee> employeesWithHigherSalary = service.getEmployeesWithHigherSalary();
        for (Employee employee : employeesWithHigherSalary) {
            System.out.println(employee);
        }

        
        List<Order> topOrders = service.getTopItemsSoldInYear(2024);
        for (Order order : topOrders) {
            System.out.println(order);
        }
        
        

        service.close();  
    }
}

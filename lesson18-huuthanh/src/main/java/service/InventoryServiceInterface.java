package service;

import model.Item;
import model.Employee;
import model.Order;

import java.util.Date;
import java.util.List;

public interface InventoryServiceInterface {

    List<Item> getItemsSoldOnDate(Date date);
    
    double getTotalRevenueOnDate(Date date);

    List<Employee> getEmployeesWithHigherSalary();

    List<Order> getTopItemsSoldInYear(int year);
    
    
    
    

    void close();
}

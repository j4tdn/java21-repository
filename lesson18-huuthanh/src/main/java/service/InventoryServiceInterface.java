package service;

import model.Item;
import model.Employee;
import model.Order;

import java.util.Date;
import java.util.List;

// A ko thấy pattern nào đặt tên interface, class như này
public interface InventoryServiceInterface {

    List<Item> getItemsSoldOnDate(Date date);
    
    double getTotalRevenueOnDate(Date date);

    List<Employee> getEmployeesWithHigherSalary();

    List<Order> getTopItemsSoldInYear(int year);
    
    
    
    

    void close();
}

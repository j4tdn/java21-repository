package Ex04Manage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex04Demo {
    public static void main(String[] args) {
        // Tạo dữ liệu
        Director director = new Director(new BigDecimal("1.2")); // Giám đốc với hệ số chức vụ
        Manager manager1 = new Manager("Phòng A");
        Manager manager2 = new Manager("Phòng B");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Phòng A", manager1));
        employees.add(new Employee("Phòng A", manager1));
        employees.add(new Employee("Phòng A", manager1));
        employees.add(new Employee("Phòng B", manager2));
        employees.add(new Employee("Phòng B", manager2));
        employees.add(new Employee("Phòng B", manager2));

        // Hiển thị thông tin các nhân sự trong công ty
        System.out.println("Thông tin nhân sự trong công ty:");
        System.out.println("Giám đốc:");
        System.out.println(director);
        System.out.println("Trưởng phòng:");
        System.out.println(manager1);
        System.out.println(manager2);
        System.out.println("Nhân viên:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
        Map<String, Integer> managerEmployeeCount = new HashMap<>();
        for (Employee employee : employees) {
            String managerName = employee.getManager().getFaculty();
            managerEmployeeCount.put(managerName, managerEmployeeCount.getOrDefault(managerName, 0) + 1);
        }

        System.out.println("\nSố lượng nhân viên được quản lý bởi từng trưởng phòng:");
        for (String managerName : managerEmployeeCount.keySet()) {
            System.out.println(managerName + ": " + managerEmployeeCount.get(managerName) + " nhân viên");
        }

        // Tính và in ra mức lương của từng loại nhân sự
        System.out.println("\nMức lương của từng loại nhân sự:");
        for (Employee employee : employees) {
            BigDecimal salary = employee.tinhLuong();
            System.out.println(employee.getName() + ": " + salary);
        }
        System.out.println("Trưởng phòng: " + manager1.getName() + ": " + manager1.tinhLuong());
        System.out.println("Trưởng phòng: " + manager2.getName() + ": " + manager2.tinhLuong());
        System.out.println("Giám đốc: " + director.getName() + ": " + director.tinhLuong());
    }
}

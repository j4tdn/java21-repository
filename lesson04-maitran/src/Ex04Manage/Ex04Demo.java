package Ex04Manage;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ex04Demo {
    public static void main(String[] args) {
       Director director = new Director("Trần Trúc Mai",LocalDate.of(1898, 5, 2), bd(2.5), bd(2.5));
       
       Manager mg1 = new Manager("Lưu Văn Tùng", LocalDate.of(1898, 5, 2 ), bd(2), bd(2),"Bussiness Department" );
       Manager mg2 = new Manager("Hồ Văn Anh", LocalDate.of(1898, 5, 2 ), bd(2), bd(2),"HR Department" );
       
       Employee emp1 = new Employee("Ngọc Anh Tú", LocalDate.of(1898, 5, 2), bd(1.5), "HR Department", mg2);
       Employee emp2 = new Employee("Hà Kiều Anh", LocalDate.of(1898, 5, 2), bd(1.5), "Bussiness Department", mg1);
       Employee emp3 = new Employee("Tô Vĩnh Diện", LocalDate.of(1898, 5, 2), bd(1.5), "HR Department", mg2);
       Employee emp4 = new Employee("Búi Tá Điền", LocalDate.of(1898, 5, 2), bd(1.5), "Bussiness Department", mg1);
       Employee emp5 = new Employee("Cao Hoàng Đạt", LocalDate.of(1898, 5, 2), bd(1.5), "HR Department", mg2);
       Employee emp6 = new Employee("Bùi Anh Tuấn", LocalDate.of(1898, 5, 2), bd(1.5), "HR Department", mg2);
       
       HumanResources[] hrs = {director, mg1, mg2, emp1, emp2, emp3, emp4, emp5, emp6 };
       
       list(hrs);
       statistic(hrs, mg1, mg2);
       salary(hrs);
    }
    
//    Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
    
    
    private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
    
    public static void list(HumanResources[] hrs) {
    	for(HumanResources hr : hrs) {
    		System.out.println(hr);
    	}
    }
    
    public static void statistic(HumanResources[] employees, Manager mg1, Manager mg2) {
    	int countMg1 = 0, countMg2 = 0;
    	for(HumanResources employee : employees) {
    		if(employee instanceof Employee) {
    			if( ((Employee) employee).getManager() == mg1) {
    				countMg1++;  
    			} else if(((Employee) employee).getManager() == mg2) {
    				countMg2++;
    			}
    		}
    	}
    	System.out.println("\nNumber of employees managed by Manager 1: "  + countMg1);
    	System.out.println("Number of employees managed by Manage 2: "  + countMg2);
    }
    
    
    public static void salary(HumanResources[] hrs) {
    	System.out.println("\n");
    	System.out.printf("%-20s%-20s%10s\n", "ROLE", "NAME", "SALARY");
    	System.out.println("--------------------------------------------------------");
    	for (HumanResources hr : hrs) {
			System.out.println(hr.getClass().getName().substring(11) + " \t| " + hr.getName() + "\t\t | " + hr.calSalary());
		}
    }
    
}

package ex04quanlynhansu;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Staff> arr = new ArrayList<>();
		Director dr = new Director("Pham Thanh Vu", LocalDate.of(2003, 8, 4), BigDecimal.valueOf(100), BigDecimal.valueOf(25));
		System.out.println("--> Director: ");
		System.out.println(dr);
		System.out.println("Salary of Director " + dr.getName() + ": " + dr.countSalary());
		System.out.println("--------------------------------------------------------");

		System.out.println("\n==========================================================================\n");

		Manager m1 = new Manager("Vo Phuong Thanh", LocalDate.of(2003, 9, 22), BigDecimal.valueOf(70), BigDecimal.valueOf(15), "Marketing");
		Manager m2 = new Manager("Nguyen Thi Lan", LocalDate.of(1968, 12, 5), BigDecimal.valueOf(80), BigDecimal.valueOf(20), "Take care of customers");
		System.out.println("--> Manager: ");
		System.out.println(m1);
		System.out.println("Salary of Manager " + m1.getName() + ": " + m1.countSalary());
		
		System.out.println("--------------------------------------------------------");
		System.out.println(m2);
		System.out.println("Salary of Manager " + m2.getName() + ": " + m2.countSalary());
		
		System.out.println("--------------------------------------------------------");

		System.out.println("\n==========================================================================\n");

		Staff s1 = new Staff("Le Khanh Duc", LocalDate.of(2003, 10, 2), BigDecimal.valueOf(10), "Take care of customers", m2);
		Staff s2 = new Staff("Tran Tien Dung", LocalDate.of(2003, 1, 26), BigDecimal.valueOf(10), "Take care of customers", m2);
		Staff s3 = new Staff("Nguyen Duc Hoang Nam", LocalDate.of(2003, 11, 5), BigDecimal.valueOf(10), "Take care of customers", m2);
		Staff s4 = new Staff("Nguyen Gia Linh", LocalDate.of(2015, 2, 9), BigDecimal.valueOf(10), "Marketing", m1);
		Staff s5 = new Staff("Nguyen Linh Dan", LocalDate.of(2016, 2, 11), BigDecimal.valueOf(10), "Marketing", m1);
		Staff s6 = new Staff("Nguyen Truong Gia Han", LocalDate.of(2017, 11, 7), BigDecimal.valueOf(10), "Marketing", m1);

		System.out.println("--> Staff: ");
		System.out.println(s1);
		System.out.println("Salary of Staff " + s1.getName() + ": " + s1.countSalary());
		Management.addStaff(s1, arr);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(s2);
		System.out.println("Salary of Staff " + s2.getName() + ": " + s2.countSalary());
		Management.addStaff(s2, arr);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(s3);
		System.out.println("Salary of Staff " + s3.getName() + ": " + s3.countSalary());
		Management.addStaff(s3, arr);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(s4);
		System.out.println("Salary of Staff " + s4.getName() + ": " + s4.countSalary());
		Management.addStaff(s4, arr);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(s5);
		System.out.println("Salary of Staff " + s5.getName() + ": " + s5.countSalary());
		Management.addStaff(s5, arr);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(s6);
		System.out.println("Salary of Staff " + s6.getName() + ": " + s6.countSalary());
		Management.addStaff(s6, arr);
		
		System.out.println("--------------------------------------------------------");
		
		Management.countStaff(m1, arr);
		Management.countStaff(m2, arr);

		System.out.println("\n==========================================================================\n");
		

	}
}

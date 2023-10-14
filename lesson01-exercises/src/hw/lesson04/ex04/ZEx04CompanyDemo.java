package hw.lesson04.ex04;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class ZEx04CompanyDemo {
	
	public static void main(String[] args) {
		
		// Con của interface Comparable<T>
		
		// boxing, unboxing
		// Long, Integer, Double ... 
		// hỗ trợ + - * / tương tự kiểu nguyên thủy
		
		// BigDecimal
		// ko hỗ trợ + - * / tương tự kiểu nguyên thủy
		
		// Chung, so sánh giá trị số kiểu đối tượng
		// .compareTo
		
		BigDecimal b1 = BigDecimal.TEN;
		
		BigDecimal b2 = BigDecimal.valueOf(62);
		
		// if(b1 > b2)
		// if(b1 - b2) > 0
		// if(b1.compareTo(b2) > 0)
		
		System.out.println("b1.compareTo(b2) -> " + b1.compareTo(b2));
		if (b1.compareTo(b2) > 0) {
			System.out.println("hello --> +");
		} else {
			System.out.println("hello --> -");
		}
		
		Person[] staffs = mockData();
		
		generate("1. Hiển thị thông tin các nhân sự có trong công ty", staffs);
		
		// -------------------------------------------------
		
		Employee[] employees = getEmployees(staffs);
		
		Tuple[] tuples = statisticManagerAndStudents(employees);
		
		generate("2. Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng", tuples);
		
		// -------------------------------------------------
		
		printStaffSalaries("3. Tính và in ra mức lương của từng nhân sự", staffs);
	}
	
	private static void printStaffSalaries(String prefix, Person[] staffs) {
		System.out.println(prefix + " --> {");
		for(Person staff: staffs) {
			System.out.println("    " + staff.getFullname() + " --> " + staff.getSalary());
		}
		System.out.println("}");
	}
	
	/*
	 
	 Tính và in ra mức lương của từng loại nhân sự , biết rằng :
		Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
		Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
		Giám đốc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 300000
	 
	 */
	
	// Lấy danh sách các nhân viên từ mảng ban đầu chưa GD, TP, NV
	private static Employee[] getEmployees(Person[] staffs) {
		Employee[] employees = new Employee[staffs.length];
		int counter = 0;
		for (Person staff: staffs) {
			if (staff instanceof Employee) {
				employees[counter++] = (Employee)staff;
			}
		}
		return Arrays.copyOfRange(employees, 0, counter);
	}
	
	// Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
	// Kết quả trả về phải là
	//   M1 --> 3
	//   M2 --> 4
	// Phần này nếu sau các bạn có cấu trúc dữ liệu Map<K, V> code tiện hơn nhưng giờ chưa học
	// thì mình có thể code bằng cách lưu một mảng đối tượng
	
	// Tuple
	//   Manager Name :: Tên quản lý
	//   Int          :: Số lượng nhân viên quản lý
	
	// Chỉ truyền danh sách nhân viên là đủ, trong nhân viên có ttinh trưởng phòng rồi
	private static Tuple[] statisticManagerAndStudents(Employee[] employees) {
		// trường hợp tối đa là 1 nhân viên có 1 quản lý nên length tuples = length của employees
		Tuple[] tuples = new Tuple[employees.length];
		int counter = 0;
		
		for (Employee employee: employees) {
			// kiểm tra xem tuples đã chứa manager chưa
			String manager = employee.getManager().getFullname();
			Tuple tuple = getTuple(tuples, manager, counter);
			if (tuple == null) {
				// nếu chưa --> tạo 1 tuple mới với manager và số lượng nv là 1
				tuple = new Tuple(manager, 1);
				tuples[counter++] = tuple;
			} else {
				// nếu rồi --> tăng số lượng nhân viên + 1
				tuple.plusAmount();;
			}
		}
		
		return Arrays.copyOfRange(tuples, 0, counter);
	}
	
	private static Tuple getTuple(Tuple[] tuples, String checkedManager, int amountOfNonNulls) {
		for (int i = 0; i < amountOfNonNulls; i++) {
			Tuple tuple = tuples[i];
			if (checkedManager.equals(tuple.getManager())) {
				return tuple;
			}
		}
		return null;
	}
	
	private static void generate(String prefix, Tuple[] tuples) {
		System.out.println(prefix + " --> {");
		for(Tuple tuple: tuples) {
			System.out.println("    " + tuple);
		}
		System.out.println("}");
	}
	
	private static void generate(String prefix, Person[] staffs) {
		System.out.println(prefix + " --> {");
		for(Person staff: staffs) {
			System.out.println("    " + staff);
		}
		System.out.println("}");
	}
	
	//                  Hệ số lương   |  Hệ số chức vụ    
	// Giám đốc     :       5               3
	// Trưởng phòng :       3               2
	// Nhân viên    :       1               
	
	// Tạo dữ liệu gồm 1 Giám đốc, 2 Trưởng phòng, 6 Nhân viên
	// Lưu chung 1 mảng hoặc lưu riêng từng biến cũng được, tùy bài
	private static Person[] mockData() {
		President p = new President("PRA1", LocalDate.of(1990, 8, 20), 5, 3);
		
		Manager m1 = new Manager("M1", LocalDate.of(1992, 2, 12), 3, 2, "Department 1");
		Manager m2 = new Manager("M2", LocalDate.of(1992, 4, 18), 3, 2, "Department 2");
		
		Employee e1 = new Employee("E1", LocalDate.of(2000, 2, 2), 1, "Deparment 1", m1);
		Employee e2 = new Employee("E2", LocalDate.of(2001, 4, 4), 1, "Deparment 1", m1);
		Employee e3 = new Employee("E3", LocalDate.of(2002, 6, 6), 1, "Deparment 1", m1);
		
		Employee e4 = new Employee("E4", LocalDate.of(2000, 2, 2), 1, "Deparment 2", m2);
		Employee e5 = new Employee("E5", LocalDate.of(2001, 4, 4), 1, "Deparment 2", m2);
		Employee e6 = new Employee("E6", LocalDate.of(2002, 6, 6), 1, "Deparment 2", m2);
		Employee e7 = new Employee("E7", LocalDate.of(2002, 6, 6), 1, "Deparment 2", m2);
		
		return new Person[] { p, m1, m2, e1, e2, e3, e4, e5, e6, e7 };
	}
}

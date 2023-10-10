package ex04fixbyteacher;

import java.time.LocalDate;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		 Person[] staffs = mockData();
		 
		 generate("1. Hiển thị thông tin các nhân sự có trong công ty", staffs);
		 
		 Employee[] employees = getEmployees(staffs);
		 
		 Tuple[] tuples = statisticManagerAndStudent(employees);
		 
		 generate("2. Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng", tuples);
		 
		 prinStaffSalaries("3. Tính và in ra mức lương của từng nhân sự", staffs);
		 
	}
	
	private static Person[] mockData() {
		President p = new President("PRA1", LocalDate.of(1990, 8, 20), 5, 3);
		
		Manager m1 = new Manager("M1", LocalDate.of(1992, 2, 12), 3, 2, "Deparment 1");
		Manager m2 = new Manager("M2", LocalDate.of(1992, 4, 18), 3, 2, "Deparment 2");
		
		Employee e1 = new Employee("E1", LocalDate.of(2000, 2, 2), 1, "Deparment 1", m1);
		Employee e2 = new Employee("E2", LocalDate.of(2000, 4, 4), 1, "Deparment 1", m1);
		Employee e3 = new Employee("E3", LocalDate.of(2000, 6, 6), 1, "Deparment 1", m1);

		Employee e4 = new Employee("E4", LocalDate.of(2000, 2, 2), 1, "Deparment 2", m2);
		Employee e5 = new Employee("E5", LocalDate.of(2000, 4, 4), 1, "Deparment 2", m2);
		Employee e6 = new Employee("E6", LocalDate.of(2000, 6, 6), 1, "Deparment 2", m2);
		Employee e7 = new Employee("E7", LocalDate.of(2000, 6, 6), 1, "Deparment 2", m2);
		
		return new Person[] {p, m1, m2, e1, e2, e3, e4, e5, e6, e7};
	}
	
	private static void generate(String prefix, Person[] staffs) {
		System.out.println(prefix + "--> {");
		for(Person staff: staffs) {
			System.out.println("    " + staff);
		}
		System.out.println("}");
	}
	
	private static Employee[] getEmployees(Person[] staffs) {
		Employee[] employees = new Employee[staffs.length];
		int count = 0;
		for(Person staff: staffs) {
			if (staff instanceof Employee) {
				employees[count++] = (Employee) staff;
			}
		}
		return Arrays.copyOfRange(employees, 0, count);
		}
	
	private static Tuple[] statisticManagerAndStudent(Employee[] employees) {
		Tuple[] tuples = new Tuple[employees.length];
		int counter = 0;
		
		for(Employee employee: employees) {
			String manager = employee.getManager().getFullname();
			Tuple tuple = getTuple(tuples, manager, counter);
			if (tuple == null) {
				tuple = new Tuple(manager, 1);
				tuples[counter++] = tuple;
			}else {
				tuple.plusAmount();
			}
		}
		return Arrays.copyOfRange(tuples, 0, counter);
	}
	
	private static Tuple getTuple(Tuple[] tuples, String checkedManager, int amountOfNonnulls) {
		for(int i = 0; i < amountOfNonnulls; i++) {
			Tuple tuple = tuples[i];
			if (checkedManager.equals(tuple.getManager())) {
				return tuple;
			}
		}
		return null;
	}
	
	private static void generate(String prefix, Tuple[] tuples) {
		System.out.println(prefix + "--> {");
		for(Tuple tuple: tuples) {
			System.out.println("   " + tuple);
		}
		System.out.println("}");
	}
	
	private static void prinStaffSalaries(String prefix, Person[] staffs) {
		System.out.println(prefix + "--> {");
		for(Person staff: staffs) {
			System.out.println("   " + staff.getFullname() + "--> " + staff.getSalaryLevel());
		}
		System.out.println("}");
	}
	
}

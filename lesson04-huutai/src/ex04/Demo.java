package ex04;

import java.time.LocalDate;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		President president = new President("Vo Van Tam", LocalDate.of(1972, 2, 19), 4.3d, 3.3d);
		Manager manager1 = new Manager("Nguyen Thuy Dung", LocalDate.of(1992, 9, 10), 3.2d, 2.6d, "Phòng Marketing");
		Manager manager2 = new Manager("Mai Hai Nam", LocalDate.of(1993, 7, 15), 3.2d, 2.5d, "Phòng nhân sự");
		Employee employee1 = new Employee("Phan Tan Trung", LocalDate.of(1999, 12, 3), 2.1d, "Phòng nhân sự", manager2);
		Employee employee2 = new Employee("Vi Pham", LocalDate.of(2000, 1, 22), 2d, "Phòng nhân sự", manager2);
		Employee employee3 = new Employee("Phan Tuan Bao", LocalDate.of(2002, 10, 2), 2.1d, "Phòng nhân sự", manager2);
		Employee employee4 = new Employee("Phan Lan Anh", LocalDate.of(2002, 3, 16), 2.1d, "Phòng Marketing", manager1);
		Employee employee5 = new Employee("Kim Ho", LocalDate.of(2002, 11, 6), 2.1d, "Phòng Marketing", manager1);
		Employee employee6 = new Employee("Dao Duy Long", LocalDate.of(1999, 1, 4), 2.1d, "Phòng Marketing", manager1);
		
		Person[] persons = {president, manager1, manager2, employee1, employee2, employee3, employee4, employee5, employee6};
		System.out.println("Thông tin nhân sự trong công ty: ");
		show(persons);
		statistical(persons);
	}
	
	private static void show(Person[] persons) {
		for (Person person : persons) {
			System.out.println(person);
		}
	}
	
	private static void statistical(Person[] persons) {
		Employee[] employeese = new Employee[persons.length];
		Manager[] managers = new Manager[persons.length];
		int count1 = 0, count2 = 0;
		for (int i = 0; i < persons.length; i++) {
			if(persons[i] instanceof Employee) {
				employeese[count1] = (Employee) persons[i];
				count1++;
			}
		}
		
		for (int i = 0; i < persons.length; i++) {
			if(persons[i] instanceof Manager) {
				managers[count2] = (Manager) persons[i];
				count2++;
			}
		}
		
		employeese = Arrays.copyOfRange(employeese, 0, count1);
		managers = Arrays.copyOfRange(managers, 0, count2);
		
		for(Manager manager : managers) {
			int count = 0;
			for(Employee employee : employeese) {
				if(employee.getManager() == manager) {
					count++;
				}
			}
			System.out.println("Số nhân viên Trưởng phòng " + manager.getName() + "quản lý là: " + count);
		}
	}
}

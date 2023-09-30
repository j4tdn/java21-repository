package ex04;

import java.time.LocalDate;

public class CompanyApp {

	public static void main(String[] args) {
		
		Director boss = new Director("Nguyen Van A", LocalDate.of(2001, 03, 22), 3, 3);
		Manager manager1 = new Manager("Nguyen Van B", LocalDate.of(2002, 3, 23), 2, 2, "Home 1");
		Manager manager2 = new Manager("Nguyen Van C", LocalDate.of(2002, 4, 24), 2, 2, "Home 2");
		Employee emp1 = new Employee("Nguyen Thu 1", LocalDate.of(2004, 5, 26), 1, "Home 1", "Nguyen Van B");
		Employee emp2 = new Employee("Nguyen Thu 2", LocalDate.of(2004, 6, 27), 1, "Home 1", "Nguyen Van B");
		Employee emp3 = new Employee("Nguyen Thu 3", LocalDate.of(2004, 7, 28), 1, "Home 1", "Nguyen Van B");
		Employee emp4 = new Employee("Nguyen Thu 4", LocalDate.of(2004, 8, 29), 1, "Home 1", "Nguyen Van C");
		Employee emp5 = new Employee("Nguyen Thu 5", LocalDate.of(2004, 9, 30), 1, "Home 2", "Nguyen Van C");
		Employee emp6 = new Employee("Nguyen Thu 6", LocalDate.of(2004, 4, 10), 1, "Home 2", "Nguyen Van C");
		
		
		Human[] humans = {boss, manager1, manager2, emp1, emp2, emp3, emp4, emp5, emp6};
		amountPerson(humans);
		
		Employee[] employees = {emp1, emp2, emp3, emp4, emp5, emp6};
		
		System.out.println("so nhan vien dc quan ly boi B: " + numberEmployeeOfManager(manager1, employees));
		System.out.println("so nhan vien dc quan ly boi C: " + numberEmployeeOfManager(manager2, employees));
		
		salaryOfPerson(humans);
	}
	
	
	public static void amountPerson(Human[] humans) {
		for(Human human: humans) {
			System.out.println(human);
		}
	}
	
	public static int numberEmployeeOfManager(Manager m, Employee[] employees) {
		int count = 0;
		for(Employee employee: employees) {
			if(m.getDeparment().equals(employee.getDeparment())) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void salaryOfPerson(Human[] humans) {
		for(Human human: humans) {
			System.out.println("salary of " + human.getName() + " = " + human.calculateSalary());
		}
	}
	
}

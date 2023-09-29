package homework.bai4;

import java.time.LocalDate;

public class App04 {

	public static void main(String[] args) {
		President president = new President("Le Van An", LocalDate.of(1898, 5, 20), 3.3f, 2.5f);
		Manager manager1 = new Manager("Ho Cam Nhung", LocalDate.of(1996, 10, 9), 3f, 2.3f, "Phòng Marketing");
		Manager manager2 = new Manager("Nguyen Van Nheo", LocalDate.of(1995, 12, 5), 3f, 2.2f, "Phòng hành chính");
		Staff staff1 = new Staff("Nguyen Bao Binh", LocalDate.of(2000, 11, 6), 2f, "Phòng hành chính", manager2);
		Staff staff2 = new Staff("Nguyen Thi Ha", LocalDate.of(2000, 8, 26), 2f, "Phòng hành chính", manager2);
		Staff staff3 = new Staff("Tran Bao Tuan", LocalDate.of(2001, 11, 12), 2f, "Phòng hành chính", manager2);
		Staff staff4 = new Staff("Pham Van Hao", LocalDate.of(2003, 11, 6), 2f, "Phòng Marketing", manager1);
		Staff staff5 = new Staff("Luu Van Linh", LocalDate.of(2002, 8, 26), 2f, "Phòng Marketing", manager1);
		Staff staff6 = new Staff("Le Thanh Tuan", LocalDate.of(2001, 11, 12), 2f, "Phòng Marketing", manager1);

		Person[] persons = { president, manager1, manager2, staff1, staff2, staff3, staff4, staff5, staff6 };

		System.out.println("Thông tin các nhân sự có trong công ty\n");
		displayInfo(persons);

		// Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
		int countManager1 = 0;
		int countManager2 = 0;
		for (Person person : persons) {
			if (person instanceof Staff) {
				if (((Staff) person).getManager() == manager1) {
					countManager1++;
				} else if (((Staff) person).getManager() == manager2) {
					countManager2++;
				}
			}
		}
		System.out.println("\nSố lượng nhân viên được quản lý bởi Trưởng Phòng 1: " + countManager1);
		System.out.println("Số lượng nhân viên được quản lý bởi Trưởng Phòng 2: " + countManager2);

		System.out.println("\nMức lương của các nhân sự:\n");
		displaySalary(persons);
	}

	public static void displayInfo(Person[] persons) {
		for (Person person : persons) {
			System.out.println(person);
		}
	}

//	public static void quantityStatistics(Person[] persons, Manager manager1, Manager manager2) {
//		int countManager1 = 0;
//		int countManager2 = 0;
//		for (Person person : persons) {
//			if (person instanceof Staff) {
//				if (((Staff) person).getManager() == manager1) {
//					countManager1++;
//				} else if (((Staff) person).getManager() == manager2) {
//					countManager2++;
//				}
//			}
//		}
//	}

	public static void displaySalary(Person[] persons) {
		for (Person person : persons) {
			System.out.println("Lương của " + person.getFullName() + " là: " + person.calSalary());
		}
	}
}

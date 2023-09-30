package Ex04;

import java.time.LocalDate;

public class App04 {
	public static void main(String[] args) {
		Director dr1 = new Director("Trần Văn Dũng", LocalDate.of(1970, 8, 10), 3, 3);
		Manager mg1 = new Manager("Lê Thanh Thảo", LocalDate.of(1995, 3, 12), 2, 2, "Sale");
		Manager mg2 = new Manager("Nguyễn Công Thành", LocalDate.of(1990, 9, 6), 2, 2, "Marketing");
		Staff st1 = new Staff("Lê Thanh", LocalDate.of(1999, 5, 6), 1, "Marketing", mg1);
		Staff st2 = new Staff("Nguyễn Dũng", LocalDate.of(1996, 10, 12), 1, "Marketing", mg1);
		Staff st3 = new Staff("Trần Khải", LocalDate.of(1992, 10, 6), 1, "Marketing", mg1);
		Staff st4 = new Staff("Nguyễn Hân", LocalDate.of(1998, 9, 11), 1, "Marketing", mg2);
		Staff st5 = new Staff("Trần Chiến", LocalDate.of(1989, 1, 12), 1, "Marketing", mg2);
		Staff st6 = new Staff("Nguyễn Thanh Trâm", LocalDate.of(1990, 9, 6), 1, "Marketing", mg2);

		Person[] persons = { dr1, mg1, mg2, st1, st2, st3, st4, st5, st6 };
		
		//Hiển thị thông tin các nhân sự có trong công ty
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
		System.out.println("=================================================\n");
		//Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
		int staticMg1 = 0;
		int staticMg2 = 0;
	
		for (Person person : persons) {
			if (person instanceof Staff) {
				if (((Staff) person).getManager() == mg1) {
					staticMg1 += 1;
				} else {
					staticMg2 += 1;
				}
			}
			
			System.out.println("Lương của: " + person.getName() + " = " + person.salary());
			
		}
		
		System.out.println("=================================================\n");
		System.out.println("Nhân viên phòng 1: " + staticMg1);
		System.out.println("Nhân viên phòng 2: " + staticMg2);
		
		System.out.println("=================================================\n");
		

	}
}

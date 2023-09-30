package Ex01;

import java.util.Arrays;
import java.util.Scanner;

public class App01 {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Trương Hoàng Long", 10, 9);
		Student sv2 = new Student(2, "Nguyễn Văn Tuấn", 9, 10);
		Student sv3 = addStudent();

		Student[] students = { sv1, sv2, sv3 };
		
		Student[] resultA = filterStuA(students);
		Student[] resultTheory = filterStuTheory(students);
		
		System.out.println(Arrays.toString(resultA));
		System.out.println(Arrays.toString(resultTheory));
	}

	private static Student addStudent() {
		Student st = new Student();
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập mã sinh viên:");
		st.setId(ip.nextInt());
		ip.nextLine();
		
		System.out.println("Nhập họ và tên:");
		st.setName(ip.nextLine());
		
		System.out.println("Nhập điểm lý thuyết:");
		st.setTheoPoint(ip.nextFloat());
		
		System.out.println("Nhập điểm thực hành:");
		st.setPracPoint(ip.nextFloat());
		
		return st;
	}

	//4. Viết hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
	private static Student[] filterStuA(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (student.averagePoint() > 8.5) {
				result[count] = student;
				count++;
			}
		}
		return Arrays.copyOfRange(result,0, count);
	}
	
	//5. Viết hàm tìm thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành
	private static Student[] filterStuTheory(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (student.getTheoPoint() > student.getPracPoint()) {
				result[count] = student;
				count++;
			}
		}
		return Arrays.copyOfRange(result,0, count);
	}
}
